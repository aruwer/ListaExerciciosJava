package AlgoritmosRepeticao.R001;

import java.util.Scanner;

/*Faça um algoritmo que leia um valor de referência, um número inicial e outro final.
Informe se o valor de referência encontra-se entre o número inicial e o final digitados.
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor de referência, um inicial e outro final: ");
        int ref = scanner.nextInt();
        int vinicial = scanner.nextInt();
        int vfinal = scanner.nextInt();

        boolean encontrado = false;

        for (int i = vinicial; i <= vfinal; i++){
            if (i == ref){
                encontrado = true;
                break;
            }
        }

        if (encontrado){
            System.out.println("O valor de referência está dentro do intervalo.");
        } else {
            System.out.println("O valor de referência NÃO está dentro do intervalo.");
        }
    }
}