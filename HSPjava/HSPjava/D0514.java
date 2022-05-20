public class D0514 {
    public static void main(String[] args) {
        Cal cal = new Cal();
        // int a = cal.calculate(1, 2);
        // double b = cal.calculate(1.2, 3);
        // double c = cal.calculate(2.2, 3.3);
        // System.out.printf("%d,%f,%f",a,b,c);
        // // System.out.println(a);
        // int aa = cal.m(2);
        // int bb = cal.m(2,2);
        // int cc = cal.m('a');
        // System.out.printf("%d,%d,%d",aa,bb,cc);
        // cal.m(1,2,3,45);
        // int[] score = {99,67,66,55,44};
        // String name = "aa";
        // // System.out.println(cal.ret(name,score[0],score[1]));        
        // cal.name();
        // System.out.println(cal.a);
        // Person per = new Person();
        // per.test(cal);
        Constructor c = new Constructor("aa",90);
        Constructor c2 = new Constructor("aa",90);
        // System.out.println(c.age+" "+c.name);
        System.out.println(c.CompareTo(c2));
    }
}
class Constructor{
    String name;
    int age;
    public Constructor(String name,int age){
        this.name = name;
        this.age = age;
        // System.out.println(name);
    }
    public boolean CompareTo(Constructor con){
        return this.name.equals(con.name) && this.age == con.age;
    }
    public Constructor(){
        this("aa",123);
    }
}

class Person{
    public void test(Cal cal){
        System.out.println(cal.a);
    }
}
class Cal{
    public int a=3;
    public void name() {
        int a=9;
        System.out.println(a);
    }
    public String ret(String name,double... a){
        double score = a[0]+a[1];
        return "Ãû×Ö"+name +"·ÖÊý:"+score;
    }
    // public int ret2(int... a){

    // }
    // public int ret3(int... a){

    // }
    
    public void m(int... a){
        System.out.println(a[0]);
    }
    public int m(int a){
        return a*a;
    }
    public int m(int a,int b){
        return a*a*b*b;
    }
        
    public int m(char a){
        return a*a;
    }

    public int calculate(int a,int b){
        return a+b;
    }
    public double calculate(int a,double b){
        return a+b;
    }
    public double calculate(double a,int b){
        return a+b;
    }
    public double calculate(double a,double b){
        return a+b;
    }
    
}