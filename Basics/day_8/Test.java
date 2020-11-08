import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args){
//        创建群主对象
        Qunzhu qz = new Qunzhu("群主",200);
//        创建键盘输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入金额");
        int money = sc.nextInt();
        System.out.println("请输入个数");
        int count = sc.nextInt();


//        发送红包
        ArrayList<Double> sendList = qz.send(money,count);
//        判断 余额不足
        if(sendList == null){
            System.out.println("余额不足");
            return;
        }
//        创建三个成员
        Member m = new Member();
        Member m1 = new Member();
        Member m2 = new Member();
//        打开红包
        m.openHB(sendList);
        m1.openHB(sendList);
        m2.openHB(sendList);

        qz.show();
        m.show();
        m1.show();
        m2.show();
    }
}
