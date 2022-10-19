package MyWorks;

import java.util.Scanner;

public class ex2_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число от 0 до 1000: ");
        int number = input.nextInt();
        int lessThanTans = number % 10;
        number /= 10;
        int tens = number % 10;
        number /= 10;
        int hundreds = number % 10;
        number /= 10;
        int sum = hundreds + tens + lessThanTans;
        System.out.println("Сумма цифр равна " + sum);
    }
}