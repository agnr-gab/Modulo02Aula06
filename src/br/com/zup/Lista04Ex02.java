package br.com.zup;

public class Lista04Ex02 {
    public static void main(String[] args) {
        //2 - Faça um programa que mostra na tela os números de 100 a 1.
        for (int contador = 100; contador <= 1; contador--) {
            System.out.println("Contagem em andamento: " + contador--);

            if (contador == 1) {
                System.out.println("Contador finalizado!");
            }
        }
    }
}