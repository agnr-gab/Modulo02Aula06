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
            System.out.println("Digite o número " + contador++ + " :"); //mensagem exibida o usuário
            valorLidoPeloUsuario = leitorNumero.nextDouble();

            // Se o usuário digitar apenas um único número o número digitado é o menor e o maior número digitado (*raciocínio chave para a resolução*)
            if (contador == 1) {
                menorNumero = valorLidoPeloUsuario;
                maiorNumero = valorLidoPeloUsuario;
            } else {
                if (valorLidoPeloUsuario <= menorNumero){
                    menorNumero = valorLidoPeloUsuario;
                }
                if (valorLidoPeloUsuario >= maiorNumero) {
                    maiorNumero = valorLidoPeloUsuario;
                }
            }
            somaDosNumeros = somaDosNumeros + valorLidoPeloUsuario;
            //somaDosNumeros += valorLidoPeloUsuario ( <~~ pode ser escrito assim também)
            contador++; // sempre colocar no final do loop

            System.out.println("O menor número digitado é: " + menorNumero);
            System.out.println("O maior número digitado é: " + maiorNumero);
            System.out.println("A soma de todos os números digitados é: " + somaDosNumeros);
        }
    }
}
