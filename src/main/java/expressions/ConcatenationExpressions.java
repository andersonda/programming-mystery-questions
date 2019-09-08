package expressions;

public class ConcatenationExpressions {
    public static void main(String[] args) {
        System.out.println(3 + 2 + 1 + " Blastoff!");
        System.out.println("Blastoff!" + 3 + 2 + 1);
        System.out.println(3 + 2 + (1 + " Blastoff!"));

        String hello = "world" + "1 + 2";
        System.out.println(hello);

        String world = 1 + "2" + 3 + "hello";
        System.out.println(world);

        System.out.println(world + hello);
        System.out.println("hello" + world + "!");
    }
}
