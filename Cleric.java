import java.util.Random;

public class Cleric {
  String name;
  final int MAX_HP = 50;
  int hp = 50;
  final int MAX_MP = 10;
  int mp = 10;
  
  public void selfAid(){
    this.mp -= 5;
    this.hp = this.MAX_HP;
    System.out.println(this.name + "はセルフエイドを唱えた！");
    System.out.println(this.name + "のHPが最大まで回復した！");
  }

  public int pray(int sec){
    System.out.println(this.name + "は" + sec + "秒、天に祈った！");

    int recover = new Random().nextInt(3) + sec;

    int recoverActual = Math.min(this.MAX_MP - this.mp, recover);

    this.mp += recoverActual;
    System.out.println("MPが" + recoverActual + "回復した！");
    return recoverActual;
  }
}