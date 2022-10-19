package MyWorks;

import java.util.Scanner;

public class ex2_1 {
    public static void main(String[] args) {
        System.out.println("Введите значение в градусах Цельсия: ");
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
        double fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.println(celsius + " Цельсия равно " + fahrenheit + " по Фаренгейту");
    }
}