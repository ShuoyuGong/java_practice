import java.util.Arrays;

public class ArrayCharSort {
    public static void main(String[] args){
        String line = "fhbwrhergtdfvdsahetjrytjegsdfgh";
//        转换为字符数组
        char[] chars = line.toCharArray();

//        升序排序
        Arrays.sort(chars);


//        反向遍历打印
        for(int i = chars.length -1; i>= 0 ;i--){
            System.out.println(chars[i]+"");
        }
    }
}
