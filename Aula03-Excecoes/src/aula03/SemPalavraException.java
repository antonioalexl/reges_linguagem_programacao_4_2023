/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula03;

/**
 *
 * @author alex.lopes
 */
public class SemPalavraException extends Exception {

    @Override
    public String getMessage() {
        return "Não existe a palavra REGES em sua frase";
    }

}
