package questão02;

public class SomeValor {

    public static int somador(int[] vetorNum) {
        int soma = 0;

        for (int valor : vetorNum) {
            soma += valor;
        }
        return soma;

    }
}
