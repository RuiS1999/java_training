package m6_3.main;
import m6_3.calculation.*;
public class Print {
    public static void main(String []args) throws Exception {
        System.out.println("乗の計算");
        System.out.println("元の数字を入力してください");
        int x = new java.util.Scanner(System.in).nextInt();
        System.out.println("何乗しますか？");
        int y = new java.util.Scanner(System.in).nextInt();
        System.out.println(x + "の" + y + "乗は...");
        Thread.sleep(3000);
        System.out.println(PrintCalculation.answer(x, y));
    }
}