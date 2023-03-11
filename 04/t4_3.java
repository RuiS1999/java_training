public class t4_3 {
    public static void main(String []args) {
        // 練習問題1
        // int型の値を4つ持つ
        int[] points = new int[4];
        // double型の値を5つ持つ
        double[] weights = new double[5];
        // boolean型の値を3つ持つ
        boolean[] answers = new boolean[3];
        // String型の値を3つ持つ
        String[] names = new String[3];

        // 練習問題2
        int[] moneyList = {121902, 8302, 55100};
        for (int i = 0; i < moneyList.length; i++) {
            System.out.println(moneyList[i]);
        }
        for (int money : moneyList) {
            System.out.println(money);
        }

        // 練習問題3
        int[] numbers = {3, 4, 9};
        System.out.println("1桁の好きな数字を入力してください");
        int input = new java.util.Scanner(System.in).nextInt();
        for (int number : numbers) {
            if (number == input) {
                System.out.println("アタリ！");
            }
        }
    }
}