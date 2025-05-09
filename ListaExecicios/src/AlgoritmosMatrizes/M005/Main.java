package AlgoritmosMatrizes.M005;

import java.util.Scanner;
/*Dado uma matriz de ordem 4x4 faça um algoritmo que:
a) Calcule a soma dos elementos da primeira coluna ;
b) Calcule o produto dos elementos da primeira linha;
c) Calcule a soma de todos os elementos da matriz;
d) Calcule a soma do diagonal principal;
e) Calcule a soma da diagonal secundária*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] valores = new int[4][4];

        System.out.println("Digite os elementos da matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                valores[i][j] = scanner.nextInt();
            }
        }

        MatrizOperacoes matriz = new MatrizOperacoes(valores);

        System.out.println("\nResultados:");
        System.out.println("a) Soma da primeira coluna: " + matriz.somaPrimeiraColuna());
        System.out.println("b) Produto da primeira linha: " + matriz.produtoPrimeiraLinha());
        System.out.println("c) Soma de todos os elementos: " + matriz.somaTotal());
        System.out.println("d) Soma da diagonal principal: " + matriz.somaDiagonalPrincipal());
        System.out.println("e) Soma da diagonal secundária: " + matriz.somaDiagonalSecundaria());
    }
}

