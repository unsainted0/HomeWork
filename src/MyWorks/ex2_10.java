package MyWorks;

import java.util.Scanner;

public class ex2_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите кол-во воды в кг: ");
        double M = input.nextDouble();
        System.out.print("Введите начальную температуру: ");
        double t0 = input.nextDouble();
        System.out.print("Введите конечную температуру: ");
        double t1 = input.nextDouble();
        double Q = M * (t1 - t0) * 4184;
        System.out.println("Энергии потребуется " + Q + " Дж");
    }
}