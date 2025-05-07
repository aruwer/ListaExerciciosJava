package Simulado.A103;

import java.util.Scanner;
/*Escreva um programa que leia um valor inteiro, calcule e mostre o seu fatorial. Fatorial
de um número natural n, representado por n!, é o produto de todos os inteiros positivos menores ou
iguais a n. Exemplo: 3! = 6, ou seja, 1 x 2 x 3 = 6.
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Fatorial não é definido para números negativos.");
        } else {
            long fatorial = 1;

            for (int i = 1; i <= n; i++) {
                fatorial *= i;
            }

            System.out.println("O fatorial de " + n + " é: " + fatorial);
        }
    }
}
