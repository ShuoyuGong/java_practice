import java.util.ArrayList;

public class StaticCode {
    public static int number;
    public static ArrayList<String> list;
    static{
        number = 2;
        list = new ArrayList<String>();
        list.add("张三");
        list.add("李四");
    }
}
