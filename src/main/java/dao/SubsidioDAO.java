/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dto.SubsidioDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SubsidioDAO {

    private final String URL = "jdbc:postgresql://localhost:5432/tu_basedatos";
    private final String USER = "usuario";
    private final String PASS = "clave";

    public void insertar(SubsidioDTO subsidio) {
        String sql = "INSERT INTO Subsidio VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, subsidio.getSubsidioId());
            stmt.setInt(2, subsidio.getPersonaId());
            stmt.setInt(3, subsidio.getProgramaId());
            stmt.setDouble(4, subsidio.getMonto());
            stmt.setString(5, subsidio.getFechaEntrega());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
