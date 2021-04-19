package hello.src;
class p{
    int hp;
    
    public void showhp()
    {
        System.out.println(this.hp+"hp");
    }
}
class thor extends p{
  public thor()
  {
      hp=50;
  }
}
public class studyconstructor {
    public static void main(String[] args) {
     p p=new thor();
        p.showhp();
    }
    
}
