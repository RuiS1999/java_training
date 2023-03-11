public class Hero {
    String name = "湊";
    int hp = 100;
    // 戦う
    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃！");
        m.hp -= 5;
        System.out.println("5ポイントのダメージを与えた！");
    }
    // 転ぶ
    public final void slip() {
        this.hp -= 5;
        System.out.println(this.name + "転んだ！");
        System.out.println(this.name + "は5のダメージを受けた");
    }
    // 逃げる
    public void run() {
        System.out.println(this.name + "は逃げ出した！");
    }
}