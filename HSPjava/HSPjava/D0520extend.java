public class D0520extend {
    public String name;
    public int age;
    public double score;
    public D0520extend() {
        System.out.println("Father .....");
    }
    public void setScore(double score) {
        this.score = score;
    }
    public void testing() {
        System.out.println("small  "+score);
    }
    public void info() {
        System.out.println(name+score+"\t"+age);
    }
}
