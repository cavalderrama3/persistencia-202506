/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import dao.ProgramaDAO;
import dto.ProgramaDTO;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ProgramaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int programaId = Integer.parseInt(request.getParameter("programa_id"));
        String descripcion = request.getParameter("descripcion");
        int gobiernoId = Integer.parseInt(request.getParameter("gobierno_id"));

        ProgramaDTO programa = new ProgramaDTO(programaId, descripcion, gobiernoId);
        ProgramaDAO dao = new ProgramaDAO();
        dao.insertar(programa);

        response.sendRedirect("programa_form.jsp");
    }
}
