package controllers

import javax.inject.{Inject, Singleton}

import play.api.mvc.{AbstractController, ControllerComponents}
import services.{Counter, CustomService}

@Singleton
class CustomController @Inject()(cc: ControllerComponents,
                                 customService: CustomService) extends AbstractController(cc) {

  /**
    * Create an action that responds with the [[Counter]]'s current
    * count. The result is plain text. This `Action` is mapped to
    * `GET /count` requests by an entry in the `routes` config file.
    */
  def customCount = Action {
    Ok(customService.getName())
  }

  def showName(name: String) = Action {
    Ok(<message>customService.showName(name)</message>)
  }

}
