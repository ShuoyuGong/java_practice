public class GetFunction {
    public static void main(String[] args){
//        创建字符串对象
        String s = "helloword!";
//        int length 字符个数
        System.out.println(s.length());
        System.out.println("---------------------");

//        concat() 将执行字符串连接到某字符串结尾
        System.out.println(s.concat("hellohellojell"));
        System.out.println("---------------------");

//        charAt() 获取执行索引处的字符
        System.out.println(s.charAt(5));
        System.out.println("---------------------");

//        indexOf() 获取str在字符串对象中第一次出现的索引
        System.out.println(s.indexOf("o"));
        System.out.println("---------------------");

//        substring() 截取字符串
        System.out.println(s.substring(2,7));
        System.out.println("---------------------");

//        substring() 从开始截取到结束，不含最后的字符
        System.out.println(s.substring(0,s.length()));
    }
}
