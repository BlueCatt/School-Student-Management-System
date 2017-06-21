
package com.lyu.controller;

import com.lyu.service.CourseService;
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
public class goManagerCourse extends HttpServlet {
    
      
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");;
        
        
			CourseService courseService=new CourseService();
			ArrayList al=courseService.getAllCourses();
                        
			//把要显示的数据放在request中，原因是因为request对象的生命周期最短
			request.setAttribute("courses", al);
                        
                       
                        
   
                        
			request.getRequestDispatcher("/courseForManager.jsp").forward(request, response);

        
        
      
        
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        this.doGet(request, response);
    }

}
