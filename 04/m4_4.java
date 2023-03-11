public class m4_4 {
  public static void main (String []args){
    int [] seq = new int[20];
    for (int i = 0; i < seq.length - 1; i++) {
      seq[i] = new java.util.Random().nextInt(4);
    }

    for (int i = 0; i < seq.length - 1; i++) {
      switch (seq[i]){
        case 0:
          System.out.print("A");
          break;
        case 1:
          System.out.print("T");
          break;
        case 2:
          System.out.print("G");
          break;
        case 3:
          System.out.print("C");
          break;
      }
      System.out.print(" ");
    }
    System.out.println("");

    // 省力法
    int [] dna = new int[10];
    for (int i = 0; i < dna.length - 1; i++) {
      dna[i] = new java.util.Random().nextInt(4);
    }
    for (int i = 0; i < dna.length - 1; i++) {
      char[] base = {'A', 'T', 'G', 'C'};
      System.out.print(base[dna[i]] + " ");
    }
    System.out.println("");

    // 拡張法
    int[] scores = {20, 30, 40, 50, 60};
    for (int i = 0; i < scores.length; i++) {
      System.out.print(scores[i] + " ");
    }
    System.out.println("");
  }
}