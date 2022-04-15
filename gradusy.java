import java.util.Scanner;

public class gradusy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите температуру в Цельсиях");
        double c = sc.nextDouble();
        double d;
        d = c * 1.8 + 32;
        System.out.println("Температура в Фаренгейтах " + d);
        System.out.println("Введите температуру в Фаренгейтах");
        double f = sc.nextDouble();
        double b;
        b = (f - 32) / 1.8;
        System.out.println("Температура в Цельсиях " + b);
    }
}
