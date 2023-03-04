public class Main {
    public static void main(String []args) {
        Hero h = new Hero();
        h.name = "kaji";
        h.hp = 200;
        Sword s = new Sword();
        s.name = "木の剣";
        s.damage = 5;
        // swordフィールドに生成済みの剣インスタンスを代入
        h.sword = s;

        Hero h2 = new Hero();
        h2.name = "mali";
        h2.hp = 300;
        Sword s2 = new Sword();
        s2.name = "鉄の剣";
        s2.damage = 10;
        h2.sword = s2;

        Wizard w = new Wizard();
        w.name = "sakuya";
        w.hp = 150;

        System.out.println(h.name + "の現在の武器は" + h.sword.name);
        h.attack();
        System.out.println(h2.name +"の現在の武器は" + h2.sword.name);
        h2.attack();
        w.heal(h2);
        w.heal(h);

    }
}