public class demo{
    public static void main(String[] args) {
        int[] a = {2,10,10,2,1,16,1};
        int eor = 0;
        
        for(int i=0;i<a[i];i++){
            eor ^=a[i];
        }
        int rightone = eor &(~eor +1);
        int onlyOne  =0;
        for(int cur : a){
            if((cur & rightOne)==1){
                onlyOne ^=cur;
            }
        }
        System.out.println(eor);
    }
}
