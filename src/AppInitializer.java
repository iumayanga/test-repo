import cal.Operations;

public class AppInitializer {
    public static void main(String[] args) {
        Operations operations = new Operations();
        int add = operations.add(1, 2);
        int sub = operations.sub(1, 2);
        int mul = operations.mul(1, 2);
        double div = operations.div(1, 2);

        System.out.println("addition of 1 & 2: "+add);
        System.out.println("subtract 2 from 1: "+sub);
        System.out.println("multiplication of 1 & 2: "+mul);
        System.out.println("divide 1 by 2: "+div);
    }
}
