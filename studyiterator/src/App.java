import java.util.ArrayList;
import java.util.Iterator;

public class App {
    public static void main(String[] args)  {
        ArrayList<Integer> array=new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            array.add(i);
        }

        array.remove(0);

        System.out.println(array.indexOf(9));////////9라는 값의 위치를 알려준다



        Iterator<Integer>i=array.iterator();////이런거였구나 c++도 비슷했을텐데


        while(i.hasNext())
        {
            System.out.println(i.next());////
           // i.remove();///이건자동 실행 메소드 같다
        } 
         
      
            System.out.println(i.next()+"밑에");////여기 결과가 없다
           
        
       
    }
}
