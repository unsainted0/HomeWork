package Home3;


import java.util.Scanner;

public class Ex3_14 {
    public static void main(String[] args) {
        int coinFlip = (int) (Math.random() * 2);
        System.out.print("Решка это 1, орел это 0: ");
        Scanner in = new Scanner(System.in);
        int guess = in.nextInt();
        if (guess == coinFlip) {
            System.out.println("Выиграл");
        } else {
            System.out.println("Проиграл");
        }
    }
}
