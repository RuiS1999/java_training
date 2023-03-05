public class Wizard {
    String name;
    int MAX_HP;
    int hp;
    public void heal(Hero h) {
        double healPoint = h.MAX_HP * 0.05;
        if (h.hp != h.MAX_HP) {
            if (h.hp < h.MAX_HP - Math.floor(healPoint)) {
                h.hp += Math.floor(healPoint);
                System.out.println(this.name + "は" + h.name + "のHPを"+ (int) healPoint + "回復した！");
            } else {
                int SurplusPoint = h.MAX_HP - h.hp;
                h.hp = h.MAX_HP;
                System.out.println(this.name + "は" + h.name + "のHPを"+ SurplusPoint + "回復した！");
            }
        } else {
            System.out.println("効果がありませんでした...");
        }
    }
}