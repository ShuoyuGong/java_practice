import java.util.ArrayList;

public class ArrayList_1 {
    public static void main(String[] args){
//        创建集合对象
        ArrayList<String> list = new ArrayList<>();
//        添加元素
        list.add("hello");
        list.add("world");
        list.add("java");
//        返回集合中的元素的个数
        System.out.println("get-----"+list.get(0));
        System.out.println("get-----"+list.get(1));
        System.out.println("get-----"+list.get(2));
    }
}
