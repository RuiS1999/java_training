public class t4_2 {
  public static void main (String []args) {
    System.out.println("【数当てゲーム】");
    int answer = new java.util.Random().nextInt(10);
    System.out.println("0~9の数字を入力してください");
    for (int i = 0; i < 3; i++) {
      int num = new java.util.Scanner(System.in).nextInt();
      if (answer == num) {
        System.out.println("アタリ！");
      } else {
        System.out.println("ハズレ...");
        if (i != 2) {
          System.out.print("ヒント:" + " ");
          if (num < answer) {
            System.out.println("答えは" + num + "より大きいです");
          } else {
            System.out.println("答えは" + num + "より小さいです");
          }
          System.out.println("あと" + (2 - i) + "回！！");
        }
      }
    }
    System.out.println("ゲームを終了します");
  }
}