package br.com.zup;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        /*Faça um programa que receba um conjunto de N números (Digitado pelo usuário) e mostre:
                   ~~> O menor valor
                   ~~> O maior valor
                   ~~> A soma dos valores. */

        Scanner leitorNumero = new Scanner(System.in); //leitor de dados do usuário

        //variaveis
        double maiorNumero = 0;
        double menorNumero = 0;
        double somaDosNumeros = 0;
        double valorLidoPeloUsuario;
        int contador = 1;

        System.out.println("Digite a quantidade de números a serem analisados: ");
        double quantidadeDeValores = leitorNumero.nextDouble();

        while (contador <= quantidadeDeValores) {
            System.out.println("Digite o número " +contador+ " :");
        }



    }
}
