public class m5_4 {
    public static void main(String []args) {
        System.out.println(add(add(10, 100), add(30, 40)));
    }
    public static int add(int x, int y) {
        int ans = x - y;
        return ans;
    }
}