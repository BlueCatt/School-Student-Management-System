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
public class loginCL extends HttpServlet {
    
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");;
        
        
        
        PrintWriter out = response.getWriter();
        
        if(request.getSession().getAttribute("student")!=null){
                        
                        //从session中取出name,并放入到request中.精妙！
                        String name=(String) request.getSession().getAttribute("name");
                        request.setAttribute("name", name);
                        
			request.getRequestDispatcher("/studentHome.jsp").forward(request, response);
			return;
		}
        
        
        
        String id = request.getParameter("id");
        String password = request.getParameter("password");
        
        

                //创建UserService对象，完成验证
        StudentService studentService = new StudentService();
        Student student = new Student();
        student.setId(Integer.parseInt(id));
        student.setPassword(password);

        //根据结果做处理
        if (studentService.checkUser(student)) {
            
            //因为在我们后面的其他页面都可能使用到用户信息，因此我们可以把用户信息存放到session中
            request.getSession().setAttribute("student", student);
            
            //为这个用户创建一个课程对象，并放到session中
            MyCourses myCourses=new MyCourses();
            request.getSession().setAttribute("myCourses", myCourses); 
            
            
            
            CourseService cs=new CourseService();
            ArrayList al=cs.getAllCourses();
            
            request.setAttribute("courses", al);
            
            //传递用户id
            request.getSession().setAttribute("id", id);
            
            //传递用户姓名
            String name=student.getLname()+""+student.getFname();
            request.getSession().setAttribute("name", name);

            request.setAttribute("name", name);
            
            request.getSession().setAttribute("myId", id);
            
            request.getRequestDispatcher("/studentHome.jsp").forward(request, response);
            
        } else {
            request.setAttribute("err", "User not found,try again!");
            request.getRequestDispatcher("/newjsp.jsp").forward(request, response);
        }
        
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        this.doGet(request, response);
    }
}

