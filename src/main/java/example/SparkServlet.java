package example;

import spark.servlet.SparkFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

@WebFilter(urlPatterns = "/", initParams = {@WebInitParam(name = "applicationClass", value = "example.Routes")})
public class SparkServlet extends SparkFilter {
}
