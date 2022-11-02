package Home3;

import java.util.Scanner;

public class Ex3_15 {
    public static void main(String[] args) {
        int lottery = (int) (Math.random() * 1000);
        Scanner numbers = new Scanner(System.in);
        System.out.println("Введите трехзначное число");
        int guess = numbers.nextInt();
        int lotteryDigit1 = lottery % 100;
        int lotteryDigit2 = lottery % 100 / 10;
        int lotteryDigit3 = lottery / 100;
        int guessDigit1 = guess % 100;
        int guessDigit2 = guess % 100 / 10;
        int guessDigit3 = guess / 100;
        System.out.println("Выиграл номер: " + lottery);
        if (guess == lottery)
            System.out.println("Вы выиграли 10,000$");
        else if (guessDigit2 == lotteryDigit1
                && guessDigit1 == lotteryDigit2
                && guessDigit3 == lotteryDigit3)
            System.out.println("Вы выиграли 3,000$");
        else if (guessDigit1 == lotteryDigit1
                || guessDigit1 == lotteryDigit2
                || guessDigit1 == lotteryDigit3
                || guessDigit2 == lotteryDigit1
                || guessDigit2 == lotteryDigit2
                || guessDigit2 == lotteryDigit3
                || guessDigit3 == lotteryDigit1
                || guessDigit3 == lotteryDigit2
                || guessDigit3 == lotteryDigit3)
            System.out.println("Вы выиграли 1,000$");
        else
            System.out.println("Повезет в другой раз");
    }
}