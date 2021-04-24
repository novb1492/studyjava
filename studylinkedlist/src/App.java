import java.util.LinkedList;

public class App {

    public static void main(String[] args) throws Exception {
        LinkedList<Integer> array=new LinkedList<>();
        int [] arr={754,282,631};
        for(int i=0;i<arr.length;i++)
        {
            array.add(arr[i]);////다루는 형식은 arraylist랑 흡사한거같다
        }

        for(int i=0;i<10;i++)
        {
            array.add(i);///arraylist처럼도가능함 2021-4-24
        }

        array.addFirst(100);///////////뭘언제해도 제일 앞으로간다
        array.addLast(200);////얘는 fist처럼 되진 않는다
        array.add(1000);
        array.add(8,2000);

        for(int i=0;i<array.size();i++)
        {
        System.out.println(array.get(i));///출력역시
        }
        System.out.println(array.contains(1)); //list에 1이 있는지 검색 : true
        System.out.println(array.indexOf(1)); //1이 있는 index반환 없으면 -1
    }
}
