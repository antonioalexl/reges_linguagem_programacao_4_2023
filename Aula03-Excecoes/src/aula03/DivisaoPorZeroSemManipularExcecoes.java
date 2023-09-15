/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula03;

import java.util.Scanner;

/**
 *
 * @author alex.lopes
 */
public class DivisaoPorZeroSemManipularExcecoes {

    public static int quociente(int numerador, int denominador) {
        return numerador / denominador; //possivel divisao por zero
    }
    
    
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numerador inteiro: ");
        int numerador = scanner.nextInt();

        System.out.print("Digite um denominador inteiro: ");
        int denominador = scanner.nextInt();

        int resultado = quociente(numerador, denominador);
        System.out.printf("\nResult: %d / %d = %d\n", numerador, denominador, resultado);
    }
}



