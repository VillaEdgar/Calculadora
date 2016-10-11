<%-- 
    Document   : calcu
    Created on : 11/10/2016, 03:45:08 PM
    Author     : Alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%@page import="java.sql.*, java.io.*" %>
        <% 
            
            int num1=Integer.parseInt(request.getParameter("num1"));
            int num2=Integer.parseInt(request.getParameter("num2"));
            String operacion=request.getParameter("boton");
            
            if (operacion.equals("suma")) {
                out.println("Tu resultado es:" + (num1 + num2));
            } else if (operacion.equals("resta")) {
                out.println("Tu resultado es:" + (num1 - num2));
            } else if (operacion.equals("divicion")) {
                out.println("Tu resultado es:" + (num1 / num2));
            } else if (operacion.equals("multiplicacion")) {
                out.println("Tu resultado es:" + (num1 * num2));
            } 
        %>
    </body>
</html>
