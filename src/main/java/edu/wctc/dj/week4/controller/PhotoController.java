package edu.wctc.dj.week4.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import edu.wctc.dj.week4.model.Photo;
import edu.wctc.dj.week4.model.PhotoService;

/**
 *
 * @author Isaac
 */
@WebServlet(name="PhotoController", urlPatterns={"/PhotoController"})
public class PhotoController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
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

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PhotoService photoService = new PhotoService();
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/photoList.jsp");
        
        String id = request.getParameter("id");
        String search = request.getParameter("search");
        
        if (id != null){
            Photo photo = photoService.getPhoto(id);
            request.setAttribute("photo", photo);
            dispatcher = request.getRequestDispatcher("/WEB-INF/photoDetail.jsp");
        } else if (search != null){
            List<Photo> photoList = photoService.findPhotos(search);
            request.setAttribute("photoList", photoList);
            dispatcher = request.getRequestDispatcher("/WEB-INF/photoList.jsp");
        } else {
            List<Photo> photoList = photoService.getAllPhotos();
            request.setAttribute("photoList", photoList);
            dispatcher = request.getRequestDispatcher("/WEB-INF/photoList.jsp");
        }
        
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}