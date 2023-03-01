public class m4_8 {
    public static void main(String []args) {
        int[] [] scores = new int[3][4];
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            float sumI = 0; 
            float avgI = 0;
            System.out.print(i + "列: ");
            for (int j = 0; j < 4; j++) {
                scores[i][j] = new java.util.Random().nextInt(100);
                System.out.print(scores[i][j] + " ");
                sumI += scores[i][j];
                sum += sumI;
            }
            avgI = sumI / scores[i].length;
            System.out.println("");
            System.out.println(i + "列の合計は" + String.format("%.0f", sumI));
            System.out.println(i + "列の平均は" + avgI);
            System.out.println("");
        }
        System.out.println("全ての数の合計は" + sum);
    }
}