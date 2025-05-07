package Simulado.A101;

import java.util.Scanner;
/*Embrulhar um presente de aniversário custa X reais. O presente de aniversário
custa Y reais a mais que o preço para embrulhá-lo. Quanto custará para comprar e embrulhar o presente?
Faça um programa que responda automaticamente a questão apresentada. O valor X e Y do problema
devem ser lidos e são valores reais.*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor para embrulhar o presente (X): ");
        double x = sc.nextDouble();

        System.out.print("Digite quanto o presente custa a mais que o embrulho (Y): ");
        double y = sc.nextDouble();

        double valorPresente = x + y;
        double valorTotal = x + valorPresente;

        System.out.printf("O valor total para comprar e embrulhar o presente é: R$ %.2f%n", valorTotal);

    }
}
