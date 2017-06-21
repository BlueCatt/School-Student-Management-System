/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lyu.controller;

import com.lyu.domain.Course;
import com.lyu.service.CommentService;
import com.lyu.service.CourseService;
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
public class goRemoveStudent extends HttpServlet {
 public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");;
        //String courseId=(String)request.getSession().getAttribute("courseId");
        
        //CourseService cs=new CourseService();
//                        Course course=cs.getCourseById(courseId);
//                        
//                        String courseName=course.getName();
//                        String courseInfo=course.getInfo();
//                        request.setAttribute("courseName", courseName);
//                        request.setAttribute("courseInfo", courseInfo);
        
//        String commentId=request.getParameter("commentId");
//        
//        CommentService c=new CommentService();
//        c.delete(commentId);
//        
//        String id=(String) request.getSession().getAttribute("courseId");
//        //再次把要显示的课程放入request
//            request.setAttribute("comments", c.showComments(id));
            
            
            String studentId=request.getParameter("id");
            
            StudentService ss=new StudentService();
            //ss.delete(studentId);
            
            ArrayList al=ss.getAllStudents();
                        
			request.setAttribute("students", al);
                  
			request.getRequestDispatcher("/studentForManager.jsp").forward(request, response);
            
            
			
        
        
      
        
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        this.doGet(request, response);
    }

}
