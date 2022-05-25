public class UsualEm extends Employee{
    public UsualEm(String name,double salary) {
        super(name,salary);
    }
    public void work(){
        System.out.println(getName()+"员工工作.......");
    }
    public double getAnnual(){
        return 12*getSalary();
    }
}
