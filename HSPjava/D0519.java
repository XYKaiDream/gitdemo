import java.nio.channels.Pipe;
import java.util.Random;
import java.util.Scanner;

import javax.xml.transform.Source;

public class D0519 {
    public static void main(String[] args) {
        // System.out.println();
        Mora mora = new Mora();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入0-2分别代表石头剪刀布:");
            int player = scanner.nextInt();
            System.out.println(mora.victory(player)); 
        }
        System.out.println("你赢的次数"+mora.count_v);
    }
}
class Mora
{
    int []a = {0,1,2};
    int count_f=0;
    int count_v=0;
    public int random_self(){
        Random random = new Random();
        int random_s = random.nextInt(3);
        return random_s;
    }
    public String victory(int b){
        if(a[random_self()]==0 && b==1){
            count_v++;
            return "你赢了";

        }
        else if(a[random_self()]==1 && b==2){
            count_v++;
            return "你赢了";
        }
        else if(a[random_self()]==2 && b==0){
            count_v++;
            return "你赢了";
        }
        else if(a[random_self()]==b){
            return "平手";
        }
        else{
            count_f++;
            return "你输了";
        }
}
}
class PassProject{
    public void printArea(Circle c,int times) {
        for (int i = 1; i < times; i++) {
            c.set(i);
            System.out.println((double)i+"\t"+c.findArea()); 
        }
    }
}
class Circle{
    double r;
    public Circle(){

    }
    public Circle(double r){
        this.r = r;
    }
    public double findArea() {
        return Math.PI*r*r;
    }
    public void set(double r){
        this.r = r;
    }
}