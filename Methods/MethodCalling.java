package Methods;

public class MethodCalling {
    int sum = 0;
    public int add(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args){
        MethodCalling methodCalling = new MethodCalling();
        int z = methodCalling.add(22,44);
        System.out.println("Addition of Two Numbers:" + z);
    }
}
