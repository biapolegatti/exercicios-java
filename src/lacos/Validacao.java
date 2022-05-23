package lacos;

import java.util.Scanner;

public class Validacao {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe seu nome");
        String nome = entrada.next();

        System.out.println("Informe sua idade");
        Integer idade = entrada.nextInt();

        System.out.println("Informe seu salário");
        Double salario = entrada.nextDouble();

        System.out.println("Informe seu sexo");
        String sexo = entrada.next();

        System.out.println("Informe seu estado civil");
        String estadoCivil = entrada.next();

        if (idade < 0 && idade > 150) {
            System.out.println("A idade deve maior que 0 e menor que 150");
        }

        if (salario < 0) {
            System.out.println("Seu salario deve ser maior que 0");
        }

        if (!sexo.equalsIgnoreCase("F") && !sexo.equalsIgnoreCase("M")) {
            System.out.println("Seu sexo deve ser F ou M");
        }

        if (!estadoCivil.equalsIgnoreCase("C") && !estadoCivil.equalsIgnoreCase("S") && !estadoCivil.equalsIgnoreCase("V") && !estadoCivil.equalsIgnoreCase("D")) {
            System.out.println("Seu estado civil está incorreto");
        }


    }

}


  /*  Faça um programa que leia e valide as seguintes informações:
        Nome: maior que 3 caracteres;
        Idade: entre 0 e 150;
        Salário: maior que zero;
        Sexo: 'f' ou 'm';
        Estado Civil: 's', 'c', 'v', 'd';*/