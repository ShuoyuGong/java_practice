import java.util.ArrayList;

public class ArrayList_0 {
    public static void main(String[] args){
//        创建学生数组
        ArrayList<String> list = new ArrayList<>();
//        创建学生对象
        String s1 = "gsy";
        String s2 = "gy";
        String s3 = "gs";
//        打印学生ArrayList集合
        System.out.println(list);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println(list);
    }
}
