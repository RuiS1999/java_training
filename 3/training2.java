public class training2 {
  public static void main(String []args){
    boolean doorClose = true;
    int num = 0;
    while (doorClose == true) {
      System.out.println("散歩に行きましょう");
      System.out.println("洗濯もします");
      num++;
      if (num == 3) {
        break;
      }
    }
  }
}