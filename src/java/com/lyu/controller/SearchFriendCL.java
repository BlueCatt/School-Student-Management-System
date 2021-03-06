
package com.lyu.controller;

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
public class SearchFriendCL extends HttpServlet {

   
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");;
        
        
                        
                        //从session中取出name,并放入到request中.精妙！
                        String name=(String) request.getSession().getAttribute("name");
                        request.setAttribute("name", name);
                        
                        StudentService studentService=new StudentService();
			
                        
                        String s=request.getParameter("searchname");
                        
			ArrayList al=studentService.getStudentByName(s);
                        
                        request.setAttribute("SearchedFriends", al);
                        
                        
                        
                        
                        
                        
                        
			request.getRequestDispatcher("/showSearchedFriends.jsp").forward(request, response);
			
		
        
        
      
        
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        this.doGet(request, response);
    }

}
