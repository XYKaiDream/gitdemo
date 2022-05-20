import java.util.Scanner;

import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;
public class D0517 {
    public static void main(String[] args) {
        // double a[]={0.3,9.2,3.4};
        // String aa[] = {"aa","cc","csdav","viowe"};
        // A01 a01 = new A01();
        // // double b = a01.Max(a);
        // // System.out.println(b);
        // Scanner scanner =new Scanner(System.in);
        // String inpu = scanner.nextLine();
        // int c = a01.find(aa,inpu);
        // System.out.println(c);
        // Book book = new Book();
        // int a[] = {12,123,1000,323,220,102};
        // System.out.println(System.identityHashCode(a));
        // // book.Update(a);
        // // book.show(a);
        // A02 aa = new A02();
        // int []c = aa.copyarray(a);
        // System.out.println(System.identityHashCode(c));
        // book.show(c);
        // Circle circle = new Circle(4);
        // System.out.println(circle.S());
        // Cale cale = new Cale(1,0);
        // System.out.println(cale.division());
        // Cale cale2 = new Cale(2,3);
        // System.out.println(cale2.multiply());
        Dog dog = new Dog(1, "sad", "blue");
        dog.show();
    
    }
}
class Dog{
    int age;
    String name;
    String color;
    public Dog(int age,String name,String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public void show(){
        System.out.println(name+age+color);
    }
}
class Cale{
    double a;
    double b;
    public Cale(double a,double b){
        this.a = a;
        this.b = b;
    }
    public double plus(){
        return a+b;
    }
    public double sub(){
        return a-b;
    }
    public double multiply(){
        return a*b;
    }
    public Double division(){
        if(b==0){
            System.out.println("除数无意义");
            return null;
        }
        return a/b;
    }
}
class Circle{
    double R;
    public Circle(double R){
        this.R =R;
    }
    public double C() {
        return 2*R*Math.PI;
    }
    public double S() {
        return Math.PI*R*R;
    }
}
class A02{
    public int[] copyarray(int[] a){
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        return b;
    }
}
class Book{
    public void show(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }        
    }
    public void Update(int a[]){
         for (int i = 0; i < a.length; i++) {
             if(a[i]>150){
                 a[i] =150;
             }
             else if(a[i]>100){
                a[i] = 100;
             }
         }
    }
}
class A01{
    public int find(String aa[],String b) {
        for (int i = 0; i < aa.length; i++) {
            if(b.equals(aa[i])){ 
                return i;
            }
        }
        return -1;
    }
    public double Max(double a[]){
        double max = 0.0;
        for (int i = 0; i < a.length; i++) {
            if(max<a[i]){
                max =a[i];
            }
        }
        return max;
    }
}