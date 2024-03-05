package questao01;

import java.util.Arrays;
import java.util.Scanner;

public class ReceberNome {
    public static void main(String[] args) {

        Scanner nome = new Scanner(System.in);
        String vetname[] = new String[3];
        String n;

        System.out.println("Insira um nome:");
        for (int i = 0; i < vetname.length; i++) {
            n = nome.nextLine();
            vetname[i] = n;
        }

        System.out.println("\n");

        Arrays.sort(vetname);
        for (int i = 0; i < vetname.length; i++) {
            System.out.println(vetname[i]);
        }
    }
}
