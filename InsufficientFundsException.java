package homework26;

import java.util.Scanner;

public class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message) {
        super(message);
    }

    public class BankTest {
       static int balance = 5000;
    }

    public static void withdraw(int amount) throws InsufficientFundsException {
        if (amount > BankTest.balance) {
            throw new InsufficientFundsException("Ну и кого ты пытаешься нагреть?");
        } else {
            BankTest.balance -= amount;
            System.out.println("Вывод средств: " + amount );
            System.out.println("Остаток на счёте: " + BankTest.balance);
        }
    }
}
