package services.impl

import java.util.zip.GZIPInputStream

import com.mashape.unirest.http.Unirest
import crawlers.BeanStalkProducer
import org.apache.commons.io.IOUtils
import services.MessageProducer

/**
 * Created by krishna on 6/15/15.
 */
class MyntraMessageProducer extends MessageProducer{

  override val beanStalkProducer: BeanStalkProducer = new BeanStalkProducer(14711,"localhost")

  override def generateMessages(): Unit = {

    val gzipStream:GZIPInputStream = new GZIPInputStream(Unirest.get("http://www.myntra.com/sitemap-index.xml.gz").asBinary().getBody)

    val response = IOUtils.toString(gzipStream,"UTF-8")

    val categoryUrls = parseXML(response,
                                "sitemap",
                                (response:String)=>scala.xml.XML.loadString(response),
                                (urlText:String)=>urlText.substring(urlText.lastIndexOf("/")+1,urlText.lastIndexOf(".xml")))
                      .filter(model => model.contains("sitemap-list-"))

    beanStalkProducer.pushMessages(categoryUrls,"myntra")
  }

}
