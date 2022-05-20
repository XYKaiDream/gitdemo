import java.util.Scanner;

public class D0513 {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // int inp = scanner.nextInt();
        // AA a = new AA();
        // System.out.println(a.lsodd(inp));
        // int[] aa = {99,2,3,45,22};
        // System.out.println(aa[0]);
        // a.ls(aa);
        // System.out.println(aa[0]);
        // B b = new B();
        // b.age =10;
        // a.object(b);
        // System.out.println(b.age);
        // int[][] aa ={{1,2,3,4},{33,25,23,25},{33,25,23,25}};
        // // a.dd(aa);
        // B b = new B();
        // b.age = 45;
        // b.name="g5434";
        // B m = a.copyPerson(b);
        // System.out.println(m == b);
        // // m.age =22;
        // System.out.println(m.age);

        // System.out.println(b.age);    
        Recur recur = new Recur();
        int a= 1;
        // recur.test(a);
        // System.out.println("\n"+recur.factorial(1));
        System.out.println(recur.eatpeach(1));
    }
}
class Recur{
    public int eatpeach(int a){
        if(a==10){
            return 1;
        }
        else{
            return 2+eatpeach(a+1)*2;
        }
    }
    public int factorial(int a){
        if(a>=1){
            if(a==1 || a==2){
                return 1;
            }   
            else{
                System.out.printf("%d,%d ",a-1,a-2);
                return factorial(a-1)+factorial(a-2);
            }
        }
            else{
                System.out.println("错误输入");
                return -1;
        }

    }
    public void test(int a){
        if(a>2){
            test(a-1);
        }
        else{
        System.out.println(a);
        }
    }
}
class B{
    String name;
    int age;
}
class AA {
    public B copyPerson(B b){
        B m = new B();
        m.age =b.age;
        m.name = b.name;
        return m;
    }
    public void dd(int[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public void object(B b){
        b.age =1;
    }
    public boolean lsodd(int a) {
        // if(a%2 ==0){
        // return false;
        // }
        // else{
        // return true;
        // }
        return a % 2 != 0 ? true : false;
    }

    public void ls(int[] a) {
        a[0] = 1;
        // System.out.println(a[0]);
    }
}