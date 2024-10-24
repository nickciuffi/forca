/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.forca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author nicol
 */
public class ServidorForca {
    private static final String URL = "jdbc:mysql://localhost:3306/jogo-da-forca"; // Altere para seu banco de dados
    private static final String USER = "nickciuffi"; // Altere para seu usuário
    private static final String PASSWORD = "Niisaricris1"; // Altere para sua senha

    // Método para conectar ao banco de dados
    private static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
    public static String adicionaNovaSala(String palavra){
        String sql = "INSERT INTO partidas (palavra, tentativas_erradas) VALUES (?, ?)";
        int id = 0;
        
        try (Connection conn = conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            pstmt.setString(1, palavra);
            
            pstmt.setString(2, "");
            pstmt.executeUpdate();
            try (ResultSet rs = pstmt.getGeneratedKeys()) {
            if (rs.next()) {
                id = rs.getInt(1); // Pega o primeiro valor da chave gerada
            }
            return Integer.toString(id);
        }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return "Error";
        }
    }
    
    public static Jogo buscaJogo(int gameId){
         String sql = "SELECT * FROM partidas where id = ?";
         Jogo jogo = null;
         
        try (Connection conn = conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)){
             pstmt.setInt(1, gameId);
             ResultSet rs = pstmt.executeQuery();
             
            
            while (rs.next()) {
                jogo = new Jogo();
                jogo.setPalavra(rs.getString("palavra"));
                jogo.setAcertados(rs.getString("acertos"));
                
            }
            
            
        } catch (SQLException e) {
        }
    return jogo;
    }
}
