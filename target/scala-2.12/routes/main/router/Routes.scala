// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Madhu/Documents/crimes/backend/conf/routes
// @DATE:Mon Feb 25 14:36:35 IST 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_2: controllers.HomeController,
  // @LINE:8
  CountController_0: controllers.CountController,
  // @LINE:10
  AsyncController_3: controllers.AsyncController,
  // @LINE:14
  Assets_5: controllers.Assets,
  // @LINE:15
  UserController_4: controllers.UserController,
  // @LINE:24
  CardController_1: controllers.CardController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_2: controllers.HomeController,
    // @LINE:8
    CountController_0: controllers.CountController,
    // @LINE:10
    AsyncController_3: controllers.AsyncController,
    // @LINE:14
    Assets_5: controllers.Assets,
    // @LINE:15
    UserController_4: controllers.UserController,
    // @LINE:24
    CardController_1: controllers.CardController
  ) = this(errorHandler, HomeController_2, CountController_0, AsyncController_3, Assets_5, UserController_4, CardController_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, CountController_0, AsyncController_3, Assets_5, UserController_4, CardController_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.UserController.getAllUsers()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/me""", """controllers.UserController.getCurrentUser()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.UserController.registerUser()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.UserController.signInUser()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.UserController.signOutUser()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/""" + "$" + """name<[^/]+>""", """controllers.UserController.deleteUserByName(name:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createcard""", """controllers.CardController.createCard()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """allnews""", """controllers.CardController.getAllCards()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_0.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """count""",
      """ An example controller showing how to use dependency injection""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_3.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """ An example controller showing how to write asynchronous code""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_5.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_UserController_getAllUsers4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_UserController_getAllUsers4_invoker = createInvoker(
    UserController_4.getAllUsers(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getAllUsers",
      Nil,
      "GET",
      this.prefix + """users""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_UserController_getCurrentUser5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/me")))
  )
  private[this] lazy val controllers_UserController_getCurrentUser5_invoker = createInvoker(
    UserController_4.getCurrentUser(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getCurrentUser",
      Nil,
      "GET",
      this.prefix + """users/me""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_UserController_registerUser6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_UserController_registerUser6_invoker = createInvoker(
    UserController_4.registerUser(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "registerUser",
      Nil,
      "POST",
      this.prefix + """register""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_UserController_signInUser7_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_UserController_signInUser7_invoker = createInvoker(
    UserController_4.signInUser(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "signInUser",
      Nil,
      "PUT",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_UserController_signOutUser8_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_UserController_signOutUser8_invoker = createInvoker(
    UserController_4.signOutUser(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "signOutUser",
      Nil,
      "PUT",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_UserController_deleteUserByName9_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_deleteUserByName9_invoker = createInvoker(
    UserController_4.deleteUserByName(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "deleteUserByName",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """users/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_CardController_createCard10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createcard")))
  )
  private[this] lazy val controllers_CardController_createCard10_invoker = createInvoker(
    CardController_1.createCard(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CardController",
      "createCard",
      Nil,
      "POST",
      this.prefix + """createcard""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_CardController_getAllCards11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("allnews")))
  )
  private[this] lazy val controllers_CardController_getAllCards11_invoker = createInvoker(
    CardController_1.getAllCards(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CardController",
      "getAllCards",
      Nil,
      "GET",
      this.prefix + """allnews""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:8
    case controllers_CountController_count1_route(params@_) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_0.count)
      }
  
    // @LINE:10
    case controllers_AsyncController_message2_route(params@_) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_3.message)
      }
  
    // @LINE:14
    case controllers_Assets_versioned3_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_5.versioned(path, file))
      }
  
    // @LINE:15
    case controllers_UserController_getAllUsers4_route(params@_) =>
      call { 
        controllers_UserController_getAllUsers4_invoker.call(UserController_4.getAllUsers())
      }
  
    // @LINE:16
    case controllers_UserController_getCurrentUser5_route(params@_) =>
      call { 
        controllers_UserController_getCurrentUser5_invoker.call(UserController_4.getCurrentUser())
      }
  
    // @LINE:17
    case controllers_UserController_registerUser6_route(params@_) =>
      call { 
        controllers_UserController_registerUser6_invoker.call(UserController_4.registerUser())
      }
  
    // @LINE:18
    case controllers_UserController_signInUser7_route(params@_) =>
      call { 
        controllers_UserController_signInUser7_invoker.call(UserController_4.signInUser())
      }
  
    // @LINE:19
    case controllers_UserController_signOutUser8_route(params@_) =>
      call { 
        controllers_UserController_signOutUser8_invoker.call(UserController_4.signOutUser())
      }
  
    // @LINE:20
    case controllers_UserController_deleteUserByName9_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_UserController_deleteUserByName9_invoker.call(UserController_4.deleteUserByName(name))
      }
  
    // @LINE:24
    case controllers_CardController_createCard10_route(params@_) =>
      call { 
        controllers_CardController_createCard10_invoker.call(CardController_1.createCard())
      }
  
    // @LINE:25
    case controllers_CardController_getAllCards11_route(params@_) =>
      call { 
        controllers_CardController_getAllCards11_invoker.call(CardController_1.getAllCards())
      }
  }
}
