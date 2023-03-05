public class Main {
    public static void main(String []args) {
        Hero h = new Hero("kaji");
        Sword s = new Sword("木の剣", 50);
        // swordフィールドに生成済みの剣インスタンスを代入
        h.sword = s;

        Hero h2 = new Hero("mali");
        Sword s2 = new Sword("鉄の剣", 10);
        h2.sword = s2;

        Wizard w = new Wizard();
        w.name = "sakuya";
        w.MAX_HP = 150;
        w.hp = 150;

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