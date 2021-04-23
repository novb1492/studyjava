
import java.util.ArrayList;
public class App {
           public static void main(String[] args) {
         ArrayList<Integer>number=new ArrayList<>();
         for(int i=0;i<10;i++)
         {
             number.add(i);
         }
         for(int i=0;i<number.size();i++)
         {
             System.out.println(number.get(i));
         }
        }

    
}
