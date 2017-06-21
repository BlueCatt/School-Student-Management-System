/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lyu.controller;

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author painter
 */
public class postCL extends HttpServlet {

     public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
                request.setCharacterEncoding("utf-8");
		
                PrintWriter out = response.getWriter();
                
		String title=request.getParameter("title");
                String text=request.getParameter("text");
                
                String time=new java.util.Date().toString();
                
                
                
                //到数据库中验证
                Connection ct=null;
                ResultSet rs=null;
                PreparedStatement ps=null;
                try{
                    //加载驱动
                    Class.forName("oracle.jdbc.OracleDriver");
                    
                    //得到链接
                     ct=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl", "test", "122588");
                    
                    //创建preparedstatement
                     ps=ct.prepareStatement("insert into announcement values(?,?,?)");
                     //给?赋值
                     ps.setObject(1, title);
                     ps.setObject(2, text);
                     ps.setObject(3, time);
                     
                    
                    //执行操作
                    rs=ps.executeQuery();
                    
                    //根据结果做处理
                    
                        request.getRequestDispatcher("/bbForManager.jsp").forward(request, response);
                        
                    
                        
                        
                        
                        
                        
                        
                }catch(Exception e) {
                    request.setAttribute("err", "Something wrong");
                        request.getRequestDispatcher("/postonBlackboard.jsp").forward(request, response);
                    e.printStackTrace();;
                    
                }finally{
                    //关闭资源
                    if(rs!=null){
                        try {
                            rs.close();
                        } catch (SQLException ex) {
                            Logger.getLogger(loginCL.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        rs=null;
                    }
                    if(ps!=null){
                        try {
                            ps.close();
                        } catch (SQLException ex) {
                            Logger.getLogger(loginCL.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        ps=null;
                    }
                    
                    if(ct!=null){
                        try {
                            ct.close();
                        } catch (SQLException ex) {
                            Logger.getLogger(loginCL.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        ct=null;
                    }
                    
                    
                }
                
                
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}
    
    
    
    
}