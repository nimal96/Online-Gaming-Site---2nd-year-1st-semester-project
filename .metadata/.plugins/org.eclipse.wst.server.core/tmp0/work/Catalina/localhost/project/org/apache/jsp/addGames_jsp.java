/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.51
 * Generated at: 2018-05-19 05:07:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addGames_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("   \r\n");
      out.write(" <head>\r\n");
      out.write("       \r\n");
      out.write(" <meta charset=\"utf-8\">\r\n");
      out.write("    \r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write(" \r\n");
      out.write("       \t<title>Game Site </title>\r\n");
      out.write("        \r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/skeleton/2.0.4/skeleton.css\" >\r\n");
      out.write("   \r\n");
      out.write("     \t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\r\n");
      out.write("       \r\n");
      out.write(" \t\t<link rel=\"stylesheet\" href=\"gamesEditor/formcs.css\" >\r\n");
      out.write("   \r\n");
      out.write("     \t<script src=\"gamesEditor/formjs.js\"></script>\r\n");
      out.write("  <script>  \t\r\n");
      out.write("   function validate()\r\n");
      out.write("   { \r\n");
      out.write("\tvar fullname = document.frmAddUser.userid.value;\r\n");
      out.write(" \tvar email = document.frmAddUser.firstName.value;\r\n");
      out.write(" \tvar username = document.frmAddUser.lastName.value; \r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write(" \tif (fullname==null || fullname==\"\")\r\n");
      out.write("\t { \r\n");
      out.write("\t\t alert(\"User ID can't be blank\"); \r\n");
      out.write(" \t\treturn false; \r\n");
      out.write(" \t}\r\n");
      out.write(" \telse if (email==null || email==\"\")\r\n");
      out.write(" \t{ \r\n");
      out.write(" \t\talert(\"Game Name can't be blank\"); \r\n");
      out.write(" \t\treturn false; \r\n");
      out.write(" \t}\r\n");
      out.write(" \telse if (username==null || username==\"\")\r\n");
      out.write(" \t{ \r\n");
      out.write(" \t\talert(\"Developer name can't be blank\"); \r\n");
      out.write("\t \treturn false; \r\n");
      out.write(" \t}\r\n");
      out.write("\r\n");
      out.write(" } \r\n");
      out.write("     \t\r\n");
      out.write(" </script>\r\n");
      out.write("   \r\n");
      out.write(" </head>\r\n");
      out.write("\r\n");
      out.write("  <body >\r\n");
      out.write("      \r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"form-container\">\r\n");
      out.write("                \r\n");
      out.write("\t<h1>\r\n");
      out.write(" \tAdd Games \r\n");
      out.write("\t </h1>\r\n");
      out.write("          \r\n");
      out.write("    <form method=\"POST\" action='GameHandler' name=\"frmAddUser\"><input type=\"hidden\" name=\"action\" value=\"insert\" onsubmit=\"return validate()\"/>\r\n");
      out.write("                   \r\n");
      out.write(" \t<label for=\"gameID\">Game ID:</label>\r\n");
      out.write("         \r\n");
      out.write("           <input id=\"name\" type=\"text\" name=\"gamesid\">\r\n");
      out.write("   \r\n");
      out.write(" \t<label for=\"name\">Game name:</label>\r\n");
      out.write("                 \r\n");
      out.write("   \t<input id=\"name\" name=\"gameName\">\r\n");
      out.write("  \r\n");
      out.write("\t <label for=\"developer\">Devoloper :</label>\r\n");
      out.write("                 \r\n");
      out.write("   \t<input id=\"developer\" type=\"developer\" name=\"developerName\">\r\n");
      out.write("   \t<table>\r\n");
      out.write(" \t <tr>\r\n");
      out.write(" \t<td>");
      out.print((request.getAttribute("errMessage") == null) ? "": request.getAttribute("errMessage"));
      out.write("</td>\r\n");
      out.write("\t </tr>\r\n");
      out.write("\t </table>\r\n");
      out.write("                 \r\n");
      out.write("       <button class=\"button-primary\" type=\"submit\" >SUBMIT</button>\r\n");
      out.write("           \r\n");
      out.write("     </form>\r\n");
      out.write(" <p><a href=\"GameHandler?action=listUser\">View-All-Records</a></p>          \r\n");
      out.write(" <div id=\"success_message\" style=\"display:none\">\r\n");
      out.write("               \r\n");
      out.write("     <h3>Submitted the form successfully!</h3> \r\n");
      out.write("\r\n");
      out.write("                    <p> We will get back to you soon. </p>\r\n");
      out.write("  \r\n");
      out.write("  </div>\r\n");
      out.write("                \r\n");
      out.write("<div id=\"error_message\" style=\"width:100%; height:100%; display:none; \"> \r\n");
      out.write("<h3>Error</h3> Sorry there was an error sending your form. </div>\r\n");
      out.write("          \r\n");
      out.write("  </div>\r\n");
      out.write("        \r\n");
      out.write("</div>\r\n");
      out.write("    \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
