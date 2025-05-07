package AlgoritmosCondicionais.C002;

import java.util.Scanner;

/*Leia um número inteiro e informar se ele é par ou impar.*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = scanner.nextInt();

        if (n % 2 == 0){
            System.out.println(n + " é Par");
        }else {
            System.out.println(n + " é Impar");
        }
    }
}
