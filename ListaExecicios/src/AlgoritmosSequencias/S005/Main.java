package AlgoritmosSequencias.S005;

import java.util.Scanner;

/*Faça um algoritmo que leia um número inteiro qualquer e ao final mostre na tela:
1) O dobro do número que foi digitado
2) A sua terça parte
3) O seu antecessor
4) O seu sucessor*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1 = scanner.nextInt();

        System.out.println("1) O dobro do número que foi digitado: " + n1 * 2);
        System.out.println("2) A sua terça parte: " + n1 / 3);
        n1--;
        System.out.println("3) O seu antecessor: " + n1);
        n1++;
        n1++;
        System.out.println("4) O seu sucessor: "+ n1);
    }
}
