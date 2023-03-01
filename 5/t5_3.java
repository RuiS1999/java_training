public class t5_3 {
    public static void main(String []args) {
        System.out.println("アドレスを入力してください");
        String address = new java.util.Scanner(System.in).nextLine();
        System.out.println("本文を入力してください");
        String text = new java.util.Scanner(System.in).nextLine();
        email(address, text);
    }
    public static void email(String address, String title, String text) {
        System.out.println("アドレス: " + address);
        System.out.println("件名: " + title);
        System.out.println("本文: " + text);
    }
    public static void email(String address, String text) {
        System.out.println("アドレス: " + address);
        System.out.println("件名: 無題" );
        System.out.println("本文: " + text);
    }
}