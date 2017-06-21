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
public class CourseCL extends HttpServlet {
    
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");;
        
        
        
        //接受type值，区分要处理的事物
        String type=request.getParameter("type");
        //接受课程id
        String id=request.getParameter("id");
        
        if("del".equals(type)){
            
            //得到购物车
            MyCourses myCourses=(MyCourses) request.getSession().getAttribute("myCourses");
            myCourses.deleteCourse(id);
            
            //再次把要显示的课程放入request\
            request.setAttribute("courseList", myCourses.showMyCourse());
            
            String name=(String)request.getSession().getAttribute("name");
            request.setAttribute("name", name);
            
            //跳回
            request.getRequestDispatcher("/myCourses.jsp").forward(request, response);
        }
        else if("add".equals(type)){    
        
            //取出购物车并添加课程到购物车
        MyCourses myCourses=(MyCourses)request.getSession().getAttribute("myCourses");
        
        myCourses.addCourse(id, new CourseService().getCourseById(id));
        
        //把要显示的数据放入request, 准备显示
        request.setAttribute("courseList", myCourses.showMyCourse());
        
        String name=(String)request.getSession().getAttribute("name");
        request.setAttribute("name", name);
        
        //跳转到显示我的课程去
        request.getRequestDispatcher("/myCourses.jsp").forward(request, response);
        }
        else if("confirm".equals(type)){
            MyCourses myCourses=(MyCourses)request.getSession().getAttribute("myCourses");
            ArrayList al=myCourses.showMyCourse();
            
            request.getRequestDispatcher("/addCourseComplete.jsp").forward(request, response);
            
        }else if("show".equals(type)){
            MyCourses myCourses=(MyCourses)request.getSession().getAttribute("myCourses");
            
            //把要显示的数据放入request, 准备显示
        request.setAttribute("courseList", myCourses.showMyCourse());
        
        String name=(String)request.getSession().getAttribute("name");
        request.setAttribute("name", name);
        
        //跳转到显示我的课程去
        request.getRequestDispatcher("/myCourses.jsp").forward(request, response);
        
        }
        
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        this.doGet(request, response);
    }
}

