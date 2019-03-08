// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/polepallechennaharitha/Documents/crimes/backend/conf/routes
// @DATE:Fri Mar 08 10:39:05 IST 2019

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
  Assets_6: controllers.Assets,
  // @LINE:15
  UserController_4: controllers.UserController,
  // @LINE:24
  CardController_1: controllers.CardController,
  // @LINE:27
  RegisCrimeController_5: controllers.RegisCrimeController,
  // @LINE:32
  ImagesController_7: controllers.ImagesController,
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
    Assets_6: controllers.Assets,
    // @LINE:15
    UserController_4: controllers.UserController,
    // @LINE:24
    CardController_1: controllers.CardController,
    // @LINE:27
    RegisCrimeController_5: controllers.RegisCrimeController,
    // @LINE:32
    ImagesController_7: controllers.ImagesController
  ) = this(errorHandler, HomeController_2, CountController_0, AsyncController_3, Assets_6, UserController_4, CardController_1, RegisCrimeController_5, ImagesController_7, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, CountController_0, AsyncController_3, Assets_6, UserController_4, CardController_1, RegisCrimeController_5, ImagesController_7, prefix)
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
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.UserController.signOutUser(token:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/""" + "$" + """name<[^/]+>""", """controllers.UserController.deleteUserByName(name:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createcard""", """controllers.CardController.createCard()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """allnews""", """controllers.CardController.getAllCards()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """registerCrime""", """controllers.RegisCrimeController.registerCrime()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newsFeed""", """controllers.RegisCrimeController.getAllNews()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewmorebutton""", """controllers.RegisCrimeController.getAll10()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """crimedetails""", """controllers.RegisCrimeController.getRelavantCrimes(crimetype:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """images""", """controllers.ImagesController.uploadImage()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """images""", """controllers.ImagesController.downloadImage(id:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """images""", """controllers.ImagesController.deleteImage(id:String)"""),
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
    Assets_6.versioned(fakeValue[String], fakeValue[Asset]),
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
    UserController_4.signOutUser(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "signOutUser",
      Seq(classOf[String]),
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

  // @LINE:27
  private[this] lazy val controllers_RegisCrimeController_registerCrime12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("registerCrime")))
  )
  private[this] lazy val controllers_RegisCrimeController_registerCrime12_invoker = createInvoker(
    RegisCrimeController_5.registerCrime(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RegisCrimeController",
      "registerCrime",
      Nil,
      "POST",
      this.prefix + """registerCrime""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_RegisCrimeController_getAllNews13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newsFeed")))
  )
  private[this] lazy val controllers_RegisCrimeController_getAllNews13_invoker = createInvoker(
    RegisCrimeController_5.getAllNews(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RegisCrimeController",
      "getAllNews",
      Nil,
      "GET",
      this.prefix + """newsFeed""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_RegisCrimeController_getAll1014_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewmorebutton")))
  )
  private[this] lazy val controllers_RegisCrimeController_getAll1014_invoker = createInvoker(
    RegisCrimeController_5.getAll10(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RegisCrimeController",
      "getAll10",
      Nil,
      "GET",
      this.prefix + """viewmorebutton""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_RegisCrimeController_getRelavantCrimes15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("crimedetails")))
  )
  private[this] lazy val controllers_RegisCrimeController_getRelavantCrimes15_invoker = createInvoker(
    RegisCrimeController_5.getRelavantCrimes(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RegisCrimeController",
      "getRelavantCrimes",
      Seq(classOf[String]),
      "GET",
      this.prefix + """crimedetails""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_ImagesController_uploadImage16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("images")))
  )
  private[this] lazy val controllers_ImagesController_uploadImage16_invoker = createInvoker(
    ImagesController_7.uploadImage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ImagesController",
      "uploadImage",
      Nil,
      "POST",
      this.prefix + """images""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_ImagesController_downloadImage17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("images")))
  )
  private[this] lazy val controllers_ImagesController_downloadImage17_invoker = createInvoker(
    ImagesController_7.downloadImage(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ImagesController",
      "downloadImage",
      Seq(classOf[String]),
      "GET",
      this.prefix + """images""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_ImagesController_deleteImage18_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("images")))
  )
  private[this] lazy val controllers_ImagesController_deleteImage18_invoker = createInvoker(
    ImagesController_7.deleteImage(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ImagesController",
      "deleteImage",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """images""",
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
        controllers_Assets_versioned3_invoker.call(Assets_6.versioned(path, file))
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
      call(params.fromQuery[String]("token", None)) { (token) =>
        controllers_UserController_signOutUser8_invoker.call(UserController_4.signOutUser(token))
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
  
    // @LINE:27
    case controllers_RegisCrimeController_registerCrime12_route(params@_) =>
      call { 
        controllers_RegisCrimeController_registerCrime12_invoker.call(RegisCrimeController_5.registerCrime())
      }
  
    // @LINE:28
    case controllers_RegisCrimeController_getAllNews13_route(params@_) =>
      call { 
        controllers_RegisCrimeController_getAllNews13_invoker.call(RegisCrimeController_5.getAllNews())
      }
  
    // @LINE:29
    case controllers_RegisCrimeController_getAll1014_route(params@_) =>
      call { 
        controllers_RegisCrimeController_getAll1014_invoker.call(RegisCrimeController_5.getAll10())
      }
  
    // @LINE:30
    case controllers_RegisCrimeController_getRelavantCrimes15_route(params@_) =>
      call(params.fromQuery[String]("crimetype", None)) { (crimetype) =>
        controllers_RegisCrimeController_getRelavantCrimes15_invoker.call(RegisCrimeController_5.getRelavantCrimes(crimetype))
      }
  
    // @LINE:32
    case controllers_ImagesController_uploadImage16_route(params@_) =>
      call { 
        controllers_ImagesController_uploadImage16_invoker.call(ImagesController_7.uploadImage())
      }
  
    // @LINE:33
    case controllers_ImagesController_downloadImage17_route(params@_) =>
      call(params.fromQuery[String]("id", None)) { (id) =>
        controllers_ImagesController_downloadImage17_invoker.call(ImagesController_7.downloadImage(id))
      }
  
    // @LINE:34
    case controllers_ImagesController_deleteImage18_route(params@_) =>
      call(params.fromQuery[String]("id", None)) { (id) =>
        controllers_ImagesController_deleteImage18_invoker.call(ImagesController_7.deleteImage(id))
      }
  }
}
