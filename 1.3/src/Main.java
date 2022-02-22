import java.util.Scanner;
import models.Rectangle;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ширину ");
        int width = scanner.nextInt();

        System.out.println("Введите высоту ");
        int height = scanner.nextInt();

        Rectangle rect = new Rectangle(width, height);

        System.out.println("Периметр прямоугольника равен:");
        System.out.println(rect.calcPerimeter());

        System.out.println("Диагональ");
        System.out.println(rect.calcDiag());
    }
}
