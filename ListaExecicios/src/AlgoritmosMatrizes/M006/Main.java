package AlgoritmosMatrizes.M006;

import java.util.Scanner;
/*6 Dado uma matriz quadrada de ordem 3 faça um algoritmo que verifique se a matriz é
simétrica (aij=aji). */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        // Leitura da matriz 3x3
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Verifica se é simétrica
        boolean simetrica = true;
        for (int i = 0; i < 3 && simetrica; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break;
                }
            }
        }

        // Resultado
        if (simetrica) {
            System.out.println("A matriz é simétrica.");
        } else {
            System.out.println("A matriz NÃO é simétrica.");
        }
    }
}
