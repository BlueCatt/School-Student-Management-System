package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class managerLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/index.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("            <body background='img/bg.jpg'>\n");
      out.write("        \n");
      out.write("            <span class=\"div1\">NYIT</span>\n");
      out.write("            <span class=\"div2\">manager</span><hr/>\n");
      out.write("            <div class=\"div3\">\n");
      out.write("            <div class=\"div4\">Manager Login</div>\n");
      out.write("            <form action=\"/NYIT1/managerLoginCL\" method=\"post\">\n");
      out.write("            <div class=\"div5\">ManagerId <input type=\"text\" name=\"id\"/></div>\n");
      out.write("            <div class=\"div5\">Password   &nbsp&nbsp<input type=\"password\" name=\"password\"/></div>\n");
      out.write("            <div class=\"div6\"><input type='submit' value='Login' /></div>\n");
      out.write("            \n");
      out.write("            ");

                    String errInfo=(String)request.getAttribute("err");
                    if(errInfo!=null){
                        out.println("<font color='red'>"+errInfo+"</font>");
                }
                    
                    
      out.write("\n");
      out.write("                    \n");
      out.write("            </form>\n");
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
