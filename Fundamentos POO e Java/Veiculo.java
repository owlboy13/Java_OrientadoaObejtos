import java.util.*;
import java.lang.*;
import java.io.*;

// Criando um sistema de Veículos com Herança em Java

class Veiculo {

    private String marca;
    private String modelo;
    private int ano;

    // Construtor da classe Veiculo
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
    }
}

class Carro extends Veiculo {
    private int numeroPortas;

    // Construtor da classe Carro
    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Número de Portas: " + numeroPortas);
    }
}

class Moto extends Veiculo {
    private int cilindradas;

    // Construtor da classe Moto
    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Cilindradas: " + cilindradas);
    }
}

public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro("Wolkswagem", "Golf", 2005, 4);
        Moto m1 = new Moto("Honda", "Hornet", 2010, 600);

        c1.exibirDetalhes();
        m1.exibirDetalhes();
    }
}