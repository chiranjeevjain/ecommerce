package services.impl

import com.mashape.unirest.http.Unirest
import crawlers.BeanStalkProducer
import services.MessageProducer

/**
 * Created by krishna on 6/9/15.
 */
class SnapdealMessageProducer extends MessageProducer{

  override val beanStalkProducer: BeanStalkProducer = new BeanStalkProducer(14711,"localhost")

  override def generateMessages(): Unit = {
    val response = Unirest.get("http://www.snapdeal.com/sitemap/sitemap.xml").asString().getBody
    val categoryUrlModels = parseXML(response,
                            "sitemap",
                            (response:String)=>scala.xml.XML.loadString(response),
                            (urlText:String)=>urlText.substring(urlText.lastIndexOf("/")+1,urlText.lastIndexOf(".xml")))
    beanStalkProducer.pushMessages(categoryUrlModels,"snapdeal")
  }
}
