<%-- 
    Document   : index
    Created on : 11-19-2019, 11:02:49 PM
    Author     : Daysi Sofia Garcia
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%-- crear codigo JAVA- Se creara una lista --%>
        <%
         List<String> lista =new ArrayList<>(); 
         lista.add("Estereo");
         lista.add("TV");
         lista.add("Iphone");
        %>
        <select>
            <% 
                for(String s: lista){
            out.println("<option>"+ s +"</option>");
                }
            %>
        </select>
    </body>
</html>
