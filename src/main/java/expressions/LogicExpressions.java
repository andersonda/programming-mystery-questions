package expressions;

public class LogicExpressions {
    public static void main(String[] args) {
        int x = 55;
        int y = 30;
        int z = -5;

        System.out.println(y < x);
        System.out.println(x > y && x < z);
        System.out.println(x + y + z <= 80);
        System.out.println(x < y != false);
        System.out.println(x % 2 == 0 || y % 2 == 0);
        System.out.println(!(y * 2 > x));
        System.out.println(!(x > y && y > z));
        System.out.println(x < y || y < z || x < z);
    }
}
