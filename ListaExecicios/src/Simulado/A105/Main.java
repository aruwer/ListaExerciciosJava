package Simulado.A105;
import java.util.Scanner;

import static Simulado.A105.VerificaPrimo.ehPrimo;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        if (ehPrimo(numero)) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " NÃO é um número primo.");
        }

        sc.close();
    }
}