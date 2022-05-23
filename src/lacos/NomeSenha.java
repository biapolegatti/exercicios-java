package lacos;

import java.util.Scanner;

public class NomeSenha {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o seu nome");
        String nome = entrada.next();

        System.out.println("Informe sua senha");
        String senha = entrada.next();

     while (nome.equalsIgnoreCase(senha)) {
            System.out.println("O seu nome e a senha não podem ser iguais, informe sua nova senha: ");
            senha = entrada.next();
        }

        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua senha é: " + senha);
    }
}

/*Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário,
  mostrando uma mensagem de erro e voltando a pedir as informações.*/