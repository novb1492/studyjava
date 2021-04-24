
import java.util.ArrayList;


public class arraylisttoarray {

    public static void main(String[] args)  
    {
        ///////////복잡한 방법

        ArrayList<String> array=new ArrayList<>();
        ArrayList<Integer> array2=new ArrayList<>();

        array.add("야");
        array.add("왜");
        array2.add(1);
        array2.add(2);

        int[] a2=new int[array2.size()];
        String[] a = new String[array.size()];

        ///심플1
        for (int i=0; i < a.length; i++)
        {
            a[i] = array.get(i);
            a2[i]=array2.get(i);////////get으로 해주면된다

        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
            System.out.println(a2[i]);
        }
        ////심플한 방법

        ArrayList<String> list = new ArrayList<String>();

        list.add("one");
        list.add("two");
        list.add("three");

        String[] arr = new String[list.size()];
        list.toArray(arr);///////////////toarray이거 한방이면된다
        for(int i=0;i<arr.length;i++) {
              System.out.print(arr[i]); 
    }
}



}
