import java.util.ArrayList;

public class PrintCollection {
    public static void main(String[] args){
//        创建集合对象
        ArrayList<String> list = new ArrayList<String>();
//        添加字符串到集合中
        list.add("lpz");
        list.add("gsy");
        list.add("gq");
printArrayList(list);
    }


//    打印字符串集合方法
public static void printArrayList(ArrayList<String> list){
//        拼接左括号
    System.out.println("{");
//    遍历集合
    for(int i = 0;i < list.size();i++){
//        获取元素
        String s = list.get(i);
//        拼接@符号
        if(i != list.size()-1){
            System.out.println(s + "@");
        }else{
            System.out.println(s + "}");
        }
//        (i != list.size()-1)?System.out.println(s+"@"):System.out.println(s+"}");
    }
}
}
