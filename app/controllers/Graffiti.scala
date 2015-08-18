package controllers

import play.api._
import play.api.mvc._
import play.api.libs.json

class Graffiti extends Controller {

    def add(lat: Long, long: Long, time: Long, dist: Long) = Action {
        Ok(views.html.index("Your new application is ready."))
    }

    def get(lat: Long, long: Long, dist: Long, start: Long, end: Long) = Action {
        Ok(views.html.index("Your new application is ready."))
    }
}