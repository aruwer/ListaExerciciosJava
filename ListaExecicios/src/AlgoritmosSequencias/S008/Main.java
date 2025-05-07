package AlgoritmosSequencias.S008;

import java.util.Scanner;

/*Escreva um programa que leia a idade de uma pessoa e mostre
na tela quantos segundos esta pessoa já viveu sem considerar ano bissexto.*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Viveu " + idade * 31536000 + " segundos");
    }
}
