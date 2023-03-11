public class m4_5 {
    public static void main(String []args) {
        int[] scores = new int[10];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = new java.util.Random().nextInt(100);
        }
        // 配列の要素を順番にすべて取り出す
        // for (要素の型 任意の変数名 : 配列変数名){...}
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println("");
    }
}