package Home3;

import java.util.Scanner;

public class Ex3_3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите a, b, c, d, e, f: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = in.nextDouble();
        double e = in.nextDouble();
        double f = in.nextDouble();
        if((a*d - b*c) == 0)
        {System.out.println(" Делить на 0 нельзя, решений нет");}
        else{
            double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
            double y = ((a * f) - (e * c)) / ((a * d) - (b * c));
            System.out.printf("x = " + x + " y = " + y);
        }

    }
}
