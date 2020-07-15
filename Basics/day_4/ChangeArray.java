public class ChangeArray {
    public static void main(String[] args){
    int a = 1;
    int b =2;
    System.out.println(a);
        System.out.println(b);
        change(a,b);
        System.out.println(a);
        System.out.println(b);

    }

    public static void change(int a,int b){
        a = a+b;
        b = b+a;
    }
}
