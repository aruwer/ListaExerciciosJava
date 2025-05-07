package AlgoritmosCondicionais.C001;

import java.util.Scanner;

/*Faça um algoritmo que leia dois valores numéricos e efetue a multiplicação entre eles,
caso o resultado deve ser apresentado caso seja maior que o primeiro valor lido ao
quadrado*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite dois valores: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int mult = n1 * n2;
        n1 = n1 * n1;
        if (mult > n1) System.out.println(mult);
    }
}
