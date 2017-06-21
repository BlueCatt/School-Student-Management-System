/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lyu.controller;

import com.lyu.domain.Student;
import com.lyu.service.CourseService;
import com.lyu.service.MyCourses;
import com.lyu.service.StudentService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author painter
 */
public class logoutCL extends HttpServlet {

   public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");;
            
        PrintWriter out = response.getWriter();
        
        request.getSession().invalidate();
        
        request.getRequestDispatcher("/newjsp.jsp").forward(request, response);
   
        
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        this.doGet(request, response);
    }
}
