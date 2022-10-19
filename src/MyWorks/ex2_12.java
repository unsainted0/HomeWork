package MyWorks;

import java.util.Scanner;

public class ex2_12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите скорость самолета: ");
        double speed = input.nextDouble();
        System.out.print("Введите ускорение самолета: ");
        double acceleration = input.nextDouble();
        double length = (speed * speed) / (2 * acceleration);
        System.out.printf("Минимальная длинна взлетной полосы: %.2f\n", length);
    }
}