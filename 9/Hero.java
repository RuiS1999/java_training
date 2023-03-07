public class Hero {
    String name;
    int MAX_HP;
    int hp;
    // 勇者が装備している剣の情報
    Sword sword;
    public void attack() {
        System.out.println(this.name + "は" + this.sword.name + "で攻撃した");
        System.out.println("敵に" + this.sword.damage + "ダメージを与えた");
    }
    
    public Hero(String name, int MAX_HP, int hp) {
        this.MAX_HP = MAX_HP;
        this.hp = hp;
        this.name = name;
    }

    public Hero() {
        this("ダミー");
        this.MAX_HP = 50;
        this.hp = 50;
    }
}