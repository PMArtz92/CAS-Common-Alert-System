package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

import static play.data.Form.*;


public class Application extends Controller {

    public static Result index() {
        return ok(index.render("CAS"));
    }

    public static Result login() {
        return ok(
                login.render()
        );
    }
}
