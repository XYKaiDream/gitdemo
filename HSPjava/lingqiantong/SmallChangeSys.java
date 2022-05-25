import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        boolean loop = true;
        String key = "";
        String detail = "----------明细-----------";
        do{
            System.out.println("=============零钱通=================");
            System.out.println("1、零钱通明细");
            System.out.println("2、收益入账");
            System.out.println("3、消费");
            System.out.println("4、退出");
            System.out.println("请选择1-4");
            Scanner scanner = new Scanner(System.in);
            key = scanner.next();
            
            switch (key) {
                case "1":
                    System.out.println(detail);
                    break;
                case "2":
                System.out.println("收益入账金额:");
                    break;
                case "3":
                    break;
                case "4":
                    loop = false;
                    break;
                default:
                    System.out.println("输入有误，请输入1-4：");
            }
        }
        while(loop);
        System.out.println("已退出...");
    }
}