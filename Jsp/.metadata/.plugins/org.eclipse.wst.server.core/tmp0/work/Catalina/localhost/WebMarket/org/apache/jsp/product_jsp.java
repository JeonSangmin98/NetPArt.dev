/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-10-20 10:27:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dto.Product;
import dao.ProductRepository;
import java.sql.*;
import java.sql.*;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/dbconn.jsp", Long.valueOf(1666260965000L));
    _jspx_dependants.put("jar:file:/Users/netpart/Desktop/Dev/Jsp/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/WebMarket/WEB-INF/lib/jstl-1.2.jar!/META-INF/sql.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1664361132000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("dto.Product");
    _jspx_imports_classes.add("dao.ProductRepository");
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"exceptionNoProductId.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>상품 상세 정보</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"./resources/css/bootstrap.min.css\">\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("	function addToCart() {\n");
      out.write("		if (confirm(\"상품을 장바구니에 추가하시겠습니까?\")) {\n");
      out.write("			document.addForm.submit();\n");
      out.write("		} else {\n");
      out.write("			document.addForm.reset();\n");
      out.write("		}\n");
      out.write("	}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("\n");
      out.write("	<div class=\"jumbotron\">\n");
      out.write("		<div class=\"container\">\n");
      out.write("			<h1 class=\"display-4\">상품 정보</h1>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("	<div class=\"container\">\n");
      out.write("		<div class=\"row\">\n");
      out.write("			");
      out.write('\n');
      out.write('\n');
      out.write('\n');

Connection con = null;
try {
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "shop";
	String password = "1234";
	Class.forName("oracle.jdbc.OracleDriver");
	con = DriverManager.getConnection(url, user, password);
} catch (SQLException ex) {
	out.println("데이터베이스 연결에 실패했습니다.<br>");
	out.println("SQLException : " + ex.getMessage());
}

      out.write("\n");
      out.write("			");

			String _id = request.getParameter("id");
			PreparedStatement pstmt = null;
			ResultSet rs = null;

			String sql = "select * from product where p_id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, _id);
			rs = pstmt.executeQuery();

			if (rs.next()) {
			
      out.write("\n");
      out.write("			<div class=\"col-md-5\">\n");
      out.write("				<img src=\"/upload/");
      out.print(rs.getString("p_fileName"));
      out.write("\"\n");
      out.write("					style=\"width: 100%\">\n");
      out.write("			</div>\n");
      out.write("			<div class=\"col-md-6\">\n");
      out.write("				<!-- 한줄에 12칸 그리드 -->\n");
      out.write("				<h3>");
      out.print(rs.getString("p_name"));
      out.write("</h3>\n");
      out.write("				<!-- 상품이름 -->\n");
      out.write("				<p>");
      out.print(rs.getString("p_description"));
      out.write("\n");
      out.write("				<p>\n");
      out.write("					<b>상품 코드 : </b><span class=\"badge badge-danger\">");
      out.print(rs.getString("p_id"));
      out.write("</span>\n");
      out.write("				<p>\n");
      out.write("					<b>제조사</b> :\n");
      out.write("					");
      out.print(rs.getString("p_manufacturer"));
      out.write("\n");
      out.write("				<p>\n");
      out.write("					<b>분류</b> :\n");
      out.write("					");
      out.print(rs.getString("p_category"));
      out.write("\n");
      out.write("				<p>\n");
      out.write("					<b>재고 수</b> :\n");
      out.write("					");
      out.print(rs.getString("p_unitsInStock"));
      out.write("\n");
      out.write("				<h4>");
      out.print(rs.getString("p_unitPrice"));
      out.write("원\n");
      out.write("				</h4>\n");
      out.write("				<p>\n");
      out.write("				<form name=\"addForm\" action=\"./addCart.jsp?id=");
      out.print(rs.getString("p_id"));
      out.write("\" method=\"post\">\n");
      out.write("					<a href=\"#\" class=\"btn btn-info\" onclick=\"addToCart()\">상품주문&raquo;</a>\n");
      out.write("					<a href=\"./cart.jsp\" class=\"btn btn-warning\">장바구니&raquo;</a> <a\n");
      out.write("						href=\"./products.jsp\" class=\"btn btn-secondary\">상품 목록&raquo;</a>\n");
      out.write("				</form>\n");
      out.write("				");

				}
				if (rs != null)
				rs.close();
				if (con != null)
				con.close();
				if (pstmt != null)
				pstmt.close();
				
      out.write("\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write("	<hr>\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("</body>\n");
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
