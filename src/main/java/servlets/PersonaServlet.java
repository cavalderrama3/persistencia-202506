/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import dao.PersonaDAO;
import dto.PersonaDTO;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;

@WebServlet("/PersonaServlet")
public class PersonaServlet extends HttpServlet {

    private final PersonaDAO dao = new PersonaDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accion = request.getParameter("accion");
        if (null == accion) {
            List<PersonaDTO> lista = dao.listar();
            request.setAttribute("lista", lista);
            request.getRequestDispatcher("persona_lista.jsp").forward(request, response);
        } else {
            switch (accion) {
                case "editar" ->  {
                    int id = Integer.parseInt(request.getParameter("id"));
                    PersonaDTO persona = dao.buscar(id);
                    request.setAttribute("persona", persona);
                    request.getRequestDispatcher("persona_editar.jsp").forward(request, response);
                }
                case "eliminar" ->  {
                    int id = Integer.parseInt(request.getParameter("id"));
                    dao.eliminar(id);
                    response.sendRedirect("PersonaServlet");
                }
                default -> {
                }
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int personaId = Integer.parseInt(request.getParameter("persona_id"));
        String nombre = request.getParameter("nombre");
        String ubicacion = request.getParameter("ubicacion");
        String genero = request.getParameter("genero");
        String origenEtnico = request.getParameter("origen_etnico");
        String nivelPobreza = request.getParameter("nivel_pobreza");
        double ingresos = Double.parseDouble(request.getParameter("ingresos"));
        String discapacidad = request.getParameter("discapacidad");

        PersonaDTO persona = new PersonaDTO(personaId, nombre, ubicacion, genero, origenEtnico, nivelPobreza, ingresos, discapacidad);

        String accion = request.getParameter("accion");
        if ("actualizar".equals(accion)) {
            dao.actualizar(persona);
        } else {
            dao.insertar(persona);
        }
        response.sendRedirect("PersonaServlet");
    }
}
