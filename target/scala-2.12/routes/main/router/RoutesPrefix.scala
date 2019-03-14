// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/PushpaSowjanya/Documents/crimes/backend/conf/routes
// @DATE:Thu Mar 14 10:00:05 IST 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
