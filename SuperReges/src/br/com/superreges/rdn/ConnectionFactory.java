/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.superreges.rdn;

import java.sql.*;

public class ConnectionFactory {
    
    private String USER = "root";
    private String PASSWORD = "123456";
    private String URL = "jdbc:mysql://localhost:3306/db_supermercado_reges";
    
    public Connection getConnection(){
    
        try{
            return DriverManager.getConnection(URL,USER,PASSWORD);
        }
        
        catch(SQLException ex){
            throw new RuntimeException(ex);
        
        }
    }
    
}
