package homework26;

import java.util.Scanner;

public interface Gpt1 {
    public static void main(String[] args) {
        int[] numbers = {2,4, 6, 8, 10};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите индекс массива");
        int index = scanner.nextInt();

        try {
         int value = numbers[index];
            System.out.println("Значение " + index + " :" + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Неверно выбран индекс массива!");
        }
        System.out.println("конец программы");
    }
}
