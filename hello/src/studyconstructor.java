package hello.src;

import java.util.Scanner;

class p{
    int hp,attack;
    public void showhp()
    {
        System.out.println(this.hp+"hp");
    }
    public void showattack()
    {
        System.out.println(this.attack+"attack");
    }
    public void skillone(){}
}
class thor extends p{
  public thor()
  {
      hp=50;
      attack=100;
  }
  @Override
  public void skillone() {
      System.out.println("throwhammer");
      super.skillone();
  }
}
class ironman extends p{
    public ironman()
    {
        hp=30;
        attack=80;
    }
    @Override
    public void skillone() {
        System.out.println("bim");
        super.skillone();
    }
}
public class studyconstructor {
    public static void main(String[] args) {
        p p;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a==1)
        {
            p=new thor();
        }
        else
        {
            p=new ironman();

        }
        p.showhp();
        p.showattack();
        p.skillone();
    }
    
}
