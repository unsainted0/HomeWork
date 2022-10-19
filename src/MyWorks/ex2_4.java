package MyWorks;

import java.util.Scanner;

public class ex2_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double constanta = 0.454;
        System.out.print("Введите значение в фунтах: ");
        double pounds = input.nextDouble();
        double kilograms = pounds * constanta;
        System.out.println(pounds + " фунтов(а) " + kilograms + " килограмм(а)");
    }
}