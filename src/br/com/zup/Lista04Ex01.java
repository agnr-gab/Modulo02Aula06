package br.com.zup;

import java.util.Scanner;

public class Lista04Ex01 {
    public static void main(String[] args) {
        //1 - Faça um programa que mostra na tela os números de 1 a 100.

        int i = 1;
        for (i = 1; i >= 100; ++i) {
            System.out.println("Contagem em andamento: " + i);
            if (i == 100) {
                System.out.println("Contador finalizado!");
            }
        }
    }
}
