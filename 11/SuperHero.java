public class SuperHero extends Hero {
    boolean flying;
    public SuperHero() {
        System.out.println("SuperHeroのコントラクタが動作");
    }

    // 攻撃する
    public void attack(Matango m) {
        super.attack(m);
        if (this.flying) {
            super.attack(m);
        }
    }
    // 飛ぶ
    public void fly() {
        this.flying = true;
        System.out.println(this.name + "は飛び上がった！");
    }
    // 着地する
    public void land() {
        this.flying = false;
        System.out.println(this.name + "は着地した！");
    }
    // 逃げる
    public void run() {
        System.out.println(this.name + "は撤退した！");
    }
}