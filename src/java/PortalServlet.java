/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author LucasPerussi-Wetalki
 */
@WebServlet(urlPatterns = {"/PortalServlet"})
public class PortalServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
              out.println("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n" +
"<script src=\"https://unpkg.com/axios/dist/axios.min.js\"></script>\n" +
"<script src=\"//cdn.jsdelivr.net/npm/sweetalert2@11\"></script>");
            
            out.println("<title>Servlet PortalServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println(" <div class=\"container\">\n" +
"          <div class=\"row\">\n" +
"              <div class=\"col-3\"></div>\n" +
"              <div class=\"col-6\">\n" +
"                  <form method=\"POST\" action=\"CadastrarUsuarioServlet\" style=\"margin:10%; padding: 5%;border-radius: 20px;background-color: #87CEFA; height:400px; width:60%;\">\n" +
"                            <h1 style=\"color:white;\">Novo Usuário</h1>\n" +
"                      <div class=\"row\">\n" +
"                        <input style=\"margin:1%;width:80%; border-radius: 20px;border-style: hidden;padding:10px;\" placeholder=\"nome\" class=\"input\" required type=\"text\" name=\"user\">\n" +
"                      </div>\n" +
                     "<div class=\"row\">\n" +
"                        <input style=\"margin:1%;width:80%; border-radius: 20px;border-style: hidden;padding:10px;\" placeholder=\"user\" class=\"input\" required type=\"text\" login=\"user\">\n" +
"                      </div>\n" +
                    
"                      <div class=\"row\">\n" +
"                        <input style=\"margin:1%;border-radius: 20px;width:80%; border-style: hidden;padding:10px;\" placeholder=\"password\" class=\"input\" required type=\"password\" name=\"password\">\n" +
"                      </div>\n" +
"                      <div class=\"row\">\n" +
"                        <input style=\"margin:1%; border-radius: 20px; width:80%; border-style: hidden;padding:10px;\" class=\"button\" type=\"submit\" name=\"user\">\n" +
"                      </div>\n" +
"                  </form>\n" +
"              </div>\n" +
"              <div class=\"col-3\"></div>\n" );
            
            
             out.println("<table class=\"table\">\n" +
                        "<thead class=\"table-light\">\n" +
                        "    <tr>\n" +
                        "        <th>ID</th>\n" +
                        "        <th>Produto</th>\n" +
                        "        <th>Comprador</th>\n" +
                        "    </tr>\n" +
                        "</thead>\n" +
                        "<tbody>\n" +
                        "    <tr>");

                        for (int i=0; i<5;i++){
                            out.println("<th>" + i + "</th>\n");
                            out.println("<th> Produto </th>" + i + "\n");
                            out.println("<th>" + i*10 + "</th>\n");
                        }
            
            
            out.println("</tr>\n" +
                        "</tbody>\n" +
                        "</table>");

            
            
            
            
            
        out.println("</div>\n" +
"      </div>");
            
           
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
 
}
