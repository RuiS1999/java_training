public class m5_5 {
    public static int add(int x, int y){
        return x + y;
    }
    public static int addA(int x, int y){
        return x - y;
    }
    public static double add(double x, double y){
        return x + y;
    }
    public static String add(String x, String y){
        return x + y;
    }
    public static void main(String []args) {
        System.out.println(add(10, 20));
        System.out.println(addA(addA(20, 50), addA(100, 20)));
        System.out.println(addA(100, 20));
        System.out.println(add(3.5, 4.5));
        System.out.println(add("Hello", "World"));
    }
}