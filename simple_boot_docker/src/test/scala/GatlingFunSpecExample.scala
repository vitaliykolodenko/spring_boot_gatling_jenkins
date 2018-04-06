import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.http.funspec.GatlingHttpFunSpec
class GatlingFunSpecExample extends GatlingHttpFunSpec {

  val baseURL = "http://localhost:8080"
  override def httpConf = super.httpConf.header("MyHeader", "MyValue")
  def pageHeader = css("h1")

  spec {
    http("Example index.html test")
      .get("/hi")
      .check(bodyString.is("Hi! Vitaliy"))
  }

}
