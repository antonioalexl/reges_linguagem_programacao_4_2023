/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula03;

/**
 *
 * @author alex.lopes
 */
public class LancarException {

    public static void main(String args[]) {

        try {
            letrasMaisculas();
        } catch (Exception er) {
            System.out.println("Ocorreu um erro ao chamar o método letrasMaisculas() " + er);
        }
    }

    private static void letrasMaisculas() throws Exception //lançando exceção
    {
        String texto = null;
        String frase = null;
        try {
            frase = texto.toUpperCase();
        } catch (NullPointerException e) {
            throw new Exception(e);
        }
        System.out.println("Texto antiga: " + texto);
        System.out.println("Frase : " + frase);
    }
}




