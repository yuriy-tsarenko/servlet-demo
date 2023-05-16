package com.goit.servlet;

import com.goit.crud.entity.CustomerEntity;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

//@WebServlet(value = "/demo")
public class DemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CustomerEntity customer = CustomerEntity.of(1L, "Name", "contact", "Ukraine");
        Gson gson = new GsonBuilder()
                .serializeNulls()
                .setPrettyPrinting()
                .create();
        resp.setContentType("application/json; charset=utf-8");
        resp.getWriter().write(gson.toJson(customer));
        resp.getWriter().close();
    }
}
