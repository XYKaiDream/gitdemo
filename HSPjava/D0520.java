public class D0520 {
    public static void main(String[] args) {
        Person person = new Person("name",11,"dsf",8942.32);
        System.out.println(person.info());    
        
    }
}
class Person{
    public String name;
    private int age;
    private String job;
    private double salary;
    
    
    public Person() {
    }
    
    public Person(String name, int age, String job, double salary) {
        setAge(age);
        setJob(job);
        setName(name);
        setSalary(salary);
    }

    public String info(){
        return name+age+salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}

class  Person2{
    public int getXXX(int age,String name){
        return age;
    }
}