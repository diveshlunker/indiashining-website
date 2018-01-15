package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            body{background:#294072; \n");
      out.write("                font-family: 'Source Sans Pro', sans-serif; \n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            b{\n");
      out.write("                color:yellowgreen\n");
      out.write("            }\n");
      out.write("            h1{\n");
      out.write("                color:gold\n");
      out.write("            }\n");
      out.write("           \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            marquee{\n");
      out.write("                color:greenyellow;\n");
      out.write("            } \n");
      out.write("            a{\n");
      out.write("                color:bisque;\n");
      out.write("            }\n");
      out.write("            ul{\n");
      out.write("                list-style-type:none;\n");
      out.write("                margin:0;\n");
      out.write("                padding:0;\n");
      out.write("                overflow:hidden;\n");
      out.write("                background-color:#333;\n");
      out.write("            }\n");
      out.write("            li{\n");
      out.write("                float:left;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            li a {\n");
      out.write("                display:block;\n");
      out.write("                color:white;\n");
      out.write("                text-align:center;\n");
      out.write("                padding:14px 16px;\n");
      out.write("                text-decoration:none;\n");
      out.write("                \n");
      out.write("                    \n");
      out.write("            }\n");
      out.write("            li a:hover:not(.active){\n");
      out.write("            background-color:#111;\n");
      out.write("            }\n");
      out.write("            .active{\n");
      out.write("                background-color:#4CAF50;\n");
      out.write("            }\n");
      out.write("            footer{\n");
      out.write("                padding:1em;\n");
      out.write("                color:black;\n");
      out.write("                background-color:black;\n");
      out.write("                clear:left;\n");
      out.write("                text-align:center;\n");
      out.write("                \n");
      out.write("                   \n");
      out.write("            }\n");
      out.write("          \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <hr>\n");
      out.write("<img border=\"0\" src=\"images/images.png\" width=\"100\" align=\"right\">\n");
      out.write("<b>\n");
      out.write("<font size=\"6\">Welcome to INDIA'S SHINING<br></font>\n");
      out.write("<i><font size=\"5\">among the best websites of India</i></b></p>\n");
      out.write("<hr>\n");
      out.write("        \n");
      out.write("        <ul>\n");
      out.write("            <li><a class=\"active\" href=\"home.jsp\">Home</a></li>\n");
      out.write("            \n");
      out.write("            <li><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("            <li> &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</li>\n");
      out.write("            <li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        \n");
      out.write("        </ul>\n");
      out.write("    <marquee><h2>Get latest updates via email by loging in....</h2></marquee>\n");
      out.write("    <hr color=\"black\"><center><h1> PEOPLE </h1></center><hr color=\"black\">\n");
      out.write("    <h2><center><a href=\"images/DHAYAN CHAND.JPG\">1. DHAYAN CHAND</a></center>\n");
      out.write("    <center><a href=\"images/SCIENCE DAY OF SWITZERLAND.JPG\">2. SCIENCE DAY OF SWIZTERLAND</a></center>\n");
      out.write("    <center><a href=\"images/human computer.JPG\">3. HUMAN COMPUTER</a></center></h2><br>\n");
      out.write("    <hr color=\"black\"><center><h1> MONUMENTS AND BUILDINGS </h1></center><hr color=\"black\">\n");
      out.write("    <h2><center><a href=\"images/BANDRA WORLI SEA LINK.JPG\">1. BANDRA WORLI SEA LINK</a></center>\n");
      out.write("    <center><a href=\"images/ELEPAHANTA.JPG\">2. ELEPHANTA CAVES</a></center>\n");
      out.write("    <center><a href=\"images/IRON PILLAR OF DELHI.JPG\">3. IRON PILLAR</a></center>\n");
      out.write("    <center><a href=\"images/KANHERI CAVES.JPG\">4. KANHERI CAVES</a></center>\n");
      out.write("    <center><a href=\"images/KEY MONASTERY.JPG\">5. KEY MONASTERY</a></center>\n");
      out.write("    <center><a href=\"images/pattakal.JPG\">6. PATTAKAL</a></center>\n");
      out.write("    <center><a href=\"images/tawnag monastery.JPG\">7. TAWNAG MONASTERY</a></center>\n");
      out.write("    <center><a href=\"images/Capture.JPG\">8. KARLA CAVES</a></center></h2><br>\n");
      out.write("    <hr color=\"black\"><center><h1> DISCOVERIES AND INVENTIONS </h1></center><hr color=\"black\">\n");
      out.write("    <h2><center><a href=\"images/COTTON CULTIVATION.JPG\">1. COTTON CULTIVATION</a></center>\n");
      out.write("    <center><a href=\"images/robocop.JPG\">2. ROBOCOP</a></center></h2><br>\n");
      out.write("    <hr color=\"black\"><center><h1>UNKNOWN FACTS</h1></center><hr color=\"black\">\n");
      out.write("    <h2><center><a href=\"images/WATER ON MOON.JPG\">1. WATER OF MOON</a></center>\n");
      out.write("    <center><a href=\"images/english speaking.JPG\">2. ENGLISH</a></center>\n");
      out.write("    <center><a href=\"images/shampooing.JPG\">3. SHAMPOOING</a></center>\n");
      out.write("    <center><a href=\"images/sugur.JPG\">4. SUGAR</a></center>\n");
      out.write("    <center><a href=\"images/prefabricated homes.JPG\">5. PREFABRICATED HOMES</a></center></h2>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <marquee><h2>Like us on facebook: <a href=\"https://www.facebook.com/indiashining12345/\">INDIA SHINING</a>\n");
      out.write("    </body>\n");
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
