<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/8/12
  Time: 12:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1>Beer Recommendations JSP</h1>
<p>
  <%
    <%--这地方的原理没搞懂--%>
    List<String> styles = (List<String>)request.getAttribute("styles");
    Iterator it = styles.iterator();
    while(it.hasNext()) {
      out.print("<br>try: " + it.next());
    }
  %>
</p>
</body>
</html>
