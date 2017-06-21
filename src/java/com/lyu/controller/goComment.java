/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lyu.controller;

import com.lyu.domain.Course;
import com.lyu.domain.Student;
import com.lyu.service.CommentService;
import com.lyu.service.CourseService;
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
public class goComment extends HttpServlet {
    
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");;
        
        
                        
                        //从session中取出name,并放入到request中.精妙！
                        String name=(String) request.getSession().getAttribute("name");
                        request.setAttribute("name", name);
                        
                        
                        
                        
                        if(request.getSession().getAttribute("courseId")!=null){
                            
                            String id=(String) request.getSession().getAttribute("courseId");
                            CourseService cs=new CourseService();
                        Course course=cs.getCourseById(id);
                        
                        String courseName=course.getName();
                        String courseInfo=course.getInfo();
                        request.setAttribute("courseName", courseName);
                        request.setAttribute("courseInfo", courseInfo);
                        request.setAttribute("id", id);
                        CommentService commentService=new CommentService();
			ArrayList al=commentService.showComments(id);
                        
			//把要显示的数据放在request中，原因是因为request对象的生命周期最短
			request.setAttribute("comments", al);
                            
                        request.getRequestDispatcher("/courseComments.jsp").forward(request, response);
                        }
                        
                        
                        
                        
                        String id=request.getParameter("id");
                        request.getSession().setAttribute("courseId", id);
                        
                        CourseService cs=new CourseService();
                        Course course=cs.getCourseById(id);
                        
                        String courseName=course.getName();
                        String courseInfo=course.getInfo();
                        request.setAttribute("courseName", courseName);
                        request.setAttribute("courseInfo", courseInfo);
                        request.setAttribute("id", id);
                        
                        CommentService commentService=new CommentService();
			ArrayList al=commentService.showComments(id);
                        
			//把要显示的数据放在request中，原因是因为request对象的生命周期最短
			request.setAttribute("comments", al);
                        
                        
                        
                        
    
			request.getRequestDispatcher("/courseComments.jsp").forward(request, response);
			
        
        
      
        
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        this.doGet(request, response);
    }
}

