public class Diaoyong {
    public static void main(String[] args){
        StaticVariable s1 = new StaticVariable("张三",23);
        StaticVariable s2 = new StaticVariable("张四",24);
        StaticVariable s3 = new StaticVariable("张五",25);
        StaticVariable s4 = new StaticVariable("张刘",26);

        s1.show();
        s2.show();
        s3.show();
        s4.show();

//        访问类变量
        System.out.println(StaticVariable.numberOfStudent);
        StaticVariable.showNum();
    }
}
