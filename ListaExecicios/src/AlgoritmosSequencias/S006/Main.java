package AlgoritmosSequencias.S006;

import java.util.Scanner;

/*Faça um algoritmo que leia um valor inteiro e apresente
no final o resultado do quadrado deste número.
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int n1 = scanner.nextInt();

        System.out.println(n1*n1);
    }
}
