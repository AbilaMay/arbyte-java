package com.sge;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoginSystem {

    Map<String, String> users = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    private Boolean isPasswordCorrect(String username, String password) {
        return users.get(username).equals(password);
    }

    private static String CreateUsername(String name, String surname) {
        String[] surnames = surname.split(" ");
        String lastname = surnames[surnames.length-1];

        return (name.charAt(0) +"_"+ lastname).toLowerCase();
    }

    private static Boolean IsPasswordValid(String password) {
        return password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");
    }

    public void SignIn() {
        System.out.print("Digite o seu usuário: ");
        String username = scanner.next();
        System.out.print("Digite a sua senha: ");
        String password = scanner.next();

        if (isPasswordCorrect(username, password)) {
            System.out.print("Sua senha está correta!");
        } else {
            System.out.print("Sua senha está incorreta!");
        }
    }

    public void SignUp() {
        boolean isValid;
        String password = "";

        System.out.print("Digite o seu primeiro nome: ");
        String name = scanner.nextLine();
        System.out.print("Digite o seu sobrenome: ");
        String surname = scanner.nextLine();

        String username = CreateUsername(name, surname);
        System.out.println("Seu usuário é: " + username);

        while (isValid = !IsPasswordValid(password)) {
            System.out.print("Digite sua senha: ");
            password = scanner.next();

            if (!password.equals("")) {
                System.out.println("Senha incorreta");
            }
        }

        users.put(username, password);
    }

    public static void main(String[] args) {
        LoginSystem main = new LoginSystem();
        main.SignUp();
        System.out.println();
        main.SignIn();
    }
}
