package examples.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/annotated")
public class HelloAnnotatedServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String protocol = req.getProtocol();
        resp.getWriter().write("HelloAnnotatedServlet : [" + protocol + "]\n");
        resp.getWriter().write("RequestURI : [" + req.getRequestURI() + "]");
    }
}


