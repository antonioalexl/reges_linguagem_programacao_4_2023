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
public class Cliente extends Pessoa {
    
    private String cartaoFidelidade;  

    public Cliente(String nomeCompleto, String nomeResumido, Endereco endereco, String telefone, Calendar dataNascFund, String documento, String rgIe, String email, String cartaoFidelidade) {
        super(nomeCompleto, nomeResumido, endereco, telefone, dataNascFund, documento, rgIe,email);
        this.cartaoFidelidade = cartaoFidelidade;
    }
    
    
    public void imprimir(){
    
         System.out.println("Nome: " + this.getNomeCompleto());
         System.out.println("Documento: " + this.getDocumento());
         System.out.println("Rg: " + this.getRgIe() );
         System.out.println("Telefone: " + this.getTelefone());
         System.out.println("Email: " + this.getEmail());
    }
    
}