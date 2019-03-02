// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/srivani/Documents/backend/conf/routes
// @DATE:Sat Mar 02 10:39:50 IST 2019


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
