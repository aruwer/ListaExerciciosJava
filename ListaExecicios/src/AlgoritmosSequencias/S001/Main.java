package AlgoritmosSequencias.S001;

import java.util.Scanner;

/*Criar um algoritmo que leia o valor de um produto e
imprima na console este valor com 30% de acréscimo*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite dois números: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        System.out.println(n1 + " X " + n2 + " = " + (n1*n2) * 0.3);
    }
}
