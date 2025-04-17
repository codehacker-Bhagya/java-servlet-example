package com.bhagya.practice.servlet.controller;

import com.bhagya.practice.servlet.service.HelloService;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class HelloController extends HttpServlet {

    HelloService helloService = new HelloService();


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("====inside the doGet() method======");

       String name = request.getParameter("full name");
        response.setContentType("text/html");
       PrintWriter writer = response.getWriter();
       writer.println("<html><boby>");
       writer.println("<h1>" + helloService.greet(name) + "</h1>" );
       writer.println("</body><html>");

    }

    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("====inside the service() method======");
        this.doGet(request, response);
    }

    public void destroy(HttpServletRequest request , HttpServletResponse response) throws IOException {
        System.out.println("======== inside the destroy() method =======");
    }



}
