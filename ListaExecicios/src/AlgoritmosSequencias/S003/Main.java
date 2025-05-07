package AlgoritmosSequencias.S003;

import java.util.Scanner;

/*Faça um algoritmo que leia o valor unitário de um produto,
a quantidade e o percentual de imposto. Calcule e mostre o
valor total do produto acrescentando o imposto lido*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        double valor = scanner.nextDouble();
        System.out.print("\nDigite a quantidade: ");
        int quant = scanner.nextInt();
        System.out.print("\nDigite o percentual de imposto: ");
        double imposto = scanner.nextDouble();

        System.out.println((valor * quant) * (imposto / 100));

    }
}
