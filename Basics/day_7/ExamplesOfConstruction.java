public class ExamplesOfConstruction {
    public static void main(String[] args){
//        无参构造
        String str = new String();
//        通过字符数组构造
        char chars[] = {'a','b','c'};
        String str2 = new String(chars);
//        通过字节数组构造
        byte bytes[] =  {12,34,45,56};
        String str3 = new String(bytes);
    }
}
