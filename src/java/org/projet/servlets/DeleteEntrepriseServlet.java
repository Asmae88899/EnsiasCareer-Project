package org.projet.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.projet.db.EntrepriseDB;

/**
 *
 * @author acer
 */
public class DeleteEntrepriseServlet extends HttpServlet {
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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DeleteStudentServlet</title>");            
            out.println("</head>");
            out.println("<body>");
           /* 
            String nom = request.getParameter("nom");
            String prenom = request.getParameter("prenom");
            
            List<Ensiaste>data1=new ArrayList<Ensiaste>();
            try {
					 
					 String sql= "SELECT * FROM `ensiaste` WHERE nom=? AND prenom=?"; 
					 Connection con=EnsiasteDB.getConnection();
					 PreparedStatement preparedStatement=(PreparedStatement)con.prepareStatement(sql);
					 preparedStatement.setString(1,nom);
					 preparedStatement.setString(2,prenom);
					 
                                        ResultSet rs=preparedStatement.executeQuery();
					 
					 while(rs.next()){
						 
						 
						 data1.add(new Ensiaste(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getInt(10)));
						 
					 }
					 con.close();
				}catch (Exception e1) {
					e1.printStackTrace();
				}
				
				for (Ensiaste gr : data1 )
				{
                                        id=gr.getId();
			    	
				}*/
            int bid = Integer.parseInt(request.getParameter("id"));
                          
            EntrepriseDB.deleteEntreprise(bid);
            
            response.sendRedirect("adminEspaceEntreprise.jsp");
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
