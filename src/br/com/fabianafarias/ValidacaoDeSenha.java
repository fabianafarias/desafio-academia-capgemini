package br.com.fabianafarias;

import java.util.Scanner;

public class ValidacaoDeSenha {

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
