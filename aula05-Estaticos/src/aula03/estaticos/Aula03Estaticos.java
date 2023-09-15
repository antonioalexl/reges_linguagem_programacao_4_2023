package aula03.estaticos;


import aula03.estaticos.Teste;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author alex.lopes
 */
public class Aula03Estaticos {

    static {
        System.out.println("Essa é uma classe estática");
    }

    public static void main(String[] args) {

        System.out.println(Teste.data);

        Teste.metodoEstatico();
    }

}

