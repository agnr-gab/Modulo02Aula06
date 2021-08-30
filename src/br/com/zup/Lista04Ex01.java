package br.com.zup;

public class Lista04Ex01 {

    public static void main(String[] args) {

        //1 - Faça um programa que mostra na tela os números de 1 a 100.

        for (int contador = 1; contador <= 100; contador++) {
            System.out.println("Contagem em andamento: " + contador);

            if (contador == 100) {
                System.out.println("Contador finalizado!");
            }
        }
    }
}
