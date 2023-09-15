/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula11.exemplos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JWindow;

/**
 *
 * @author alex.lopes
 */
public class Aula11Exemplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setLocation(100, 100);
        frame.setSize(400, 400);
        frame.setTitle("Faculdade Reges");
        frame.setLayout(new FlowLayout());

        JLabel labelText = new JLabel();
        labelText.setText("Teste Panel");

        /* JPanel panel = new JPanel();
        panel.add(labelText);
        panel.setBackground(Color.red);
        frame.getContentPane().add(panel);*/

 /*JWindow window = new JWindow();
        window.setSize(300, 300);
        window.setLocation(100, 100);
        window.setVisible(true);*/
 /*  String[] herois = {"Capitão América", "Homem de Ferro", "Thor"};
        JList list = new JList(herois);
        list.setSize(150,150);        
        frame.add(list);*/
        JButton botao = new JButton("Clique aqui");
        frame.add(botao);

        botao.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Detectado clique no botão 1");
            }

        });

        // frame.pack();
        /*JLabel label = new JLabel();
        label.setText("Texto do JLabel");
        frame.add(label);*/
        JTextField txtNome = new JTextField();
        txtNome.setText("Texto Padrão");
        txtNome.setColumns(15);
        txtNome.getText();
        frame.add(txtNome);
        /* JTextArea txtArea = new JTextArea();
        txtArea.setText("Texto possui \n mais de uma linha");
        txtArea.setRows(10);
        txtArea.setColumns(10);
        frame.add(txtArea);*/
 /* JComboBox combo = new JComboBox();
        combo.addItem("Item -  1");
        combo.addItem("Item -  2");
        combo.addItem("Item -  3");
        combo.addItem("Item -  4");
        frame.add(combo);*/
 /* JCheckBox chec = new JCheckBox();
        chec.setText("Valido");                                
        frame.add(chec);*/
 /* JRadioButton radioMa = new JRadioButton();
        radioMa.setText("Valido");                                
        frame.add(radioMa);*/

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frmOlaMundo frame2 = new frmOlaMundo();
        frame2.setLocation(200, 200);
        frame2.setSize(400, 400);
        frame2.setTitle("Faculdade Reges - 2");
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame2.setVisible(true);

    }

}
