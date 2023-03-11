public class t2_4 {
  public static void main (String []args){
    System.out.println("数字あてゲーム");
    int num = new java.util.Random().nextInt(5) + 1;
    System.out.println("1~5までの好きな数字を入力してください");
    int input = new java.util.Scanner(System.in).nextInt();
    if (num == input) {
     System.out.println("正解！");
    } else {
      System.out.println("不正解…");
    }
  }
}