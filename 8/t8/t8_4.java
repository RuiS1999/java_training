public class Cleric {
    String name;
    int hp = 50;
    final int MAX_HP = 50;
    int mp = 10;
    final int MAX_MP = 10;

    public void selfAid() {
        System.out.println(this.name + "はセルフエイドを唱えた！");
        this.mp -= 5;
        this.hp = this.MAX_HP;
        System.out.println("HPが全回復しました");
    }

    public int pray(int sec) {
        System.out.println(this.name + "は" + sec + "秒間天に祈った！");
        int recover = new java.util.Random().nextInt(3) + sec;
        int recoverActual = Math.min(this.MAX_MP - this.mp, recover);
        // if (50 < this.mp + recover) {
            // this.mh = this.MAX_MP;
        // } else {
            // this.mp += recover;
        // }
        this.mp += recoverActual;
        System.out.println(this.name + "のMPが" + recoverActual + "回復した！");
        return recoverActual;
    }
}