public class Matango {
    int hp;
    final int LEVEL = 10;
    char suffix;
    public Matango(char suffix) {
        this.suffix = suffix;
        this.hp = 50;
    }

    // 逃げる
    public void run() {
        System.out.println("お化けきのこ" + this.suffix + "は逃げ出した！");
    }

    // 攻撃する
    public void attack(Hero h) {
        System.out.println("お化けきのこ" + this.suffix + "の攻撃！");
        System.out.println("10のダメージ");
        h.hp -= 10;
    }
}