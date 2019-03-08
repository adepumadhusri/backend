// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/polepallechennaharitha/Documents/crimes/backend/conf/routes
// @DATE:Thu Mar 07 15:06:38 IST 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:14
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:27
  class ReverseRegisCrimeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def getRelavantCrimes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RegisCrimeController.getRelavantCrimes",
      """
        function(crimetype0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "crimedetails" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("crimetype", crimetype0)])})
        }
      """
    )
  
    // @LINE:28
    def getAllNews: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RegisCrimeController.getAllNews",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newsFeed"})
        }
      """
    )
  
    // @LINE:29
    def getAll10: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RegisCrimeController.getAll10",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "viewmorebutton"})
        }
      """
    )
  
    // @LINE:27
    def registerCrime: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RegisCrimeController.registerCrime",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "registerCrime"})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def getCurrentUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getCurrentUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/me"})
        }
      """
    )
  
    // @LINE:20
    def deleteUserByName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.deleteUserByName",
      """
        function(name0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "users/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("name", name0))})
        }
      """
    )
  
    // @LINE:18
    def signInUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.signInUser",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:17
    def registerUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.registerUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
    // @LINE:19
    def signOutUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.signOutUser",
      """
        function(token0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "logout" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("token", token0)])})
        }
      """
    )
  
    // @LINE:15
    def getAllUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getAllUsers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }

  // @LINE:24
  class ReverseCardController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def createCard: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CardController.createCard",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "createcard"})
        }
      """
    )
  
    // @LINE:25
    def getAllCards: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CardController.getAllCards",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "allnews"})
        }
      """
    )
  
  }

  // @LINE:32
  class ReverseImagesController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:33
    def downloadImage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ImagesController.downloadImage",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "images/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:34
    def deleteImage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ImagesController.deleteImage",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "images/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:32
    def uploadImage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ImagesController.uploadImage",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "images"})
        }
      """
    )
  
  }


}
