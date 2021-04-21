
import character.*;
import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
     
        unit u;
      Scanner sc= new Scanner(System.in);
      int a=sc.nextInt();
      try { 
        if(a==1)
        {
            u=new thor();
        }
        else if(a==2)
        {
            u=new ironman();
        }
        else{
            u=null;/////////요게없다면 
        }
        u.printfhp();///////////이게아예요류가남java는 만약의 상황까지 대비해서 똑똑한거같다,2021-04-21
        u.skillone();
          
      } catch (Exception e) {
          System.out.println("잘못된 직업 선택"+e.getMessage());
      }
      ////////////////c/c++보다 어려운거같다 포인터는 없지만 import나 여러가지 이해하는데 조금 걸렸다 2021-04-21
      ////개인적으로 아직 c++이더 좋은거 같다 ㅋㅋㅋ
    }
}
