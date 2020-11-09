public class Human implements LiveAble{
    @Override
    public void eat() {
        System.out.println("吃东西");
    }

    @Override
    public void sleep() {
        System.out.println("睡觉");
    }


//    默认方法 继承，什么都不用写，直接调用


//    重写默认方法

    @Override
    public void fly() {
        System.out.println("自由飞翔");
    }


//    无法重写静态方法
}
