public class m5_2 {
    public static void main(String []args) {
        System.out.println("メソッドを呼び出します");
        hello("湊");
        hello("楓");
        hello("椛");
        System.out.println("メソッドの呼び出しを終了します");
    }
    public static void hello(String name) {
        System.out.println(name + "さん、こんにちは");
    }
}