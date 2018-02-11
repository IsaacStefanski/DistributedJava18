/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Photo;
import model.PhotoService;

/**
 *
 * @author Isaac
 */
@WebServlet(name = "PhotoController", urlPatterns = {"/PhotoController"})
public class PhotoController extends HttpServlet {

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
            out.println("<title>Servlet PhotoController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PhotoController at " + request.getContextPath() + "</h1>");
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
     protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PhotoService photoService = new PhotoService();
        RequestDispatcher dispatcher = request.getRequestDispatcher("/namesList.jsp");
        
        String id = request.getParameter("id");
        String search = request.getParameter("search");
        
        if (id != null){
            Photo photo = photoService.getPhoto(id);
            request.setAttribute("photo", photo);
            dispatcher = request.getRequestDispatcher("/photoDetail.jsp");
        } else if (search != null){
            List<Photo> photoList = photoService.findNames(search);
            request.setAttribute("photoList", photoList);
            dispatcher = request.getRequestDispatcher("/photoList.jsp");
        } else {
            List<Photo> photoList = photoService.getAllPhotos();
            request.setAttribute("photoList", photoList);
            dispatcher = request.getRequestDispatcher("/photoList.jsp");
        }
        
        dispatcher.forward(request, response);
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
