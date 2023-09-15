/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula15.exemplos;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author alex.lopes
 */
public class ExemploTabela extends JFrame {
    
    
    JScrollPane barra;
    JPanel painelBack;
    JTable tabela;
    
    
    Object[][] data = {
        {"Bruce Banner ", "16 12345-777", "hulk@reges.edu.br"},
        {"Tony Stark", "16 8888-22222", "tony@reges.edu.br"},
        {"Steve Rogers", "48 1111-4444", "steve@reges.edu.br"}
    };

    String [] colunas = {"Nome", "Celular", "Email"};
    
    
    public ExemploTabela() {
        super ("Exemplo Tabela");
    }
    
    public void abrirTela(){

        painelBack = new JPanel();
        painelBack.setLayout(new GridLayout(1, 1));
        tabela = new JTable(data, colunas);
        barra = new JScrollPane(tabela);
        painelBack.add(barra);

        getContentPane().add(painelBack);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 120);
        setVisible(true);
        
        
        
        
    }

   

    
}
