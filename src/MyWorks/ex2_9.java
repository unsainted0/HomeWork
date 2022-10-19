package MyWorks;

import java.util.Scanner;

public class ex2_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите начальную скорость, конечную скорость и время: ");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();
        double a = (v1 - v0) / t;
        System.out.println("Среднее ускорение " + a);
    }
}