
import character.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     
        unit u;
      Scanner sc= new Scanner(System.in);
      if(sc.nextInt()==1)
      {
          u=new thor();
      }
      else
      {
          u=new ironman();
      }
      u.printfhp();
      u.skillone();
    }
}
