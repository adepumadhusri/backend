// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/polepallechennaharitha/Documents/crimes/backend/conf/routes
// @DATE:Sat Feb 23 15:02:38 IST 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseCountController CountController = new controllers.ReverseCountController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUserController UserController = new controllers.ReverseUserController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAsyncController AsyncController = new controllers.ReverseAsyncController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseCardController CardController = new controllers.ReverseCardController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseCountController CountController = new controllers.javascript.ReverseCountController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUserController UserController = new controllers.javascript.ReverseUserController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAsyncController AsyncController = new controllers.javascript.ReverseAsyncController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseCardController CardController = new controllers.javascript.ReverseCardController(RoutesPrefix.byNamePrefix());
  }

}
