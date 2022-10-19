package MyWorks;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ex2_8 {
    public static void main(String[] args) {
        System.out.println("Дата и время: ");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(new Date()));
        Scanner input = new Scanner(System.in);
        System.out.print("Введите смещение времени по Гринвичу(GMT): ");
        int offset = input.nextInt();
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        currentHour = currentHour + offset;
        System.out.println("Сейчас " + currentHour + ":"
                + currentMinute + ":" + currentSecond);
    }
}