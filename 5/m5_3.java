public class m5_3 {
    public static void main(String []args) {
        int c = new java.util.Random().nextInt(5) + 1;
        for (int h = 0; h < c; h++) {
            System.out.println("List" + h);
            int x = new java.util.Random().nextInt(5) + 2;
            int y = new java.util.Random().nextInt(5) + 1;
            list(x, y);
        }
    }
    public static void list(int x, int y) {
        int[][] points = new int[x][y];
        for (int i = 0; i < points.length; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = new java.util.Random().nextInt(100);
                System.out.print(points[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}