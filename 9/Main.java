public class Main {
    public static void main(String []args) {
        Hero h;
        h = new Hero();
        h.name = "kaji";
        h.hp = 200;
        Hero h2;
        h2 = h;
        h2.name = "joge";
        h2.hp = 100;
        System.out.println(h);
        System.out.println(h2);
        System.out.println(h.hp);
        System.out.println(h2.hp);
        System.out.println(h.name);
        System.out.println(h2.name);
    }
}