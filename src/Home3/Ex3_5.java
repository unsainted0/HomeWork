package Home3;

import java.util.Scanner;

public class Ex3_5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Укажите день недели целым числом: ");
        int date = in.nextInt();
        System.out.print("Укажите количество дней до события: ");
        int event_date = in.nextInt();
        int new_date = (date + event_date) % 7;
        String day = switch (date) {
            case 0 -> "Понедельник";
            case 1 -> "Вторник";
            case 2 -> "Среда";
            case 3 -> "Четверг";
            case 4 -> "Пятница";
            case 5 -> "Суббота";
            case 6 -> "Воскресенье";
            default -> "";
        };
        if (new_date == 0){
            System.out.print("Понедельник");
        }else if(new_date == 1){
            System.out.print("Вторник");
        }else if(new_date == 2){
            System.out.print("Среда");
        }else if(new_date == 3){
            System.out.print("Четверг");
        }else if(new_date == 4){
            System.out.print("Пятница");
        }else if(new_date == 5){
            System.out.print("Суббота");
        }else if(new_date == 6){
            System.out.print("Воскресенье");
        }
    }
}
