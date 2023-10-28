/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.superreges.rdn;

import java.sql.*;
import br.com.superreges.dominio.Cliente;

/**
 *
 * @author anton
 */
public class ClienteRdn {

    public int inserirCliente(Cliente cli) {

        try {
            
            int linhasAfetadas = 0;
            StringBuilder str = new StringBuilder();

            str.append("INSERT INTO cliente    ");
            str.append("(nomeCompleto           ");
            str.append(",nomeResumido           ");
            str.append(",email                  ");
            str.append(",telefone               ");
            str.append(",dataNascFund           ");
            str.append(",documento              ");
            str.append(",rgIe                   ");
            str.append(",cartaoFidelidade)      ");
            str.append("VALUES(                 ");
            str.append(" ?                      ");
            str.append(",?                      ");
            str.append(",?                      ");
            str.append(",?                      ");
            str.append(",?                      ");
            str.append(",?                      ");
            str.append(",?                      ");
            str.append(",?                      ");
            str.append(")                       ");

            ConnectionFactory factory = new ConnectionFactory();
            Connection conn = factory.getConnection();

            //CRIA O STATMENT JÁ PREPARADO PARA OBTER O ID CLIENTE GERADO
            PreparedStatement stmt = conn.prepareStatement(str.toString(), Statement.RETURN_GENERATED_KEYS);

            stmt.setString(1, cli.getNomeCompleto());
            stmt.setString(2, cli.getNomeResumido());
            stmt.setString(3, cli.getEmail());
            stmt.setString(4, cli.getTelefone());
            stmt.setDate(5, new java.sql.Date(cli.getDataNascFund().getTimeInMillis()));
            stmt.setString(6, cli.getDocumento());
            stmt.setString(7, cli.getRgIe());
            stmt.setString(8, cli.getCartaoFidelidade());

            int id = 0;
            
            linhasAfetadas = stmt.executeUpdate();
            
            stmt.close();
            conn.close();
            
            return linhasAfetadas;

        } catch (SQLException ex) {
            System.out.println("ERRO: " + ex.getMessage());
            return 0;
        }
    }
}
