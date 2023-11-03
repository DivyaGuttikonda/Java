package Keywords;

class Parent {
    int field = 10;

    void printField() {
        System.out.println("Parent field: " + field);
    }
}

class Child extends Parent {
    Child() {
        super.field = 20; // Modify the parent class's field
    }

    void printField() {
        super.printField(); // Call the parent class's method to print its field
        System.out.println("Child field: " + field);
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.printField();
    }
}
