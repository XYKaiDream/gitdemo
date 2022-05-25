import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class SmallChangeSys {
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key ="";
    double money  = 0;
    double balance = 0;
    Date date = new Date();
    String detail = "----------明细-----------";
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    String note = "";
    public void showMenu() {
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
                    this.detail();
                    break;
                case "2":
                    this.income();;
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
    }
    public void detail() {
        System.out.println(detail);
    }
    public void income() {
        System.out.println("收益入账金额");
        money = scanner.nextDouble();
        balance += money;
        date = new Date();
        detail += "\n收益入账\t" + money +"\t" +sdf.format(date) + "\t" +balance; 
    }

}
