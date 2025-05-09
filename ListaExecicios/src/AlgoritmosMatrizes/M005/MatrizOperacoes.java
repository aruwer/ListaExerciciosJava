package AlgoritmosMatrizes.M005;

public class MatrizOperacoes {
    private int[][] matriz;

    public MatrizOperacoes(int[][] matriz) {
        this.matriz = matriz;
    }

    public int somaPrimeiraColuna() {
        int soma = 0;
        for (int i = 0; i < 4; i++) {
            soma += matriz[i][0];
        }
        return soma;
    }

    public int produtoPrimeiraLinha() {
        int produto = 1;
        for (int j = 0; j < 4; j++) {
            produto *= matriz[0][j];
        }
        return produto;
    }

    public int somaTotal() {
        int soma = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                soma += matriz[i][j];
            }
        }
        return soma;
    }

    public int somaDiagonalPrincipal() {
        int soma = 0;
        for (int i = 0; i < 4; i++) {
            soma += matriz[i][i];
        }
        return soma;
    }

    public int somaDiagonalSecundaria() {
        int soma = 0;
        for (int i = 0; i < 4; i++) {
            soma += matriz[i][3 - i];
        }
        return soma;
    }
}

