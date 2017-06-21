/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lyu.controller;

import com.lyu.domain.Manager;
import com.lyu.util.SqlHelper;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author painter
 */
public class managerLoginCL extends HttpServlet {
 public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
                request.setCharacterEncoding("utf-8");
                
                PrintWriter out = response.getWriter();
		
                if(request.getSession().getAttribute("manager")!=null){
                        
                        //从session中取出id,并放入到request中.精妙！
                        String id=(String) request.getSession().getAttribute("managerId");
                        request.setAttribute("managerId", id);
                        
			request.getRequestDispatcher("/managerHome.jsp").forward(request, response);
			return;
		}
                
                
                
                String id=request.getParameter("id");
                String password=request.getParameter("password");
                
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
                     ps=ct.prepareStatement("Select * from manager where M_ID=? and M_PASSWORD=?");
                     //给?赋值
                     ps.setObject(1, id);
                     ps.setObject(2, password);
                    
                    //执行操作
                    rs=ps.executeQuery();
                    
                    //根据结果做处理
                    if(rs.next()){
                        
                        Manager m= new Manager();
                        m.setId(Integer.parseInt(id));
                        request.getSession().setAttribute("manager", m);
                        request.getSession().setAttribute("managerId", id);
                        
                        request.setAttribute("managerId", id);
                        
                        
                        
                        
                        
                        
                        request.getRequestDispatcher("/managerHome.jsp").forward(request, response);
                        //response.sendRedirect("/UsersSystem2/managerHome");
                        
                    }else{
                        request.setAttribute("err", "User not found");
                        request.getRequestDispatcher("/managerLogin.jsp").forward(request, response);
                    }
                }catch(Exception e) {
                        request.setAttribute("err", "Your id should be number");
                        request.getRequestDispatcher("/managerLogin.jsp").forward(request, response);
                    e.printStackTrace();
                    
                }finally{
                    //关闭资源
                    
                    SqlHelper.close(rs, ps, ct);
                    
                    
                }
             
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}
    }