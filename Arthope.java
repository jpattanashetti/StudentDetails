package Employee;

public class Arthope {
    public static void main(String[] args) {
        double num1 = 20.0;
        double num2 = 10.0;

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = 0;

        if (num2 != 0) {
            quotient = num1 / num2;
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        System.out.println("Addition: " + num1 + " + " + num2 + " = " + sum);
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + difference);
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + product);
        if (num2 != 0) {
            System.out.println("Division: " + num1 + " / " + num2 + " = " + quotient);
        }
    }
}
