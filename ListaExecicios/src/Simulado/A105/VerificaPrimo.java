package Simulado.A105;

public class VerificaPrimo {

    public static boolean ehPrimo(int n) {
        if (n <= 1) {
            return false; // 0 e 1 não são primos
        }

        for (int i = 2; i <= Math.sqrt(n); i++) { // otimizado até a raiz quadrada
            if (n % i == 0) {
                return false; // tem outro divisor além de 1 e ele mesmo
            }
        }

        return true; // é primo
    }
}
