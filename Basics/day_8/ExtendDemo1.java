public class ExtendDemo1 {
    public static void main(String[] args){
//        创建一个讲师类对象
        Teacher t = new Teacher();
//        为该员工类的name属性进行赋值
        t.name = "小明";
//        调用该员工的printName()方法
        t.printName();
//        调用Teacher类继承来的work方法
        t.work();
    }
}
