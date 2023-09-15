/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02;

/**
 *
 * @author alex.lopes
 */
public abstract class Pessoa {
    
    public String nome;
    public String endereco;
    public String telefone;
    public String documento;    
    public String email;
    public float valor;
        
    public abstract void calcularDesconto(float desconto);
}


