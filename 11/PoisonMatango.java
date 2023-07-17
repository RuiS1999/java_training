public class PoisonMatango extends Matango {
    int poisonCount = 5;
    public PoisonMatango(char suffix) {
        super(suffix);
    }
    public void attack(Hero h) {
        super.attack(h);
        if (poisonCount > 0 ) {
            System.out.println(h.name + "にさらに毒の胞子をばらまいた！");
            int damage = h.hp / 5;
            h.hp -= damage;
            System.out.println(damage + "ポイントのダメージ！");
            this.poisonCount--;
            System.out.println(poisonCount);
        }
    }
}