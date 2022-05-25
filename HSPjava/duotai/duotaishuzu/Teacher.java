public class Teacher extends Person{
    private double salary;

    public Teacher(String name,int age,double salary) {
        super(name,age);
    public Teacher(String name, int age, int post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String say(){
        return super.say()+salary;
    }
    public void teach(){
        System.out.println("��ʦ: "+getName());
    }
}
