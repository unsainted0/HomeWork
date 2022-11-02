package Home3;

import java.util.Scanner;

public class Ex3_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите трехзначное число: ");
        int number = input.nextInt();
        int digit1 = (number / 100);
        int remaining = number % 100;
        int digit3 = (remaining % 10);
        System.out.println(number + ((digit1 == digit3) ? " является " : " не является ") + "палиндромом");
    }
}
