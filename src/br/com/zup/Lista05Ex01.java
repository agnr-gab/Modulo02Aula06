package br.com.zup;

import java.util.Scanner;

public class Lista05Ex01 {
    public static void main(String[] args) {
        // 1 - Faça um programa para ler uma quantidade de números (N) digitada pelo usuário e mostrar a quantidade de números pares desses números.

        Scanner leitorNumPares = new Scanner(System.in);
        System.out.println("Digite a quantidade de números para exibir:");
        int contador = 1;


        double qtdNumeros = leitorNumPares.nextDouble();

        while (contador <= qtdNumeros) {
            System.out.println("Digite o número " + contador++ + " :" );
            double numeroInseridoUsuario = leitorNumPares.nextDouble();
        if (numeroInseridoUsuario % 2 == 0) {
            qtdNumeros = qtdNumeros + 1;
        }
        contador ++;
        }
        System.out.println("A quantidade de números pares é: " +qtdNumeros);

    }
}
