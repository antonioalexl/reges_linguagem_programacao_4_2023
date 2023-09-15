/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alex.lopes
 */
public class DivisaoPorZeroComManipulacaoExcecoes {

    //demonstra o lancamento de uma excecao quando ocorre uma divisao por zero 
    public static int quociente(int numerador, int denominador) throws ArithmeticException {
        return numerador / denominador; //possivel divisao por zero
    }//fim do método

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        do {
            try {
                System.out.print("Digite um numerador inteiro: ");
                int numerador = scanner.nextInt();

                System.out.print("Digite um denominador inteiro: ");
                int denominador = scanner.nextInt();

                int resultado = quociente(numerador, denominador);
                System.out.printf("\nResult: %d / %d = %d\n", numerador, denominador, resultado);
                
                continueLoop = false; //entrada bem sucedida; fim do loop;
            }
            catch(InputMismatchException inputMismatchException)
            {
                System.out.printf("\nExceção %s\n", inputMismatchException);
                scanner.nextLine(); //descarta entrada para o usuário tentar novamente
                System.out.printf("Você deve digitar somente números inteiros. Tente novamente\n");            
            }//fim do catch
            catch(ArithmeticException arithmeticException)
            {
                System.out.printf("\nException %s\n",arithmeticException );
                System.out.printf("Zero é um denominador inválido. Por favor, tente novamente\n");            
            }//fim do catch
        } while (continueLoop);// fim do do...while
    }//fim do método main
}
