package test;

public class listtoint extends makelist {
    @Override
     public int[] makeint()
    {  
     
        this.a=new int[this.array.size()];
        for (int i=0; i < this.array.size(); i++)
        {

            this.a[i]=array.get(i).intValue();

        }
        return this.a;
    }
    
}

