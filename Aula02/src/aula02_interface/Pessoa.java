/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02_interface;

/**
 *
 * @author alex.lopes
 */
public class Pessoa implements IPessoa {

    private float valorCompra;

    @Override
    public void calcularDesconto(float valor) {
        this.valorCompra = this.valorCompra - valor;
    }
}


