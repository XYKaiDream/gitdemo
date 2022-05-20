import java.util.Scanner;
public class D0430{
    public static void main(String[] args) {
        String a[] = {"1","10","3","45","65345"};
        //韩顺平杨辉三角
        // long start=System.currentTimeMillis();
        // long b[][] = new long[10000][];
        // for (int i = 0; i < b.length; i++) {
        //     b[i] = new long[i+1];
        //     for (int j = 0; j < b[i].length; j++) {
        //         if(j==0 || j==b[i].length-1){
        //             b[i][j] = 1;
        //         }
        //         else{
        //             b[i][j] = b[i-1][j]+b[i-1][j-1];
        //         }
        //     }
        // }
        //打印杨辉三角
        // for (int i = 0; i < b.length; i++) {
        //     b[i] = new long[i+1];
        //     b[i][0]=1;
        //     b[i][i]=1;
        //     for (int j = 1; j < i; j++) {
        //         b[i][j] = b[i-1][j]+b[i-1][j-1];
        //     }
        // }
        // for (int i = 0; i < b.length; i++) {
        //     for (int j = 0; j < b[i].length; j++) {
        //         System.out.print(b[i][j]+" ");
        //     }
        //     System.out.println();
        // }        
        // long end=System.currentTimeMillis();
		// System.out.println("所花费的时间为"+(end-start));
        // int b[][] = {{0,0,0,0,0},{0,0,0,0,5},{0,0,0,3,0},{0,0,2,0,1}};
        // int sum = 0;
        // for (int i = 0; i < b.length; i++) {
        //     for (int j = 0; j < b[i].length; j++) {
        //         sum += b[i][j];
        //     }
        // }
        // System.out.println(sum);
        //二维数组细节:先声明再定义
        // int arr[][];
        // arr = new arr[3][4];
        //动态初始化二维数组
        // int b[][] = new int[3][4];
        // for (int i = 0; i < b.length; i++) {
        //     for (int j = 0; j <i+1; j++) {
        //         b[i][j] = i+1;
        //     }
        // }
        //韩顺平写动态初始化
        // int arr[][] = new int[3][];
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = new int[i+1];
        //     for (int j = 0; j < arr[i].length; j++) {
        //         arr[i][j] = i+1;
        //     }
        // }
        // for (int i = 0; i < b.length; i++) {
        //     for (int j = 0; j < b[i].length; j++) {
        //         System.out.print(b[i][j]);   
        //     }
        //     System.out.println();
        // }
        // //二维数组 指向地址的地址
        // int b[][] = {{0,0,0,0,0},{0,0,0,0,5},{0,0,0,3,0},{0,0,2,0,1}};
        // for (int i = 0; i < b.length; i++) {
        //     for (int j = 0; j < b.length; j++) {
        //         System.out.print(b[i][j]);
        //     }
        //     System.out.println();
        // }
        // //查找
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("请输入你要查找的数:");
        // String inp = scanner.next();
        // int index = -1;
        // for (int i = 0; i < a.length; i++) {
        //     if(inp.equals(a[i])){
        //         System.out.printf("输入正确他在第%d个",i+1);
        //         index ++;
        //     }
        // }
        // if(index == -1){
        //     System.out.println("没有找到");
        // }
        // //冒泡排序
        // int length = a.length;
        // for (int i = 0; i < length-1; i++) {
        //     for (int j = 0; j <length-1-i; j++) {
        //         if(a[j]>a[j+1]){ 
        //             int tmp = a[j];
        //             a[j] = a[j+1];
        //             a[j+1] = tmp;
        //         }
        //     }
        // }
        // for (int i = 0; i < a.length; i++) {
        //     System.out.println(a[i]);
        // }
        // int length = a.length;
        // int tmp[] = new int[a.length];
        // for (int i = 0; i < a.length +1; i++) {
        //     Scanner scanner = new Scanner(System.in);
        //     System.out.println("请输入y/n：");
        //     String yn = scanner.next();
        //     if(yn.equals("y") && length>1){
        //         length--;
        //         for (int j = 0; j < length; j++) {
        //             tmp[j] = a[j];
        //             System.out.println(tmp[j]);
        //         }
        //     }
        //     else if(length == 1){
        //         System.out.println("不能再进行缩减");
        //     }
        //     else{
        //         System.out.println("退出");
        //         break;
        //     }
        // }
        // int tmp = 0;
        // for (int i = 0; i < a.length/2; i++) {
        //     tmp = a[a.length - i -1];
        //     a[a.length -i -1] = a[i];
        //     a[i] = tmp;
        // }
        // for (int i = 0; i < a.length; i++) {
        //     System.out.println(a[i]);
        // }
    //continue
    // public static void main(String[] args) {
    //     for (int i = 0; i < 100; i++) {
    //         if(i%5==0){
    //             continue;
    //         }
    //         else{
    //             System.out.println()
    //         }
    //     }
    // }
    //label标签
        // while(i<=13){
        //     i++;
        //     if(i==12){
        //         continue;
        //     }
        //     System.out.println(i);
        // }
        // lable1:
        // for (; i < 13;i++) {
        //     lable2:
        //     for (int j = 0; j < 2; j++) {
        //         if(i==12){
        //         continue lable2;
        //         }
        //         System.out.println(j);
        //     }
        // }
        //打印空心三角形
        // for (int i = 1; i <=5 ; i++) {
        //     for (int k = 1; k <= 5-i; k++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= 2*i -1; j++) {
        //         if(j == 1 || j==2*i -1 || i==5){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" "); 
        //         }
        //     }
        //     System.out.print("\n");
        // }
        }
}