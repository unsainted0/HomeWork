package Home3;

import java.util.Scanner;

public class Ex3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digit1 = (int)(Math.random() * 10);
        int digit2 = (int)(Math.random() * 10);
        int digit3 = (int)(Math.random() * 10);
        System.out.print(
                "Сколько будет " + digit1 + " + " + digit2 + " + " + digit3 + "? ");
        int answer = input.nextInt();
        System.out.println(digit1 + " + " + digit2 + " + " + digit3 + " = " + answer + " это " + (digit1 + digit2 + digit3 == answer));
    }
}
