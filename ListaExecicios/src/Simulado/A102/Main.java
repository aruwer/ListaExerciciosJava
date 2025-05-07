package Simulado.A102;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a circunferência do quadril (em cm): ");
        double quadril = sc.nextDouble();

        System.out.print("Digite a altura (em metros): ");
        double altura = sc.nextDouble();

        System.out.print("Digite o sexo (M para masculino, F para feminino): ");
        char sexo = sc.next().toUpperCase().charAt(0);

        double iac = (quadril / (altura * Math.sqrt(altura))) - 18;

        System.out.printf("IAC calculado: %.2f%%\n", iac);

        String condicao;

        if (sexo == 'M') {
            if (iac < 8) {
                condicao = "Abaixo do peso";
            } else if (iac <= 20) {
                condicao = "Normal";
            } else if (iac <= 25) {
                condicao = "Sobrepeso";
            } else {
                condicao = "Obesidade";
            }
        } else if (sexo == 'F') {
            if (iac < 20) {
                condicao = "Abaixo do peso";
            } else if (iac <= 32) {
                condicao = "Normal";
            } else if (iac <= 38) {
                condicao = "Sobrepeso";
            } else {
                condicao = "Obesidade";
            }
        } else {
            condicao = "Sexo inválido";
        }

        System.out.println("Condição: " + condicao);
    }
}