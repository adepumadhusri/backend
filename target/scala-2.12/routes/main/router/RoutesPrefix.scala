// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Madhu/Documents/crimes/backend/conf/routes
// @DATE:Mon Mar 25 13:59:13 IST 2019


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
