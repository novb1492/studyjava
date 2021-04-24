import test.*;



public class App {

    public static void main(String[] args) {
        
        makelist m=new useiterator();
         
        int [] arr={1,2,3,4,5,6};
        int []arr2=new int[arr.length];
        
        m.make(arr);
        m.printf();
        
        arr2=m.makeint();
        for(int i=0;i<arr2.length;i++)
        {
        System.out.println(arr2[i]+"return");
        }
        m.makeiterator();
        m.printfit();

    }
}
