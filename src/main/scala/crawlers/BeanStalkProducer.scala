package crawlers

import com.surftools.BeanstalkClientImpl.ClientImpl

/**
 * Created by krishna on 6/3/15.
 */
class BeanStalkProducer(port:Int,host:String) {

  def pushMessage(message:String,tube:String)={
    val flipBeanStalk = new ClientImpl(host,port)
    flipBeanStalk.useTube(tube)
    flipBeanStalk.put(1,0,5,message.getBytes)
    flipBeanStalk.close()
  }

  def pushMessages(messages:Array[String],tube:String)={
    val flipBeanStalk = new ClientImpl(host,port)
    flipBeanStalk.useTube(tube)
    val status = messages.map(message => flipBeanStalk.put(1,0,5,message.getBytes))
    flipBeanStalk.close()
    status
  }

}
