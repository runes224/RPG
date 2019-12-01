public class Main {
    public static void main(String[] args) {
        // Sword s = new Sword();
        // s.name = "炎の剣";
        // s.damage = 10;
        // Hero h = new Hero();
        // h.name = "ミナト";
        // h.hp = 100;
        // h.sword = s;
        // System.out.println("勇者" + h.name + "を生み出しました！");
        // System.out.println("現在の武器は" + h.sword.name );

        // h.sit(5);
        // h.slip();
        // h.sit(25);
        // h.run();
        // h.attack();

        // Matango m1 = new Matango();
        // m1.hp = 50;
        // m1.suffix = 'A';
        Hero h1 = new Hero();
        h1.name = "ミナト";
        h1.hp = 100;
        Hero h2 = new Hero();
        h2.name = "アサカ";
        h2.hp = 100;

        PoisonMatango pm1 = new PoisonMatango('A');
        pm1.attack(h2);
  
    }
}