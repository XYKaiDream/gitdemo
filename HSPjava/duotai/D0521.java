public class D0521 {
    public static void main(String[] args) {
        // BB bb = new BB();
        // System.out.println(bb instanceof AA);    
        // //��������AA
        AA aa = new BB();
        // System.out.println(aa instanceof AA);
        // System.out.println(aa instanceof BB);
        // System.out.println(aa.a);
        // aa.display();
        // System.out.println(aa==bb);
        //��̬�󶨻��ƣ������÷���ʱ�򣬷������������Ͱ󶨡���������û�ж�̬�󶨻��ƣ�������������ʹ��
        // System.out.println(aa.a);
        aa.display();
    }
}
class AA{
    public int a = 10;
    public void display(){
        System.out.println(getA()+20);
    }
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
}
class BB extends AA{
    public int a = 20;
    // public void display(){
    //     System.out.println(this.a);
    // }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
