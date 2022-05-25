import javax.security.sasl.Sasl;

public class Manager extends Employee{
    private double bonus;
    
    public Manager(String name,double salary,double bonus) {
        super(name,salary);
        this.bonus = bonus;
    }
    public void manage(){
        System.out.println(getName()+"经理在工作.....");
    }
    public double getAnnual(){
        return 12*getSalary()+bonus;
    }
}
