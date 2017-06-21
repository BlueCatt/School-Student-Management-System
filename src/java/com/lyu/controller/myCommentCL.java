/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lyu.controller;

import com.lyu.domain.Course;
import com.lyu.domain.Student;
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
public class myCommentCL extends HttpServlet {
    
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");;
        PrintWriter out = response.getWriter();
        
                        
                        //从session中取出name,并放入到request中.精妙！
                        String name=(String) request.getSession().getAttribute("name");
                        request.setAttribute("name", name);
                        
                        /*
                        StudentService studentService=new StudentService();
			ArrayList al=studentService.getAllStudents();
                        
			//把要显示的数据放在request中，原因是因为request对象的生命周期最短
			request.setAttribute("students", al);
                        
                        */
                        //String courseId=(String) request.getSession().getAttribute("courseId");
                        
                        String date=new java.util.Date().toString();
                        String comment=(String)request.getParameter("myComment");
                        String c_id=(String)request.getParameter("id");
                        String s_id=(String)request.getSession().getAttribute("id");
                       
                        
                        CommentService cos=new CommentService();
                        cos.submitComment(s_id, c_id, comment, date);
                       
                        
    
			request.getRequestDispatcher("/goComment").forward(request, response);
			
        
        
      
        
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        this.doGet(request, response);
    }
}

