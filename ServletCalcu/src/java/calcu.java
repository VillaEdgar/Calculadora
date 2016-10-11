/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alumno
 */
public class calcu extends HttpServlet {

    int num1;
    int num2;
    String operacion;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            num1 = Integer.parseInt(request.getParameter("num1"));
            num2 = Integer.parseInt(request.getParameter("num2"));
            operacion = request.getParameter("boton");

            if (operacion.equals("suma")) {
                out.println("Tu resultado es:" + (num1 + num2));
            } else if (operacion.equals("resta")) {
                out.println("Tu resultado es:" + (num1 - num2));
            } else if (operacion.equals("divicion")) {
                out.println("Tu resultado es:" + (num1 / num2));
            } else if (operacion.equals("multiplicacion")) {
                out.println("Tu resultado es:" + (num1 * num2));
            } 
            
        }
    }
}
