package Exceptions;

public class ArthimeticExceptions {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException aEx) {
            System.out.println("Division by Zero");
        }
    }
}

