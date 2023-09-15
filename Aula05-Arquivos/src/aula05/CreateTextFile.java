package aula05;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author alex.lopes
 */
public class CreateTextFile {

    private static Formatter output; // envia uma saída de texto para um arquivoÿ

    public static void main(String[] args) {
        openFile();
        addRecords();
        closeFile();
    }

    public static void openFile() {
        try {
            output = new Formatter("clients.txt"); // abre o arquivo
        } catch (SecurityException securityException) {
            System.err.println("Write permission denied. Terminating.");
            System.exit(1); // termina o programa
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1); // termina o programa
        }
    }

    public static void addRecords() {
        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n%s%n? ",
                "Digite numero da conta, primeiro nome, ultimo nome e saldo .",
                "Serão solicitados 3 registros.");

        int count = 0;
        
        while (count < 3) { // faz um loop até o indicador de fim de arquivo
            
            try {
                // gera saída do novo registro para o arquivo; supõe entrada válida                              
                output.format("%d %s %s %.2f%n", input.nextInt(), 
                input.next(), input.next(), input.nextDouble());                
                                
            } catch (FormatterClosedException formatterClosedException) {
                System.err.println("Error writing to file. Terminating.");
                break;
            } catch (NoSuchElementException elementException) {
                System.err.println("Invalid input. Please try again.");
                input.nextLine(); // descarta entrada para o usuário tentar de novo
            }
            System.out.print("? ");
            
            count ++;
        } // fim do while
        
          System.out.print("caiu ");
    } //

    public static void closeFile() {
        if (output != null) {
            output.close();
        }
    }
}