public class ConversionFunction {
    public static void main(String[] args){
        String s = "abcde";
//      char[]  toCharArray() 将字符串转为数组
        char[] chs = s.toCharArray();
        for(int i = 0;i < chs.length;i++){
            System.out.println(chs[i]);
        }

        System.out.println("----------------------------");


//        byte[] getBytes():将字符串转换为字节数组
        byte[] bts = s.getBytes();
        for(int i = 0;i<s.length();i++){
            System.out.println(bts[i]);
        }
        System.out.println("----------------------------");


//        替换字符
        String str = "itcase ithello";
        String replaceStr = str.replace("it","IT");
        System.out.println(replaceStr);
    }
}
