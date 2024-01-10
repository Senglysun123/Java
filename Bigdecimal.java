import java.math.BigDecimal;
import java.util.Scanner;

public class Bigdecimal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        BigDecimal firstNumber = new BigDecimal(scanner.nextLine());

        System.out.println("Enter second number:");
        BigDecimal secondNumber = new BigDecimal(scanner.nextLine());

        System.out.println("Enter operator (+,-,*,/):");
        String operator = scanner.nextLine();

        BigDecimal result = null;

        switch (operator) {
            case "+":
                result = firstNumber.add(secondNumber);
                break;
            case "-":
                result = firstNumber.subtract(secondNumber);
                break;
            case "*":
                result = firstNumber.multiply(secondNumber);
                break;
            case "/":
                result = firstNumber.divide(secondNumber);
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }

        if (result != null) {
            System.out.println("Result: " + result);
        }
    }
}
