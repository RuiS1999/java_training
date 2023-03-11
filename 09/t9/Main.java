public class Main {
    public static void main(String[] args) {
        Thief t1 = new Thief("朝霞", 40, 5);
        Thief t2 = new Thief("朝霞", 40);
        Thief t3 = new Thief("朝霞");
        Thief t4 = new Thief();
        System.out.println(t1.name + ", " + t1.hp + ", " + t1.mp);
        System.out.println(t2.name + ", " + t2.hp + ", " + t2.mp);
        System.out.println(t3.name + ", " + t3.hp + ", " + t3.mp);
        System.out.println(t4.name + ", " + t4.hp + ", " + t4.mp);
    }
}