public class Wizard {
    String name;
    int hp;
    public void heal(Hero h) {
        double healPoint = h.hp * 0.05;
        h.hp += healPoint;
        System.out.println(h.name + "のHPを"+ healPoint + "回復した！");
    }
}