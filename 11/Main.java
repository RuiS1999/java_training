public class Main {
    public static void main(String[] args) {
        Hero h = new SuperHero();
        Matango ma = new Matango('A');
        Matango mb = new Matango('B');
        ma.attack(h);
        h.attack(mb);
        System.out.println(h.hp);
    }
}