package Home3;

import java.util.Scanner;

public class Ex3_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите сумму в $: ");
        double amount = input.nextDouble();
        int remainder = (int)(amount * 100);
        int dollars = remainder / 100;
        remainder %= 100;
        int pennies = remainder;
        System.out.println("Ваша сумма это: ");
        System.out.println(" " + dollars + (dollars == 1 ? " dollar" : " dollars"));
        System.out.println(" " + pennies + (pennies == 1 ? " penny" : " pennies"));
    }
}
