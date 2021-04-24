package test;

import java.util.ArrayList;


public class makelist {

    ArrayList<Integer>array=new ArrayList<>();
    int []a;
   
    public void make(int[]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            this.array.add(arr[i]);
        }
    }
    public void printf()
    {
        for(int i=0;i<this.array.size();i++)
        {
            System.out.println(this.array.get(i));
        }
    }
    public int[] makeint(){return this.a;}
    public void makeiterator(){}
    public void printfit(){}

    
}
