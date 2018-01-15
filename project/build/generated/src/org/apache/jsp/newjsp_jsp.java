package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en-us\">\n");
      out.write("<meta charset=\"utf-8\" />\n");
      out.write("<head>\n");
      out.write("<title>Awesome Login Form Template</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<style>\n");
      out.write("\n");
      out.write("body{background:#294072; \n");
      out.write("font-family: 'Source Sans Pro', sans-serif; \n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".form\n");
      out.write("{\n");
      out.write("width:400px; \n");
      out.write("margin:0 auto; \n");
      out.write("background:#1C2B4A; \n");
      out.write("margin-top:150px}\n");
      out.write(".header\n");
      out.write("{\n");
      out.write("height:44px; \n");
      out.write("background:#17233B}\n");
      out.write("\n");
      out.write(".login\n");
      out.write("{padding:0 20px\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".text\n");
      out.write("{\n");
      out.write("background:#12192C; \n");
      out.write("width:90%; \n");
      out.write("border-radius:0 3px 3px 0;\n");
      out.write("border:none; \n");
      out.write("outline:none; \n");
      out.write("color:#999; \n");
      out.write("font-family: 'Source Sans Pro', sans-serif} \n");
      out.write("\n");
      out.write("\n");
      out.write(".btn\n");
      out.write("{\n");
      out.write("height:40px;\n");
      out.write("border:none; \n");
      out.write("background:#0C6;\n");
      out.write("width:100%; \n");
      out.write("outline:none;\n");
      out.write("font-family: \n");
      out.write("'Source Sans Pro', sans-serif; \n");
      out.write("font-size:20px; \n");
      out.write("font-weight:bold; \n");
      out.write("color:#eee; \n");
      out.write("border-bottom:solid 3px #093; \n");
      out.write("border-radius:3px; \n");
      out.write("cursor:pointer}\n");
      out.write("\n");
      out.write("ul li\n");
      out.write("{\n");
      out.write("height:40px;\n");
      out.write("margin:15px 0;\n");
      out.write("list-style:none\n");
      out.write("}\n");
      out.write("\n");
      out.write(".span\n");
      out.write("{\n");
      out.write("display:table; \n");
      out.write("width:100%;\n");
      out.write("font-size:14px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("@media(max-width:480px){ .form{width:100%}}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body background=\"images(1).jpg\">\n");
      out.write("<div class=\"form\">\n");
      out.write("<div class=\"header\"><h2>LOGIN</h2></div>\n");
      out.write("<div class=\"login\">\n");
      out.write("<form action=\"first.jsp\">\n");
      out.write("<ul>\n");
      out.write("<li>\n");
      out.write("<span class=\"un\"><i class=\"fa fa-user\"></i></span><input type=\"email\" required class=\"text\" placeholder=\"Username\" name=\"username\"/></li>\n");
      out.write("<li>\n");
      out.write("<span class=\"un\"><i class=\"fa fa-lock\"></i></span><input type=\"password\" required class=\"text\" placeholder=\"Password\" name=\"password\"/></li>\n");
      out.write("<li>\n");
      out.write("<input type=\"submit\" value=\"LOGIN\" class=\"btn\">\n");
      out.write("</li>\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("</div><br/>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
