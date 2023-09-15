/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02;

/**
 *
 * @author alex.lopes
 */
public class Cliente extends Pessoa {

    @Override
    public void calcularDesconto(float desconto) {
        this.valor = valor - desconto;
    }
}



