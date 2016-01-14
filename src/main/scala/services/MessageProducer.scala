package services

import com.google.gson.Gson
import crawlers.BeanStalkProducer

import scala.xml.Elem

/**
 * Created by krishna on 6/3/15.
 */
trait MessageProducer{

  val beanStalkProducer:BeanStalkProducer

  case class CategoryModel(name:String,url:String)

  def generateMessages()

  val gson = new Gson()

  val parseXML = (response:String, tag:String,f:String => Elem,nameExtractor:String=>String)=>{
    val locSequence = f(response)\tag\"loc"
    locSequence.map(url => gson.toJson(new CategoryModel(nameExtractor(url.text),url.text))).toArray
  }
}
