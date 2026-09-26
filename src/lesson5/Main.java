package lesson5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void func() {
        BufferedReader bufferedReader = null;
        // bad
        try {
            bufferedReader = new BufferedReader(new FileReader("Input.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bufferedReader = new BufferedReader(new FileReader("Input.txt"));
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }

    }
    public static int div(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void checkNumber(String string) {
        if (!string.startsWith("+7")) {
            throw new IllegalArgumentException("Номер не российский");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankService bank = new BankService();
        bank.signUp("goblin@gmail.com", "we1qweqwe");
        bank.signIn("goblin@gmail.com", "we1weqwe");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        try {
            System.out.println(div(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Ошибка арифметическая: " + e.getMessage());
        }
        checkNumber("+7");
    }
}
