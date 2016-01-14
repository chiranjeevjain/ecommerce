import com.google.gson.Gson
import com.voodoo.server.services.impl.SearchServiceImpl
import io.undertow.server.{HttpHandler, HttpServerExchange}
import io.undertow.{Handlers, Undertow}
import services.impl.{MyntraMessageProducer, SnapdealMessageProducer, FlipkartMessageProducer}
import services.{AsyncProductClient, MessageProducer}

/**
 * Created by krishna on 5/27/15.
 */
object Server extends App{

  val server: Undertow = Undertow.builder().addHttpListener(8080, "0.0.0.0")
    .setHandler(Handlers.path().addPrefixPath("/api/products", new JsonHandler).addPrefixPath("/queue", new BeanStalkHandler))
    .setWorkerThreads(200).build()

  val gson = new Gson()

  class JsonHandler extends HttpHandler{
    override def handleRequest(exchange: HttpServerExchange): Unit = {
      if(exchange.isInIoThread){
        exchange.dispatch(this)
        return
      }

      val queryParams = exchange.getQueryParameters

      if(!queryParams.containsKey("title") && !queryParams.containsKey("merchant")){
        exchange.getResponseSender.send("{\"status\":\"400\",\"error\":\"Requires title and merchant query parameters\"}")
        return
      }

      val searchService = new SearchServiceImpl
      val asyncProductClient = new AsyncProductClient(searchService)

      val title:String = queryParams.get("title").getFirst
      val merchant:String = queryParams.get("merchant").getFirst
      exchange.getResponseSender.send(gson.toJson(asyncProductClient.classifyRequest(title,merchant)))
    }
  }

  class BeanStalkHandler extends HttpHandler{
    override def handleRequest(exchange: HttpServerExchange): Unit = {
      if(exchange.isInIoThread){
        exchange.dispatch(this)
        return
      }

      val queryParams = exchange.getQueryParameters

      if(!queryParams.containsKey("merchant")){
        exchange.getResponseSender.send("{\"status\":\"400\",\"error\":\"Requires merchant query parameter to start crawling\"}")
        return
      }

      val merchant = queryParams.get("merchant").getFirst
      merchant match {
        case "flipkart" => {
          val messageProducer:MessageProducer = new FlipkartMessageProducer
          messageProducer.generateMessages()
        }
        case "snapdeal" => {
          val messageProducer:MessageProducer = new SnapdealMessageProducer
          messageProducer.generateMessages()
        }
        case "myntra" => {
          val messageProducer:MessageProducer = new MyntraMessageProducer
          messageProducer.generateMessages()
        }
      }
      exchange.getResponseSender.send("Done!!")
    }
  }

  server.start()
}