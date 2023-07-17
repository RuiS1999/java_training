public class Dancer extends Character {
    public Dancer(String name) {
        this.name = name;
        this.hp = 100;
    }
    public void dance() {
        System.out.println(this.name + "は情熱的に踊った！");
    }
    public void attack(Matango m) {
        System.out.println(m.suffix);
    }
}