public class m4_3 {
  public static void main (String []args){
    // 要素の型[] 任意の変数名 = new 要素の型[配列の数];
    int [] s = new int[5];
    s[1] = 30;
    int n = s.length;
    System.out.println("要素の数は" + n);
    System.out.println(s[1]);

    // 省略法1
    // 要素の型[] 任意の変数名 = new 要素の型[] {配列の中身};
    String [] words = new String[] {"new", "delete", "create", "update", "index", "show"};
    int number = words.length;
    System.out.println("要素の数は" + number);
    System.out.println(words[4]);

    // 省略法2
    // 要素の型[] 任意の変数名 = new 要素の型[配列の数] {配列の中身};
    String [] members = new String[] {"Tanaka", "Date", "Kurita", "Ueda"};
    int nur = members.length;
    System.out.println("要素の数は" + nur);
    System.out.println(members[0]);

    int [] scores = new int[] {69, 47, 59, 89, 90};
    for (int i = 0; i < scores.length; i++){
      System.out.println(scores[i]);
    }
    int sum = 0;
    for (int i = 0; i < scores.length; i++){
      sum += scores[i];
    }
    int count = 0;
    int avg = sum /scores.length;
    for (int i = 0; i < scores.length; i++){
      if (scores[i] > 60){
        count++;
      }
    }
    System.out.println("合計点が" + sum + "点");
    System.out.println("平均点が" + avg + "点");
    System.out.println("60点以上が" + count + "つです");
  }
}