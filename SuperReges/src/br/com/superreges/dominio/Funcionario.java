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
public class Funcionario extends Pessoa{
       
    
    private int numero;
    private double salario;
    private String cargo;
    private Calendar dataAdmissao;
    private Calendar dataDemissao;
    private int jornadaMensal;    

    public Funcionario(String nomeCompleto, String nomeResumido, Endereco endereco, 
            String telefone, Calendar dataNascFund, String documento, String rgIe, String email, int numero, 
            double salario, String cargo,  int jornadaMensal) {        
    
        super(nomeCompleto, nomeResumido, endereco, telefone, dataNascFund, documento, rgIe, email);
        
        this.numero = numero;
        this.salario = salario;
        this.cargo = cargo;    
        this.jornadaMensal = jornadaMensal;
        
    }
    
    public Funcionario(String nomeCompleto, String nomeResumido, Endereco endereco, 
            String telefone, Calendar dataNascFund, String documento, String rgIe, String email, int numero, 
            double salario, String cargo, Calendar dataAdmissao, Calendar dataDemissao, int jornadaMensal) {
        super(nomeCompleto, nomeResumido, endereco, telefone, dataNascFund, documento, rgIe, email);
        
        this.numero = numero;
        this.salario = salario;
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
        this.dataDemissao = dataDemissao;
        this.jornadaMensal = jornadaMensal;
    }
    

}
