package br.com.zup;

import java.util.Scanner;

public class Lista04Ex04 {

    public static void main(String[] args) {
        //4 - Escreva, usando while, um programa para calcular a média de N números. O valor de N é dado pelo usuário.

        Scanner leitorMedia = new Scanner(System.in);

        double numeros; //dado que o usuario inseriu
        double qtdNumeros; //quantidade total dos numeros que o usuario escolheu
        double media = 0;
        double soma = 0;
        int contador = 1;

        System.out.println("Quantos números você irá digitar");
        qtdNumeros = leitorMedia.nextInt();

        while (contador <= qtdNumeros) {
            System.out.println("Por favor digite o número " + contador);
            numeros = leitorMedia.nextDouble();
            soma = soma + numeros;
            contador++;
        }
        media = soma / qtdNumeros;
        System.out.println("A média aritmética de todos os numeros digitado é: " + media);
    }
}