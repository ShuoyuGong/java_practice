import java.util.Scanner;
public class ScannerSum {
    public static void main(String[] args){
        System.out.println("------------整数求和-----------");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int b = sc.nextInt();
        System.out.println("------------开始计算-----------");
        System.out.println("结果为："+(a+b));
        System.out.println("------------END-----------");
    }
}
