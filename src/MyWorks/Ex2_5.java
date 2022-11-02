package MyWorks;

import java.util.Scanner;

public class Ex2_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите промежуточный итог и ставку чаевых: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();
        double gratuity = subtotal * (gratuityRate / 100);
        double total = subtotal + gratuity;
        System.out.println("Чаевые $" + gratuity +
                " Итог $" + total);
    }
}