import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class BasicSimulation extends Simulation {
  val httpProtocol = http
    .baseURL("http://localhost:8080")
    .inferHtmlResources()
    .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8")
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("en-US,en;q=0.9")
    .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.162 Safari/537.36")

  val headers_0 = Map("Upgrade-Insecure-Requests" -> "1")

  val uri1 = "http://localhost:8080/hi"

  val scn = scenario("BasicDockerSimulation")
    .exec(http("request_0")
      .get("/hi")
      .headers(headers_0))

  setUp(scn.inject(atOnceUsers(100))).protocols(httpProtocol)
}