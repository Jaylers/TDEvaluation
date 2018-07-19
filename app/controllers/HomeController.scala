package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }
  def error404(path: String) = Action { implicit request: Request[AnyContent] =>
    NotFound(views.html.error404())
  }
}
