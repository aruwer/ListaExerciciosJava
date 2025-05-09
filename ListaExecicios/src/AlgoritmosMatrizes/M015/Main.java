package AlgoritmosMatrizes.M015;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de dias do mês: ");
        int dias = scanner.nextInt();

        double[] temperaturas = new double[dias];

        for (int i = 0; i < dias; i++) {
            System.out.print("Temperatura do dia " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
        }

        double menor = temperaturas[0];
        double maior = temperaturas[0];
        double soma = 0;

        for (int i = 0; i < dias; i++) {
            double temp = temperaturas[i];
            if (temp < menor) menor = temp;
            if (temp > maior) maior = temp;
            soma += temp;
        }

        double media = soma / dias;

        int abaixoDaMedia = 0;
        for (double temp : temperaturas) {
            if (temp < media) {
                abaixoDaMedia++;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("a) Menor temperatura do mês: " + menor + "°C");
        System.out.println("b) Maior temperatura do mês: " + maior + "°C");
        System.out.printf("c) Temperatura média mensal: %.2f°C\n", media);
        System.out.println("d) Dias com temperatura abaixo da média: " + abaixoDaMedia);
    }
}
