public class m5_7 {
    public static int[] newArray(int size) {
        int[] narray = new int[size];
        for (int i = 0; i < narray.length; i++) {
            narray[i] = i;
        }
        return narray;
    }
    public static void main(String []args) {
        int[] array = newArray(3);
        for (int i : array) {
            System.out.println(i);
        }
    }
}