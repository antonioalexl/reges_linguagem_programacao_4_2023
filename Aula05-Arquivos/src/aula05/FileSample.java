/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05;

import java.io.File;

/**
 *
 * @author alex.lopes
 */
public class FileSample {

    public static void metodos(String caminho) {
        File arquivo = new File(caminho);

        if (arquivo.exists()) {
            System.out.println("O caminho especificado existe !\nVamos aos testes:\n");

            if (arquivo.isAbsolute()) {
                System.out.println("É um caminho absoluto");
            } else {
                System.out.println("Não é um caminho absoluto");
            }

            if (arquivo.isFile()) {
                System.out.printf("É um arquivo de tamanho %s bytes\n"
                        + "Útima vez modificado %s\n"
                        + "Cujo caminho é %s\n"
                        + "De caminho absoluto %s\n"
                        + "E está no diretório pai %s\n",
                        arquivo.length(), arquivo.lastModified(), arquivo.getPath(), arquivo.getAbsolutePath(), arquivo.getParent());
            } else {
                System.out.println("É um diretório cujo conteúdo tem os seguintes arquivos: ");
                String[] arquivos = arquivo.list();

                for (String file : arquivos) {
                    System.out.println(file);
                }
            }

        } else {
            System.out.println("Endereço errado");
        }
    }
}
