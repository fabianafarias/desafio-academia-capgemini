package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesenhandoUmaEscada {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        List<String> base = new ArrayList<>();

        System.out.print("Digite um número que defina o tamanho da escada: ");
        int altura = n.nextInt();

        for(int i = 0; i < altura; i++) {
            base.add(" ".repeat(altura - i) + "*".repeat(i + 1));
        }

        for(String b: base) {
            System.out.println(b);
        }
    }
}
