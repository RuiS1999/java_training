public class m5_6 {
    public static void incArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i]++;
        }
    }
    public static void main(String []args) {
        int[] array = {20, 30, 40};
        incArray(array);
        for (int i : array) {
            System.out.println(i);
        }
    }
}