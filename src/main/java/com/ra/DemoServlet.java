package com.ra;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "demoServlet",value = "/demo")
public class DemoServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("KHOI TAO NE");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("demo.jsp");
    }

    @Override
    public void destroy() {
        System.out.println("HUY");
    }
}
