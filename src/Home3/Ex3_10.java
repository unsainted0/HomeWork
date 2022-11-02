package Home3;

import java.util.Scanner;

public class Ex3_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);
        System.out.print(number1 + " + " + number2 + "= ");
        int answer = input.nextInt();
        if (number1 + number2 == answer)
            System.out.println("Верно");
        else
            System.out.println("Не верно, " + number1 + " + " + number2 + " = " + (number1 + number2));
    }
}
