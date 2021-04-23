
import java.util.ArrayList;
import java.util.Arrays;



public class inttointeger {
    public static void main(String[] args)  {
   
        /////기본적 방법
        int[] a = {13, 17, 21, 23};

        ArrayList<Integer> array = new ArrayList<>();

        for (int i=0;i<a.length;i++) {
            array.add(a[i]);
        }

        System.out.println(array);

        ////가장많이 사용되는방법
        
        String [] arr = new String[] {"one", "two", "three"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
     
        System.out.println(list);    //[one, two, three]
    }

    
}
