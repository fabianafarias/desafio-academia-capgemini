package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao1 {

    /*
    # Questão 01
    Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços.
    A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.
     */

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
