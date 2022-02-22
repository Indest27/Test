import java.util.Scanner;

public class main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число:");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число:");
        int num2 = scanner.nextInt();

        System.out.print("Введите операцию:");
        String operator = scanner.next();

        Calculator calculator = new Calculator(num1, num2, operator);

        calculator.calculate();
        if (!calculator.isFailure()) {
            System.out.println(calculator.getResult());
        } else
            System.out.println("Попытка деления на ноль!");
    }
}, злодей
