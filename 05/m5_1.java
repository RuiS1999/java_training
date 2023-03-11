public class m5_1 {
    public static void methodA() {
        System.out.println("こんにちは");
    }
    public static void main(String []args) {
        methodB();
    }
    public static void methodB() {
        System.out.println("楓さん、こんにちは！");
        methodA();
    }
}