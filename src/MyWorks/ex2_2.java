package MyWorks;

import java.util.Scanner;

public class ex2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double pi = 3.14;
        System.out.print("Введите радиус и длинну цилиндра: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        double area = radius * radius * pi;
        double volume = area * length;
        System.out.println("Площадь равна " +  area);
        System.out.println("Объем равен " + volume);
    }
}