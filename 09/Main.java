public class Main {
    public static void main(String []args) {
        // (名前, 最大HP, HP)
        Hero h = new Hero("kaji", 100, 50);
        // (剣の名前, 攻撃力)
        Sword s = new Sword("木の剣", 50);
        // swordフィールドに生成済みの剣インスタンスを代入
        h.sword = s;

        Hero h2 = new Hero("mali", 150, 130);
        Sword s2 = new Sword("鉄の剣", 10);
        h2.sword = s2;

        Wizard w = new Wizard("sakuya", 150, 150);

        Hero h0 = new Hero();
        System.out.println(h0.name);
        System.out.println(h0.MAX_HP);
        System.out.println(h0.hp);

        System.out.println(h.name + "の現在の武器は" + h.sword.name);
        h.attack();
        System.out.println(h2.name +"の現在の武器は" + h2.sword.name);
        h2.attack();
        w.heal(h2);
        w.heal(h);
        w.heal(h2);

    }
}