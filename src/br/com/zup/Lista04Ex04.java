package br.com.zup;

import java.util.Scanner;

public class Lista04Ex04 {

    public static void main(String[] args) {
        Scanner leitorMedia = new Scanner(System.in);
        // 3 - Faça um programa para ler 5 números e mostrar o resultado da soma desses números.
        System.out.println("Digite a quantidade de números, por favor:");

        double qtdNumeros = leitorMedia.nextDouble();
        double soma = 0;
        double media = 0;
        int contador = 0;

        while (contador < qtdNumeros) {
            System.out.println("Digite um número");
            double valorInserido = leitorMedia.nextDouble();
            soma = soma + valorInserido;
            contador++;
        }
        media = soma / qtdNumeros;
        System.out.println("A média de todos os números inseridos é de: " +media);
    }
}