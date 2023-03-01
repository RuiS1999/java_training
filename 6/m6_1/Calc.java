// packageを使用
// package パッケージ名;
// 下記のようにドットで区切ったパッケージ名を多く用いられる
package m6_1.main;
import m6_1.logics.*;
public class Calc {
    public static void main(String []args) {
        int a = 10; int b = 2;
        // 2行目importで指定しているとm6_1.logicsがなくてもm6_1.logics.CalcLogicだよ指定してくれる
        int total = CalcLogic.tasu(a, b);
        int delta = m6_1.logics.CalcLogic2.hiku(a, b);
        System.out.println(a + "と" + b + "の足し算は" + total + "、引き算は" + delta);
    }
}