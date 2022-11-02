package Home3;

import java.util.Scanner;

public class Ex3_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите 3 числа: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        int liberty;
        if (number2 < number1 || number3 < number1)
        {
            if (number2 < number1)
            {
                liberty = number1;
                number1 = number2;
                number2 = liberty;
            }
            if (number3 < number1)
            {
                liberty = number1;
                number1 = number3;
                number3 = liberty;
            }
        }
        if (number3 < number2)
        {
            liberty = number2;
            number2 = number3;
            number3 = liberty;
        }
        System.out.println(number1 +" "+ number2 +" "+ number3);
    }
}
