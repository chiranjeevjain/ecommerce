package services.impl

import com.google.gson.Gson
import com.mashape.unirest.http.Unirest
import crawlers.BeanStalkProducer
import services.MessageProducer

/**
 * Created by krishna on 6/3/15.
 */
class FlipkartMessageProducer extends MessageProducer{

  case class ApiList(url:String, name:String)

  override def generateMessages()= {
    val response = Unirest.get("https://affiliate-api.flipkart.net/affiliate/api/krishnate7.json").asJson().getBody.getObject
    val apiListings = response.getJSONObject("apiGroups").getJSONObject("affiliate").getJSONObject("apiListings")
    val keyArray = apiListings.keySet().toArray()

    val gson = new Gson()

    val obj = for(key <- keyArray) yield {
      val k = apiListings.getJSONObject(key.toString).getJSONObject("availableVariants").getJSONObject("v0.1.0")
      gson.toJson(new ApiList(k.getString("get"), k.getString("resourceName")))
    }

    beanStalkProducer.pushMessages(obj,"flipkart")
  }

  override val beanStalkProducer: BeanStalkProducer = new BeanStalkProducer(14711,"localhost")
}
