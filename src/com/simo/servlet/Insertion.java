package com.simo.servlet;

import com.simo.model.PersonBean;
import com.simo.resource.PersonResource;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by PS on 12/17/15.
 */
@WebServlet(name = "PersonServlet",urlPatterns = "insertPerson")
public class Insertion extends HttpServlet {

    @EJB
    PersonBean resource;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out=response.getWriter();

        resource.addPerson(1,"John Smith");

        out.println("<h1>User has been inserted in the database</h1>");

        out.close();
    }
}
