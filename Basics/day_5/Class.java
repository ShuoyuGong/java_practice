public class Class {
    String name;
    int age;
    public static void main(String[] args){
        Student s = new Student();
        System.out.println("s:"+s);
        System.out.println("姓名："+s.name);
        System.out.println("年龄："+s.age);
        System.out.println("---------------------------");

//      给成员变量赋值
        s.name = "GSY";
        s.age = 20;
        System.out.println("姓名："+s.name);
        System.out.println("年龄："+s.age);
        System.out.println("---------------------------");

//      调用成员方法
        s.study();
        s.eat();

    }



}
