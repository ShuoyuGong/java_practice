public class InterFaceDemo {
    public static void main(String[] args){
//        创建子类对象
        Human a = new Human();
//        调用实现后的方法
        a.eat();
        a.sleep();
        a.fly();
        LiveAble.run();//无法继承方法，无法调用
    }
}
