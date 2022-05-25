public class PlortArray {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("abc",20);
        persons[1] = new Student("dd",12,99.32);
        persons[2] = new Student("bb",13,89.3);
        persons[3] = new Teacher("teacher",39,20000.12);
        persons[4] = new Teacher("teache2",55,30000.12);
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].say());
            if(persons[i] instanceof Student){
                ((Student)persons[i]).stu();
            }
            else if(persons[i] instanceof Teacher){
                ((Teacher)persons[i]).teach();
            }
        }
    }
}
