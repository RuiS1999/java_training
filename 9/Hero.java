public class Hero {
    String name;
    int hp;
    // 勇者が装備している剣の情報
    Sword sword;
    public void attack() {
        System.out.println(this.name + "は" + this.sword.name + "で攻撃した");
        System.out.println("敵に" + this.sword.damage + "ダメージを与えた");
    }
}