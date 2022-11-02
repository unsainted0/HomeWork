package MyWorks;

import java.util.Scanner;

public class Ex2_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double MY_CONSTANTA = 0.454;
        System.out.print("Введите значение в фунтах: ");
        double pounds = input.nextDouble();
        double kilograms = pounds * MY_CONSTANTA;
        System.out.println(pounds + " фунтов(а) " + kilograms + " килограмм(а)");
    }
}