package AlgoritmosCondicionais.C004;

import java.util.Scanner;

/*Faça um algoritmo que leia um número e informe se ele é divisível por 3 e por 5. */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = scanner.nextInt();

        if (n % 3 == 0 && n % 5 ==0){
            System.out.println("É divisivel por 3 e 5");
        }else {
            System.out.println("Não é divisivel por 3 e 5");
        }
    }
}
