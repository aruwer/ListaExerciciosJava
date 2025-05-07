package AlgoritmosCondicionais.C003;

import java.util.Scanner;

/*Escreva um algoritmo que leia um dividendo e o seu divisor e,
informe se o dividendo é divisível pelo seu divisor.
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o dividendo e o divisor: ");
        int dividendo = scanner.nextInt();
        int divisor = scanner.nextInt();

        if (dividendo % divisor == 0 ){
            System.out.println("É divisível");
        }else {
            System.out.println("Não é divisível");
        }
    }
}
