package example;

import spark.Request;
import spark.Response;
import spark.Route;
import spark.servlet.SparkApplication;

import static spark.Spark.get;

public class Routes implements SparkApplication {
	@Override
	public void init() {
		get(new Route("/") {
			@Override
			public Object handle(Request request, Response response) {
				return "Hello world!";
			}
		});
	}
}
