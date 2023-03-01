public class t5_4 {
    public static void main(String []args) {
        System.out.println("三角形の底辺を入力してください");
        double bottom = new java.util.Scanner(System.in).nextDouble();
        System.out.println("三角形の高さを入力してください");
        double height = new java.util.Scanner(System.in).nextDouble();
        System.out.println("三角形の底辺は" + bottom + "cm");
        System.out.println("三角形の高さは" + height + "cm");
        System.out.println("三角形の面積は" + calcTriangleArea(bottom, height));
        System.out.println("");
        System.out.println("");

        System.out.println("円の半径を入力してください");
        double radius = new java.util.Scanner(System.in).nextDouble();
        System.out.println("円の半径は" + radius + "cm");
        System.out.println("円の面積は" + calcCircleArea(radius));
    }
    public static double calcTriangleArea(double bottom, double height) {
        return bottom * height / 2;
    }
    public static double calcCircleArea(double radius) {
        double result = 1;
        for (int i = 0; i < 2; i++) {
            result *= radius;
        }
        return result * 3.14;
    }
}