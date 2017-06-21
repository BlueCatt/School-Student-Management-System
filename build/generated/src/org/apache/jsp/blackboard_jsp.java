package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class blackboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("        <link href=\"css/MainFrame.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("                ");

                        Connection ct=null;
                        ResultSet rs=null;
                        PreparedStatement ps=null; 
                
      out.write("\n");
      out.write("                \n");
      out.write("\t\t");

                        String name=(String)request.getAttribute("name");
                
      out.write("\n");
      out.write("                        \n");
      out.write("                <body background='img/bg.jpg'>\n");
      out.write("                <span class='div1'><Strong>Welcome to NYIT Student Square</Strong></span>\n");
      out.write("                <span class=\"name\">");
      out.print(name );
      out.write("</span>\n");
      out.write("                &nbsp;&nbsp;<span><a href=\"/NYIT1/goMyMessage\"><img src=\"img/tubiao.jpg\" width=\"20px\"></a></span>\n");
      out.write("                <span class='div2'><a href='/NYIT1/index.jsp'>Log Out</a></span><hr/>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <div class=\"div3\">\n");
      out.write("                <table border=\"1\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th><a href='/NYIT1/loginCL'>Home</a></th>\n");
      out.write("                        <th><a href='/NYIT1/goFriends'>Friends</a></th>\n");
      out.write("                        <th><a href='/NYIT1/goBlackboard'>Blackboard</a></th>\n");
      out.write("                        <th><a href='/NYIT1/showCourses'>Courses</a></th>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                ");

                try{
                    Class.forName("oracle.jdbc.OracleDriver");
                    
                    ct=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl", "test", "122588");
                   
                    ps=ct.prepareStatement("Select * from announcement order by time desc");
                    
                    rs=ps.executeQuery();
                    
                    
      out.write("\n");
      out.write("                    \n");
      out.write("                    <h2>Here are the important news you need to be aware.</h2>\n");
      out.write("                    \n");
      out.write("                    <div class='div4'>\n");
      out.write("                    <table border=1px bordercolor=gray cellspacing=0 width=1100px>\n");
      out.write("                    <tr><th>Title</th><th width=300px> Time </th></tr>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    ");

                    while(rs.next()){
                        
      out.write("\n");
      out.write("                        \n");
      out.write("                        <tr><td>");
      out.print(rs.getString(1));
      out.write("</td><td>");
      out.print(rs.getString(3));
      out.write("</td><tr>\n");
      out.write("                            \n");
      out.write("                    ");
        
                    }
                    
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    ");

                }catch(Exception e){
                    
                }
                
                
                finally{
                    if(rs!=null){
                        try {
                            rs.close();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                        rs=null;
                    }
                    if(ps!=null){
                        try {
                            ps.close();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                        ps=null;
                    }
                    
                    if(ct!=null){
                        try {
                            ct.close();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                        ct=null;
                    }
                    
                }
 
                
      out.write("\n");
      out.write("                </body>\n");
      out.write("    \n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
