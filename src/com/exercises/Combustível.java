package com.firstexercise;

import java.util.Scanner;

public class Combustível {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos litros de alcool foram consumidos? ");
        int Aalcool = scanner.nextInt();

        System.out.println("Quantos litros de gasolina foram consumidos? ");
        int Ggasolina = scanner.nextInt();

        double ValorAlcool = Aalcool *2.90;
        double ValorGasolina = Ggasolina *3.30;
        double ValorTotal = ValorAlcool + ValorGasolina;

        System.out.println("O valor total gasto com gasolina foi de R$"+ ValorGasolina);

        System.out.println("O valor total gasto com alcool foi de R$"+ ValorAlcool);

        System.out.println("O valor total gasto foi de R$"+ValorTotal);
    }
}
