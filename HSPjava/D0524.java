public class D0524 {
    public static void main(String[] args) {
        // Equ e = new Equ(12, "saa", '7');
        // Equ e2 = new Equ(12, "saa", '7');
        // System.out.println(e.equals(e2));
        // Monster monster = new Monster("aa", 10, 24.432);
        // System.out.println(monster.toString() + "hashcode" +monster.hashCode());
        // System.out.println(monster.getClass().getName()+Integer.toHexString(monster.hashCode()));
        Car bmw = new Car("bmw");
        Car benz = new Car("benz");
        bmw = null;
        // System.out.println("ok!");   
    }
}
class demo{
    private String namel;
    private int demo;
    private int sal;
    public demo() {
    }
    public void test(){
        System.out.println("OK");        
    }
    
}
class Car{
    private String name; 
    public Car(String name) {
        this.name = name;
    }

    protected void finalize() throws Throwable {
        System.out.println("ok"+name);
    }

    
}
class Monster{
    private String name;
    private int age;
    private double sal;

    public Monster(String name, int age, double sal) {
        this.name = name;
        this.age = age;
        this.sal = sal;
    }

    // @Override
    // public String toString() {
    //     return "Monster [age=" + age + ", name=" + name + ", sal=" + sal + "]";
    // }
    
}
class Equ{
    private int age;
    private String name;
    private char gender;
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj instanceof Equ){
            Equ p = (Equ)obj;
            return this.name.equals(p.name) && this.age == p.age&& this.gender == p.gender;
        }
        return false;
    }
    public Equ(int age, String name, char gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    
}
