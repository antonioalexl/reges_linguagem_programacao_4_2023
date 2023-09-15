/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula15.exemplos;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author alex.lopes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       /*JFrame frame = new JFrame();
       
        frame.setSize(400, 400);
        
        TableModel dataModel = new AbstractTableModel() {
            
            public int getColumnCount() {
                return 10;
            }
            public int getRowCount() {
                return 10;
            }
            public Object getValueAt(int row, int col) {
                return new Integer(row * col);
            }
        };        
        JTable table = new JTable(dataModel);
        JScrollPane scrollpane = new JScrollPane(table);
        frame.add(scrollpane);
        frame.setVisible(true);*/
        
        
       
       ExemploTabela exemplo = new ExemploTabela();
       exemplo.abrirTela();
               
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameTabela().setVisible(true);
            }
        });*/
        
        
    }
    
    
}
