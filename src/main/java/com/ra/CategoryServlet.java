package com.ra;

import com.ra.model.entity.Category;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "categoryServlet",value = "/category")
public class CategoryServlet extends HttpServlet {
    private static final List<Category> categories = new ArrayList<>();
    @Override
    public void init() throws ServletException {
       categories.add(new Category(1,"Áo 3 lỗ",true));
       categories.add(new Category(2,"Áo 4 l",true));
       categories.add(new Category(3,"Áo rách jack",false));
       categories.add(new Category(4,"Áo Son Tung",false));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String action = req.getParameter("action");
        if(action != null){
            switch (action){
                case "add":
                    req.getRequestDispatcher("add-category.jsp").forward(req,resp);
                    break;
                case "update":
                    break;
                case "delete":
                    break;
                default:
            }
        } else {
            req.setAttribute("categories",categories);
            req.getRequestDispatcher("category.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("category");
        boolean status = Boolean.parseBoolean(req.getParameter("categoryStatus"));
        categories.add(new Category(id,name,status));
        doGet(req,resp);
    }
}
