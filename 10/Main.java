public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        System.out.println(h.name);
        Hero sh = new SuperHero();
        sh.run();
        System.out.println(sh.name);
    }
}