package Exceptions;

public class ArrayIndexOutOfBoundException {
    public static void main(String args[]) {
        String[] arr1 = {"Divi", "Vysu", "Alex", "John", "Wanda"};
        try {
            for (int i = 0; i <= arr1.length; i++) {
                System.out.println(arr1[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array is out of index");
        }
    }
}
