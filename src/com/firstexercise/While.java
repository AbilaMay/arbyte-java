package com.firstexercise;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();

        int contador = 0;
        while (contador <= 2) {

            contador ++;
        }

        if(numero1 % 2 == 0){
            System.out.println("é par");
        } else{
            System.out.println("impar");
        }

            System.out.println("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();

        if(numero2 % 2 == 0){
            System.out.println("é par");
        } else{
            System.out.println("impar");
        }

        System.out.println("Digite o terceiro numero: ");
        int numero3 = scanner.nextInt();

        if(numero3 % 2 == 0){
            System.out.println("é par");
        } else{
            System.out.println("é impar");
        }
    }
}
