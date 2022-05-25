public class main_test {
    public static void main(String[] args) {
        UsualEm AA = new UsualEm("A1",10000);
        Manager BB = new Manager("A2",30000,500);     
        main_test CC = new main_test();
        CC.showEmpAnnual(DD);
        CC.testWork(DD);
        // CC.showEmpAnnual(AA);
        // CC.showEmpAnnual(BB);
        // CC.testWork(AA);
        // CC.testWork(BB);
    }
    public void showEmpAnnual(Employee e) {
        System.out.println(e.getAnnual());
    }
    public void testWork(Employee e) {
        if(e instanceof UsualEm){
            ((UsualEm) e).work();
        }
        else if(e instanceof Manager){
            ((Manager) e).manage();
        }
    }

}
