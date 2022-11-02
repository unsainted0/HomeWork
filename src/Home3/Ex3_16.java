package Home3;

public class Ex3_16 {
    public static void main(String[] args) {
        int width = (int)((Math.random() * (50 + 50)) -50);
        int height = (int)((Math.random() * (100 + 100)) -100);
        System.out.println("Случайная координата в прямоугольнике с центром (0;0)");
        System.out.println("с шириной 100 и высотой 200: (" + width + ";" + height + ")");
    }
}
