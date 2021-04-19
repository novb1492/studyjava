package hello.src;
class plus{
    int a,b;
    static int c=10;
    final int d=20;
    public void calculator(int o,int t)
    {
        this.a=o;
        this.b=t;
    }
    public void sum()
    {
        System.out.println(this.a+this.b+"sum");
    }
    public void sum2()
    {
        System.out.println(this.a+this.b+c+"sum2");
    }
}
class minus extends plus{
    public void min()
    {
        System.out.println(this.a-this.b+"min");
    }
    public void min2()
    {
        c-=15;
        System.out.println(this.a-this.b-c+"min2");
    }
    
}
class division extends minus{
    public void divi()
    {
        //d+=1;final 개체는 c++=const
        System.out.println(this.a/this.b+d+"division");
    }
}
public class studyclass {
    public static void main(String[] args) {
        division p= new division();
        int o=10,t=21;
        p.calculator(o, t);
        p.sum();
        p.sum2();
        p.min();
        p.min2();
        p.divi();
    }
}
