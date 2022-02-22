public class Calculator {
    private int num1;
    private int num2;
    private String operator;
    private Boolean isFailed = false;
    private double result;

    public Calculator(int number1, int number2, String operation) {
        num1 = number1;
        num2 = number2;
        operator = operation;
    }

    public double getResult() {
        return result;
    }

    public Boolean isFailure() {
        return isFailed;
    }

    public void calculate() {
        try {
            switch (operator) {
                case ("+"):
                    result = num1 + num2;
                    break;
                case ("-"):
                    result = num1 - num2;
                    break;
                case ("*"):
                    result = num1 * num2;
                    break;
                case ("/"):
                    result = num1 / num2;
                    break;
            }
        } catch(Exception e) {
            isFailed = true;
        }
    }
}
