public interface LiveAble {
//    定义抽象方法
    public abstract void eat();
    public abstract void sleep();

//    默认方法
    public default void fly(){
        System.out.println("天上飞");
    }



//    静态方法
    public static void run(){
        System.out.println("跑起来");
    }

//    default void func(){
//        func1();
//        func2();
//    }


//    私有方法 封装 供默认方法调用使用
//    private void func1(){
//        System.out.println("跑起来-----");
//    }
//    private void func2(){
//        System.out.println("跑起来-----");
//    }
}
