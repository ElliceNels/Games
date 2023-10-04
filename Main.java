import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number");
            int num1 = input.nextInt();
            System.out.println("Enter a second number");
            int num2 = input.nextInt();
            System.out.println("Enter an operation");
            String op = input.next();
            int result = 0;
            switch (op) {
                case "+" -> result = add(num1, num2);
                case "*" -> result = multiply(num1, num2);
                case "end" -> System.exit(0);
                default -> System.out.println("Not a valid operation");
            }
            System.out.println(num1 + " " + op + " " + num2 + " = " + result);
        }
    }

    public static int add(int num1, int num2) {
        int result = 0;
        result = num1 + num2;
        return result;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}

