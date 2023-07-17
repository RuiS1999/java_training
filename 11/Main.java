public class Main {
    public static void main(String[] args) {
        Matango m = new Matango('a');
        PoisonMatango pm = new PoisonMatango('a');
        Dancer d = new Dancer("kanae");
        Hero h = new Hero();
        d.dance();
        d.attack(m);
        d.attack(pm);
        pm.attack(h);
    }
}