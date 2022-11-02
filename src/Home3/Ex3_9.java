package Home3;

import java.util.Scanner;

public class Ex3_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите первые 9 цифр ISBN, в виде целого числа: ");
        int isbn = input.nextInt();
        int d1 = isbn / 100000000;
        int remainingDigits = isbn % 100000000;
        int d2 = remainingDigits / 10000000;
        remainingDigits %= 10000000;
        int d3 = remainingDigits / 1000000;
        remainingDigits %= 1000000;
        int d4 = remainingDigits / 100000;
        remainingDigits %= 100000;
        int d5 = remainingDigits / 10000;
        remainingDigits %= 10000;
        int d6 = remainingDigits / 1000;
        remainingDigits %= 1000;
        int d7 = remainingDigits / 100;
        remainingDigits %= 100;
        int d8 = remainingDigits / 10;
        remainingDigits %= 10;
        int d9 = remainingDigits;
        int d10 = (d1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5
                + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
        System.out.println("10 цифра ISBN = " + d1 + d2 + d3 + d4 + d5
                + d6 + d7 + d8 + d9);
        if (d10 == 10)
            System.out.println("X");
        else
            System.out.println(d10);
    }
}
