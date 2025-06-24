/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dto.PersonaDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO {

    private final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private final String USER = "persistencia";
    private final String PASS = "persistencia";

    public void insertar(PersonaDTO persona) {
        String sql = "INSERT INTO Persona VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, persona.getPersonaId());
            stmt.setString(2, persona.getNombre());
            stmt.setString(3, persona.getUbicacion());
            stmt.setString(4, persona.getGenero());
            stmt.setString(5, persona.getOrigenEtnico());
            stmt.setString(6, persona.getNivelPobreza());
            stmt.setDouble(7, persona.getIngresos());
            stmt.setString(8, persona.getDiscapacidad());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<PersonaDTO> listar() {
        List<PersonaDTO> personas = new ArrayList<>();
        String sql = "SELECT * FROM Persona";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                personas.add(new PersonaDTO(
                        rs.getInt("persona_id"),
                        rs.getString("nombre"),
                        rs.getString("ubicacion"),
                        rs.getString("genero"),
                        rs.getString("origen_etnico"),
                        rs.getString("nivel_pobreza"),
                        rs.getDouble("ingresos"),
                        rs.getString("discapacidad")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return personas;
    }

    public void actualizar(PersonaDTO persona) {
        String sql = "UPDATE Persona SET nombre=?, ubicacion=?, genero=?, origen_etnico=?, nivel_pobreza=?, ingresos=?, discapacidad=? WHERE persona_id=?";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getUbicacion());
            stmt.setString(3, persona.getGenero());
            stmt.setString(4, persona.getOrigenEtnico());
            stmt.setString(5, persona.getNivelPobreza());
            stmt.setDouble(6, persona.getIngresos());
            stmt.setString(7, persona.getDiscapacidad());
            stmt.setInt(8, persona.getPersonaId());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void eliminar(int personaId) {
        String sql = "DELETE FROM Persona WHERE persona_id=?";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, personaId);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public PersonaDTO buscar(int personaId) {
        String sql = "SELECT * FROM Persona WHERE persona_id=?";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, personaId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new PersonaDTO(
                        rs.getInt("persona_id"),
                        rs.getString("nombre"),
                        rs.getString("ubicacion"),
                        rs.getString("genero"),
                        rs.getString("origen_etnico"),
                        rs.getString("nivel_pobreza"),
                        rs.getDouble("ingresos"),
                        rs.getString("discapacidad")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}