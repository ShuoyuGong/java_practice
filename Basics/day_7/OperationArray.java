import java.util.Arrays;
public class OperationArray {
    public static void main(String[] args){
//        PART --------1
//        int[] arr = {2,4,5,7,8,9,0,23,4534,456};
////        打印数组 输出地址池
//        System.out.println(arr);
////        数组内容转化为字符串
//        String s = Arrays.toString(arr);
////        打印字符串 输出内容
//        System.out.println(s);




        //       PART --------2

//        int数组排序
        int[] arr = {23,3456,5678,7879,7897,684321,23};
        System.out.println("排序前"+Arrays.toString(arr));

//        升序排序
        Arrays.sort(arr);
        System.out.println("排序后"+Arrays.toString(arr));

    }
}
