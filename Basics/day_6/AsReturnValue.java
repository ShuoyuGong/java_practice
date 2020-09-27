import java.util.Scanner;
public class AsReturnValue {
    public static void main(String[] args){
        Scanner sc = getScanner();
        System.out.println(sc);
    }

    public static Scanner getScanner(){
//        普通方法
//        Scanner sc = new Scanner(System.in);
//        return sc;
        return new Scanner(System.in);
    }
}
