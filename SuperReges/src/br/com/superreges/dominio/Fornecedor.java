/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.superreges.dominio;

import java.util.Calendar;

/**
 *
 * @author Alex
 */
public class Fornecedor extends Pessoa {
    
    public Fornecedor(int id, String nomeCompleto, String nomeResumido, Endereco endereco, String telefone, Calendar dataNascFund, String documento, String rgIe, String email) {
        super(id, nomeCompleto, nomeResumido, endereco, telefone, dataNascFund, documento, rgIe, email);
    }
    
 
    
    
}
