package questão02;

import java.util.Scanner;

public class InserirNum {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        SomeValor sum = new SomeValor();

        System.out.println("Insira 10 numeros: ");
        int[] vetorNum = new int[10];
        int n;

        for (int i = 0; i < vetorNum.length; i++) {
            n = num.nextInt();
            vetorNum[i] = n;
        }

        int somei = sum.somador(vetorNum);

        System.out.println(somei);
    }
}
