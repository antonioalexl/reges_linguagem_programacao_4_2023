/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula06_LayoutManager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author alex.lopes
 */
public class Principal {

    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setSize(600, 400);
        f.setLocationRelativeTo(null);
        f.setTitle("Testando Layout");
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JButton botoes[] = new JButton[15];

        for (int i = 0; i <= 12; i++) {

            botoes[i] = new JButton("Botão " + i);
            f.add(botoes[i]);
        }

        //Flow Layout        
       // f.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 30));

        //Alinhamento 0 = Esquerda, 1 = Centralizado, 2 = Direita
        //FlowLayout(Alinhamento, Espaco H, Espaco V )
        //Distância em pixels
        //Espaço H (Alinhamento Horizontal, espaço em que os componentes vão ficar na horizontal
        //Espaço V (Alinhamento Vertical, distância em que os componentes vão ficar na vertical
        
        
        //Grid Layout
        //f.setLayout(new GridLayout(4,3,10,10));    
        
        
        //GridLayout(Nº Linhas, Nº Colunas,  Espaco H, Espaco V )
        //Border Layout
        
        
        //f.setLayout(new BorderLayout(0,100,100));        
        //BorderLayout(Alinhamento, Espaco H, Espaco V )
        //Border Layout
        //Posiciona os componentes em 6 regiões
        
         f.setLayout(new BorderLayout(10,10));  
         
         f.add(BorderLayout.NORTH, botoes[0]);
         f.add(BorderLayout.SOUTH, botoes[1] );
         f.add(BorderLayout.WEST, botoes[2]);
         f.add(BorderLayout.EAST, botoes[3]);
         f.add(BorderLayout.CENTER, botoes[4]);
         
         
         
         /*JButton button = new JButton("Button 1 (PAGE_START)");
        f.add(button, BorderLayout.PAGE_START);

        //Make the center component big, since that's the
        //typical usage of BorderLayout.
        button = new JButton("Button 2 (CENTER)");
  //      button.setPreferredSize(new Dimension(200, 100));
        f.add(button, BorderLayout.CENTER);

        button = new JButton("Button 3 (LINE_START)");
        f.add(button, BorderLayout.LINE_START);

        button = new JButton("Long-Named Button 4 (PAGE_END)");
        f.add(button, BorderLayout.PAGE_END);

        button = new JButton("5 (LINE_END)");
        f.add(button, BorderLayout.LINE_END);*/
         
        //Quando informe o layout nulo, 
        //para os componentes aparecerem, obrigatoriamente deve colocar o tamanho e a posição do componente
        //f.setLayout(null);
        //botoes[0].setBounds(10,20,200,40);
        //botoes[1].setBounds(10,80,200,40);
        //botoes[2].setBounds(10,140,200,40);
        //setBounds(Left, Top, Width, Height);  
        for (int i = 0; i < 10; i++) {

            //Vertical
            // botoes[i].setBounds(10,i * 50,120,40);
            //Horizontal
            // botoes[i].setBounds(i * 130,10,120,40);
            //Escada
            // botoes[i].setBounds(i * 130,i * 50,120,40);
        }

        f.setVisible(true);
    }

}
