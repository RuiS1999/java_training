public class m6_2 {
    public static void  main(String []args) {
        int[] heights = {172, 168, 180, 171, 159};
        java.util.Arrays.sort(heights);
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println("");
    }
}