package AlgoritmosSequencias.S002;

import java.util.Scanner;

/*Desenvolver um programa que leia dois valores e mostre o resto
da divisão do primeiro valor digitado pelo segundo e também a
exponenciação do segundo pelo primeiro valor lido.
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite dois números: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        System.out.println(n1 % n2);

        int expo = 0;
        int n2ex = 1;
        do {
            n2ex = n2ex * n2;
            expo++;
        }while (expo < n1);

        System.out.println(n2ex);
    }
}
