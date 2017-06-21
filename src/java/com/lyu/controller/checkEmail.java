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
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
/**
 *
 * @author ylyu
 */
public class checkEmail extends HttpServlet {
    
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");;
        
        
                        
                       String email=request.getParameter("email");
                       
                       String url="http://172.20.10.7:8080/NYIT1/login.jsp";
                       
                       
                       Properties properties = new Properties();
properties.setProperty("mail.transport.protocol", "smtp");//发送邮件协议
properties.setProperty("mail.smtp.auth", "true");//需要验证
 properties.setProperty("mail.debug", "true");//设置debug模式 后台输出邮件发送的过程
Session session = Session.getInstance(properties);
session.setDebug(true);//debug模式
//邮件信息

try{
Message messgae = new MimeMessage(session);
messgae.setFrom(new InternetAddress("973664893@qq.com"));//设置发送人
//messgae.setText("what's up man.");//设置邮件内容
messgae.setSubject("Comfirm mail.");//设置邮件主题
//messgae.setContent("<a href='"+url+"'>confirm</a>");
messgae.setContent("<a href='" + url + "'>"  +url+ "</a>go to sigh up", "text/html;charset=utf-8"); 
//发送邮件
Transport tran = session.getTransport();

 tran.connect("smtp.qq.com", 25, "973664893@qq.com", "13451882648ly123");//连接到QQ邮箱服务器
tran.sendMessage(messgae, new Address[]{ new InternetAddress(email)});//设置邮件接收人
tran.close();
}catch(Exception e){
    e.printStackTrace();
}

                       
                       
                       
                       
                       
                       
                       
    
			request.getRequestDispatcher("/emailOk.jsp").forward(request, response);
			
        
        
      
        
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        this.doGet(request, response);
    }
}

