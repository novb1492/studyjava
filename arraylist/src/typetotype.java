
import java.util.ArrayList;

public class typetotype {
    public static void main(String[] args) {

        ///문자열->숫자
        ArrayList<String> array=new ArrayList<>();
        ArrayList<Integer> array2=new ArrayList<>();

        array.add("101");
        array.add("103");
        //array.add("a");문자혹은 문자열은 안됨
   
        for (int i=0; i < array.size(); i++)
        {
            array2.add(Integer.parseInt(array.get(i)));
        }
        for(int i=0; i<array2.size();i++)
        {
            System.out.println(array2.get(i)+"toint");
        }

        //숫자->문자열
        ArrayList<Integer> array3=new ArrayList<>();
        ArrayList<String> array4=new ArrayList<>();
        
        array3.add(101);
        array3.add(103);
        
        for (int i=0; i < array3.size(); i++)
        {
            array4.add(String.valueOf(array3.get(i)));///이렇게도 가능하지만
            array4.add(array3.get(i).toString());////////이게 더 편하다
        }

        for (int i=0; i < array4.size(); i++)
        {
            System.out.println(array4.get(i)+"tostring");
        }
        
    }
}
