public class D0513HR {
    public static void main(String[] args) {
        HR hr = new HR();
        hr.move(3, 'a', 'b', 'c');
    }
}
class HR{
    public void move(int num,char a,char b,char c){
        if(num ==1){
            System.out.println(a+"->"+c);
        }
        else{
            move(num-1 , a , c , b);
            System.out.println(a+"->"+c);
            move(num-1, b, a, c);
        }
    }
}