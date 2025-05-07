package Simulado.A104;

import java.util.Scanner;
/* Escreva um algoritmo que leia uma matriz quadrada de sétima ordem M(7,7), 7 linhas
e 7 colunas, e efetue a soma dos elementos da diagonal principal (canto superior esquerdo ao canto
inferior direito). Depois de calculado mostre a soma na tela.*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[7][7];
        int somaDiagonal = 0;

        System.out.println("Digite os elementos da matriz 7x7:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("M[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();

                if (i == j) {
                    somaDiagonal += matriz[i][j];
                }
            }
        }

        System.out.println("A soma da diagonal principal é: " + somaDiagonal);
    }
}