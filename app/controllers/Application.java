package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok("Test, meka pasange wadak,\n Ow, Ape Kassa Pasange wadak :P");
    }

}
