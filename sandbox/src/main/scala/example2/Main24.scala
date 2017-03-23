package example2

import com.typesafe.scalalogging.LazyLogging

object Main24 extends App with LazyLogging {
  def headers = """
Content-Encoding: gzip
Content-Type: text/html; charset=UTF-8
Transfer-Encoding: chunked
"""

  def body = {
    println("Starting to calculate body ...")
    Thread.sleep(1000)
    println("Man this body calc takes a while!")
    Thread.sleep(3000)
    println("Finished calculating body!")
    "EXAMPLE BODY " * 10
  }

  logger.info( s"1st request headers: $headers")
  logger.debug(s"1st Request body: $body")
  logger.info( s"2nd request headers: $headers")
  logger.debug(s"2nd request body: $body")

  println("Finished with Main24!")
}
