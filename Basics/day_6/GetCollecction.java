import java.util.ArrayList;
import java.util.Random;
public class GetCollecction {

    public static void main(String[] args){
//        创建Random对象
        Random random = new Random();
//        创建ArrayList对象
        ArrayList<Integer> list = new ArrayList<>();
//        添加随机数到集合
        for(int i = 0;i < 100;i++){
            list.add(random.nextInt(100));
        }
//        调用偶数集合的方法
        System.out.println(getArrayList(list));
    }

//    偶数封装
    public static ArrayList<Integer> getArrayList(ArrayList<Integer> list){
//        创建小集合 保存偶数
        ArrayList<Integer> smallList = new ArrayList<>();
//        遍历list
        for(int i = 0;i < list.size();i++){
//            获取元素
            Integer num = list.get(i);
            if(num % 2 == 0){
                smallList.add(num);
            }
        }
//        返回小集合
        return smallList;
    }
}
