import java.util.Scanner;
public class AsValue {
    public static void main(String[] args){
//        普通方法
        Scanner sc = new Scanner(System.in);
        input(sc);
//        匿名对象作为方法接收的参数
        input(new Scanner(System.in));
    }

    public static void input(Scanner sc){
        System.out.println(sc);
    }
}
