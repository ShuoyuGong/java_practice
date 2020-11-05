public class ExtendsDemo2 {
    public static void main(String[] args){
//        创建子类对象
        NewPhone np = new NewPhone();


//        调用父类继承方法而来的方法
        np.call();


//        调用子类重写的方法
        np.showNum();
    }
}
