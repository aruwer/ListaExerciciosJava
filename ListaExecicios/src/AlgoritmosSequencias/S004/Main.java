package AlgoritmosSequencias.S004;

import java.util.Scanner;

/*Faça um algoritmo que leia dois valores e mostre o ponto
percentual de acréscimo ou diminuição que ocorreu entre o
primeiro e segundo valor.
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite dois valores: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        double percentual = (n2 - n1);

        if (percentual < 0){
            System.out.println("Houve diminuição de " + percentual + "%");
        }else {
            System.out.println("Houve acréscimo de " + percentual + "%");
        }
    }
}
