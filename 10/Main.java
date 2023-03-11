public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.run();
        System.out.println(h.name);
        Hero sh = new SuperHero();
        sh.run();
        sh.slip();
        System.out.println(sh.name);
    }
}