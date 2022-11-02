package Home3;

import java.util.Scanner;

public class Ex3_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        int month = input.nextInt();
        System.out.print("Введите год: ");
        int year = input.nextInt();
        switch (month) {
            case 1 -> System.out.println("В Январе " + year + "  31 день");
            case 2 -> System.out.println("В Феврале " + year + " 29 дней");
            case 3 -> System.out.println("В Марте " + year + " 31 день");
            case 4 -> System.out.println("В Апреле " + year + " 30 дней");
            case 5 -> System.out.println("В Мае " + year + " 31 день");
            case 6 -> System.out.println("В Июне " + year + " 30 дней");
            case 7 -> System.out.println("В Июле " + year + " 31 день");
            case 8 -> System.out.println("В Августе " + year + " 31 день");
            case 9 -> System.out.println("В Сентябре " + year + " 30 дней");
            case 10 -> System.out.println("В Октябре " + year + " 31 день");
            case 11 -> System.out.println("В Ноябре " + year + " 30 дней");
            case 12 -> System.out.println("В Декабре " + year + " 31 день");
        }
    }
}
