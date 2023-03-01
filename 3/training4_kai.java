public class training4_kai {
  public static void main(String []args){
    System.out.println("あなたの運勢を占います");
    int fortune = new java.util.Random().nextInt(6) + 1;
    System.out.println(fortune);
    switch (fortune) {
      case 1:
        System.out.println("大吉");
        break;
      case 2:
      case 3:
        System.out.println("中吉");
        break;
      case 4:
      case 5:
        System.out.println("吉");
        break;
      case 6:
        System.out.println("凶");
    }

  }
}