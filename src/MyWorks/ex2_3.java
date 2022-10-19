package MyWorks;

import java.util.Scanner;

public class ex2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double constanta = 0.305;
        System.out.print("Введите значение в футах: ");
        double feet = input.nextDouble();
        double meters = feet * constanta;
        System.out.println(feet + " футов равно " + meters + " метров");
    }
}