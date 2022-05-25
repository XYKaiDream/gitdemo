public class test {
    public static void main(String[] args) {
        // new SmallChangeSys().showMenu();
        Person a[] = new Person[3];
        a[0] = new Person("aa",12,"dd");
        a[1] = new Person("bb",91,"gg");
        a[2] = new Person("cc",21,"nnd");
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j <a.length; j++) {
                if(a[i].age < a[j].age){
                    a[j].age = a[j].age^a[i].age;
                    a[i].age = a[i].age^a[j].age;
                    a[j].age = a[j].age^a[i].age;
                }
            }
        }
        for (int index = 0; index < a.length; index++) {
            System.out.println(a[index].getName() +a[index].getAge()+a[index].getJob());
        }
    }
}
class Person{
    public String name;
    public int age;
    public String job;
    
    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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
}
