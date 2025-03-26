import java.io.BufferedReader;

import java.io.FileReader;

import java.io.IOException;

 

public class LeituraArquivo {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("dados.txt"))) {

            String linha;

            while ((linha = br.readLine()) != null) {

                System.out.println(linha);

            }

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}