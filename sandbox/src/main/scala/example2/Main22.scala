package example2

object Main22 extends App {

  // Poor man's SLF4J
  val Error = 1
  val Info  = 2
  val Debug = 3

  class Logger(level: Int) {
    def isError = level >= Error
    def isInfo  = level >= Info
    def isDebug = level >= Debug

    def error(msg: String) = if (isError) println("[ERROR] " + msg)
    def info (msg: String) = if (isInfo)  println("[INFO ] " + msg)
    def debug(msg: String) = if (isDebug) println("[DEBUG] " + msg)
  }

  // runtime configuration
  val logger = new Logger(Info)

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

  if (logger.isInfo)  logger.info( s"1st request headers: $headers")
  if (logger.isDebug) logger.debug(s"1st Request body: $body")
  if (logger.isInfo)  logger.info( s"2nd request headers: $headers")
  if (logger.isDebug) logger.debug(s"2nd request body: $body")

  println("Finished with Main22!")
}
