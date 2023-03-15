public class Hero {
    String name = "椛蓮";
    int hp = 100;
    public Hero() {
        System.out.println("Heroのコントラクタが動作");
    }

    // 戦う
    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃！");
        m.hp -= 5;
        System.out.println("5ポイントのダメージを与えた！");
    }
    // 転ぶ
    /* 継承を用いる際に、finalが付けられたクラスは継承できない */
    /* 継承の上書きは実際は上書きではなく、インスタンスは親と子の両方が存在する。
    しかし、外部のインスタンスが優先されるため、子のインスタンスが呼び出され実行結果のようになる。 */
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