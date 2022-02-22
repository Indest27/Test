public class Comparator {
    private int num1;
    private int num2;

    public Comparator(int number1, int number2) {
        num1 = number1;
        num2 = number2;
    }

    public String compare() {
        String result = "";

        if (num1 == num2) {
            result = "Числа равны";
        } else {
            if (num1 < num2) {
                result = "Первое число меньше второго";
            }
            if (num1 > num2) {
                result = "Первое число больше второго";
            }
        }
        return result;
    }
}
