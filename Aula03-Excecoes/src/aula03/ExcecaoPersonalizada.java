/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula03;

/**
 *
 * @author alex.lopes
 */
public class ExcecaoPersonalizada {

    public static void main(String args[]) {

        try {
            existePalavra();
        } catch (SemPalavraException e) {

            System.out.println(e.getMessage());
        }

    }

    public static void existePalavra() throws SemPalavraException {
        String frase = "Estudo na USP!";
        if (!frase.contains("reges") || !frase.contains("REGES")) {
            throw new SemPalavraException();
        }
    }
}


