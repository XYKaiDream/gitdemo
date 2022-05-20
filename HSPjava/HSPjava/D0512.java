import java.util.ArrayList;
import  java.util.List;
public class D0512{
    public static void main(String[] args) {
        demo a = new demo();
        int[] mm = a.get(1, 3);
        System.out.printf("%d,%d",mm[0],mm[1]);
    }
}
class demo{
    public int[] get(int a ,int b){
        int[] res = new int[2];
        res[0] = a;
        res[1] =b;
        return res;
    }
}