package m6_3.calculation;
public class PrintCalculation {
    public static int answer(int x, int y) {
        int jou = 1;
        for (int i = 0; i < y; i++) {
            jou *= x;
        }
        return jou;
    }
}