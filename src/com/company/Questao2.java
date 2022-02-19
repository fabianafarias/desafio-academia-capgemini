package com.company;

import java.util.Scanner;

public class Questao2 {

    /*
    # Questão 02
    Débora se inscreveu em uma rede social para se manter em contato com seus amigos.
    A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte.
    O site considera uma senha forte quando ela satisfaz os seguintes critérios:
    - Possui no mínimo 6 caracteres.
    - Contém no mínimo 1 digito.
    - Contém no mínimo 1 letra em minúsculo.
    - Contém no mínimo 1 letra em maiúsculo.
    - Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+

    Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte.
    Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser
    adicionados para uma string qualquer ser considerada segura.
     */

    public static void main(String[] args) {
        System.out.println("Insira uma senha forte:");
        Scanner entrada = new Scanner(System.in);
        String senha;
        final String minDigitosRequeridos = "^(?:(?=.*[0-9]).*)$";
        final String minLetrasMinusculasRequeridas = "^(?:(?=.*[a-z]).*)$";
        final String minLetrasMaiusculasRequeridas = "^(?:(?=.*[A-Z]).*)$";
        final String minCaracteresEspeciaisRequeridos = "^(?:(?=.*[!@#$%^&\\\\*()-+]).*)$";

        while(entrada.hasNextLine()) {
            senha = entrada.nextLine();

            if (
                    senha.length() >= 6 &&
                    senha.matches(minDigitosRequeridos) &&
                    senha.matches(minLetrasMinusculasRequeridas) &&
                    senha.matches(minLetrasMaiusculasRequeridas) &&
                    senha.matches(minCaracteresEspeciaisRequeridos)
            ) {
                System.out.println("Senha inserida com SUCESSO!");
            }
            else if(senha.length() < 6){
                System.out.println("Senha fraca: " + senha + ". A senha precisa ter no mínimo 6 CARACTERES.");
                System.out.println("Insira uma senha forte:");
            }
            else if(!senha.matches(minDigitosRequeridos)){
                System.out.println("Senha fraca: " + senha + ". A senha precisa ter no mínimo UM DÍGITO.");
                System.out.println("Insira uma senha forte:");
            }
            else if(!senha.matches(minLetrasMinusculasRequeridas)){
                System.out.println("Senha fraca: " + senha + ". A senha precisa ter no mínimo 1 LETRA MAIUSCULA.");
                System.out.println("Insira uma senha forte:");
            }
            else if(!senha.matches(minLetrasMaiusculasRequeridas)){
                System.out.println("Senha fraca: " + senha + ". A senha precisa ter no mínimo 1 LETRA MAIUSCULA.");
                System.out.println("Insira uma senha forte:");
            }
            else if(!senha.matches(minCaracteresEspeciaisRequeridos)){
                System.out.println("Senha fraca: " + senha + ". A senha precisa ter no mínimo 1 CARACTERE ESPECIAL.");
                System.out.println("Insira uma senha forte:");
            }
            else {
                System.out.println("Senha inserida com SUCESSO!");
                return;
            }
        }
    }

}
