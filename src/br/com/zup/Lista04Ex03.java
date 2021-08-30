package br.com.zup;

import java.util.Scanner;

public class Lista04Ex03 {
    public static void main(String[] args) {
    // 3 - Faça um programa para ler 5 números e mostrar o resultado da soma desses números.

        Scanner leitorSoma = new Scanner(System.in);
        System.out.println("Digite 5 números.");


        double soma = 0;
        int contador = 0;

        while (contador < 5) {
            System.out.println("Digite o número:");
            double numeroInserido = leitorSoma.nextDouble();
            soma = soma + numeroInserido;
            contador++;
        }
        System.out.println("A soma de todos os números inseridos é de: " +soma);

    }
}

