package Home3;

import java.util.Scanner;

public class Ex3_6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        final double KILOGRAMS_PER_POUND = 0.454;
        final double METERS_PER_INCH = 0.025;
        final double FEET_PER_INCH = 12;
        System.out.print("Введите вес в фунтах: ");
        double weight = input.nextDouble();
        System.out.print("Введите рост футы: ");
        int feet = input.nextInt();
        System.out.print("дюймы: ");
        int inches = input.nextInt();
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInInches = inches + (feet * FEET_PER_INCH);
        double heightInMeters = heightInInches * METERS_PER_INCH;
        double bmi = weightInKilograms /(heightInMeters * heightInMeters);
        System.out.println("Индекс массы тела = " + bmi);
        if (bmi < 18.5)
            System.out.println("Кушай побольше");
        else if (bmi < 25)
            System.out.println("Так держать");
        else if (bmi < 30)
            System.out.println("Пора в качалку");
        else
            System.out.println("Как ты дошел до этого?");
    }
}
