package MyWorks;

import java.util.Scanner;

public class Ex2_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество лет: ");
        int years = input.nextInt();
        int population = 312032486 + (((31536000 / 7) - (31536000 / 13) + (31536000 / 45)) * years);
        System.out.println("Население через " + years + " лет составляет " + population + " человек");
    }
}