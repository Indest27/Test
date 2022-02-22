import java.util.Scanner;

public class main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Число1:");
        int ch1 = scanner.nextInt();

        System.out.print("Число2:");
        int ch2 = scanner.nextInt();

        Comparator comparator = new Comparator(ch1, ch2);
        System.out.println(comparator.compare());
    }
}
