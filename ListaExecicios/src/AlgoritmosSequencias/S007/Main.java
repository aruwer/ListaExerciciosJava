package AlgoritmosSequencias.S007;

import java.util.Scanner;

/*Entrar com o ano de nascimento de uma pessoa e o ano atual e,
ao final imprimir a idade da pessoa.
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu ano de nascimento: ");
        int data = scanner.nextInt();
        System.out.println("Idade: " + (2025 - data));
    }
}
