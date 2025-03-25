import java.io.File;

import java.io.FileNotFoundException;

import java.util.Scanner;

 

public class LeituraArquivo {

    public static void main(String[] args) {

        Scanner scanner = null;

 

        try {

            File arquivo = new File("arquivo.txt");

            scanner = new Scanner(arquivo);

 

            while (scanner.hasNextLine()) {

                System.out.println(scanner.nextLine());

            }

        } catch (FileNotFoundException e) {

            System.out.println("Erro: O arquivo não foi encontrado.");

        } finally {

            if (scanner != null) {

                scanner.close();

                System.out.println("Scanner fechado.");

            }

        }

    }

}