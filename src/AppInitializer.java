import cal.Operations;

public class AppInitializer {
    public static void main(String[] args) {
        Operations operations = new Operations();
        int add = operations.add(1, 2);
        int sub = operations.sub(1, 2);
        int mul = operations.mul(1, 2);
        double div = operations.div(1, 2);

        System.out.println("addition: "+add);
        System.out.println("subtraction: "+sub);
        System.out.println("multiplication: "+mul);
        System.out.println("division: "+div);
    }
}
