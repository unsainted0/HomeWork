package MyWorks;

import java.util.Scanner;

public class ex2_7 {
    public static void main(String[] args) {
        int year;
        int minute;
        int day;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите минуты: ");
        minute = scanner.nextInt();
        year = minute / 525600;
        day = (minute - year * 525600) / (24 * 60);
        System.out.println("Равно " + year + " лет, " + day + " дней");
    }
}