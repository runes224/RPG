public class Cleric {
    String name;
    int hp = 50;
    final int MAX_HP = 50;
    int mp = 10;
    final int MAX_MP = 10;

    public void slefAid() {
        System.out.println(this.name + "はセルフエイドを唱えた！");
        if (this.mp >= 5) {
            this.mp -= 5;
            this.hp = MAX_HP;
            System.out.println("勇者は全回復をした！");
        }else{
            System.out.println("しかし、MPが足りなかった!");
        }
        
    }

    public int pray(int sec) {
        System.out.println(this.name + "は" + sec + "秒間天に祈った！");
        Random random = new Random();
        int randomValue = random.nextInt(2);
        int amountAid = 0;
        if ( this.hp + sec + randomValue >= MAX_HP) {
            amountAid = MAX_HP - this.hp;
            this.hp = MAX_HP;
            return amounAid;
        }else{
            amountAid = sec + randomValue;
            this.hp += sec + randomValue;
            return amounAid;
        }
      }
}