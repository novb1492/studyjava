package test;

import java.util.Iterator;

public class useiterator extends listtoint{
   
    Iterator<Integer>it;

    @Override
    public void makeiterator()
    {
        this.it=this.array.iterator();
    }
    @Override
    public void printfit()
    {
        while(this.it.hasNext())
        {
            System.out.println(it.next()+"iterator");
        }
    }
    
}
