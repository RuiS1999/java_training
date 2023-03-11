public class SuperHero extends Hero {
    boolean flying;
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
    // 転ぶ
    /* 継承を用いる際に、finalが付けられたクラスは継承できない */
    public final void slip() {
        this.hp -= 5;
        System.out.println(this.name + "転ばなかった！");
    }
}