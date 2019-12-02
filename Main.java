public class Main {
    public static void main(String[] args) {
        // Sword s = new Sword();

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