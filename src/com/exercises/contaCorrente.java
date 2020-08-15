package com.firstexercise;

import java.util.Scanner;

public class contaCorrente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ag = 12345;
        int cc = 32145;
        int password = 123;
        float saldo = 2000;
        boolean ehValido = false;
        boolean senhaEhValida = false;
        int cont = 0;

        while (ehValido == false) {
            System.out.println("Digite sua agência: ");
            int agencia = scanner.nextInt();

            System.out.println("Digite sua conta: ");
            int conta = scanner.nextInt();

            if (agencia == ag && conta == cc) {
                ehValido = true;
            }
        }
    }
}