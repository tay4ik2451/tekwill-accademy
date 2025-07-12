package homework26;

import java.util.Scanner;

import static homework26.InsufficientFundsException.withdraw;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму которую желайте украсть:");
        int amount = scanner.nextInt();

        try {
            withdraw(amount);
        } catch (InsufficientFundsException e) {
            System.out.println("ошибка: " + e.getMessage());
        }
        System.out.println("Закончена...");
    }


}
