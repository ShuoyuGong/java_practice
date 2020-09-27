import java.util.Scanner;
public class ScannerMax {
    public static void main(String[] args){
        System.out.println("----------开始-----------");
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个整数");
        int a = sc.nextInt();
        System.out.println("输入第二个整数");
        int b = sc.nextInt();
        System.out.println("输入第三个整数");
        int c = sc.nextInt();
        int temp = (a > b?a:b);
        int max = (temp > c?temp:c);
        System.out.println("MAX:"+(max));
        System.out.println("----------结束-----------");
    }
}
