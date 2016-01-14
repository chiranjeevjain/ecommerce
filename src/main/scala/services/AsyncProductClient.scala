package services

import java.util

import com.voodoo.server.models.ProductResponse
import com.voodoo.server.services.SearchService
import com.voodoo.server.models.Product

import scala.concurrent.duration._

import scala.concurrent.{Await, Future}

import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

/**
 * Created by krishna on 6/2/15.
 */
class AsyncProductClient(searchService: SearchService) {

  def classifyRequest(searchString:String, merchant:String)={

    val s = System.currentTimeMillis

    val productResponse = new ProductResponse

    val flipkartSearchResults:Future[util.ArrayList[Product]] = Future{
      searchService.searchFlipkartWebSite(searchString)
    }

    val amazonSearchResults:Future[util.ArrayList[Product]] = Future{
      searchService.searchAmazon(searchString)
    }

    val snapdealSearchResults:Future[util.ArrayList[Product]] = Future{
      searchService.searchSnapdeal(searchString)
    }

    flipkartSearchResults onComplete{
      case Success(value) => productResponse.getFlipkart.addAll(value)
      case Failure(e) => e.printStackTrace()
    }

    snapdealSearchResults onComplete{
      case Success(value) => productResponse.getSnapdeal.addAll(value)
      case Failure(e) => e.printStackTrace()
    }

    amazonSearchResults onComplete{
      case Success(value) => productResponse.getAmazon.addAll(value)
      case Failure(e) => e.printStackTrace()
    }

    Await.ready(amazonSearchResults, 5 second)
    Await.ready(snapdealSearchResults, 5 second)
    Await.ready(flipkartSearchResults, 5 second)

    merchant.toLowerCase() match {
      case "flipkart" => productResponse.getFlipkart.clear()
      case "amazon" => productResponse.getAmazon.clear()
      case "snapdeal" => productResponse.getSnapdeal.clear()
    }
    println(System.currentTimeMillis() -s+"**********************")
    productResponse
  }
}
