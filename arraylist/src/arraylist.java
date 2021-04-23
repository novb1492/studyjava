
import java.util.ArrayList;


public class arraylist {
    public static void main(String[] args)  {

        ArrayList<int[]>array=new ArrayList<>();///신세계 배열 공간 확보 안해놓고 넣는대로 공간 할당가능 ㅋㅋㅋ2021-4-23
        int sizeb=10;
        int[] b=new int[sizeb];
        
        int a[]={11,12,13,14,15,16,17,18,19,20};
    
        for(int i=0;i<sizeb;i++)
        {
         b[i]=i;
        }
        array.add(b);////먼저넣는거 부터 앞자리 할당
        array.add(a);

       for(int ii=0;ii<array.size();ii++)
       {
            for(int i=0;i<array.get(ii).length;i++)///두번째는 length로
            {
                System.out.println(array.get(ii)[i]);
            }
       }
     
           System.out.println(array);
       //공부
    }

       
         
    
}
