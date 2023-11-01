package Exceptions;

public class NullPointer_Demo {
    public static void main(String args[]) {
        String a = null;
        try {
            System.out.println(a.charAt(0));
        } catch (NullPointerException npEx) {
            System.out.println("a value is null");

        }
    }
}

