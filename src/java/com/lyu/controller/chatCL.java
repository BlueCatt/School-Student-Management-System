/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lyu.controller;

import com.lyu.domain.Course;
import com.lyu.domain.Student;
import com.lyu.service.ChatService;
import com.lyu.service.CourseService;
import com.lyu.service.CommentService;
import com.lyu.service.MyCourses;
import com.lyu.service.StudentService;
import java.awt.print.Book;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ylyu
 */
public class chatCL extends HttpServlet {
    
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");;
        PrintWriter out = response.getWriter();
        
                        
                        //从session中取出name,并放入到request中.精妙！
                        String name=(String) request.getSession().getAttribute("name");
                        request.setAttribute("name", name);
                     
                        
                        String date=new java.util.Date().toString();
                        String message=(String)request.getParameter("message");
                        String sendId=(String)request.getParameter("sendId");
                        String getId=(String)request.getParameter("getId");
                       
                        ChatService cs=new ChatService();
                        cs.submitChat(sendId, getId, message, date);
                       
                        
    
			request.getRequestDispatcher("/chatOk.jsp").forward(request, response);
			
        
        
      
        
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        this.doGet(request, response);
    }
}

