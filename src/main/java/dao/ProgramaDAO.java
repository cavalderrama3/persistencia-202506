/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dto.ProgramaDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ProgramaDAO {

    private final String URL = "jdbc:postgresql://localhost:5432/tu_basedatos";
    private final String USER = "usuario";
    private final String PASS = "clave";

    public void insertar(ProgramaDTO programa) {
        String sql = "INSERT INTO Programa VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, programa.getProgramaId());
            stmt.setString(2, programa.getDescripcion());
            stmt.setInt(3, programa.getGobiernoId());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
