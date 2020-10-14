/**
 * @author gsy
 */
public class Student1 {
    private String name;
    private int age;
    private int sid;
    // 类变量，记录学生数量，分配学号
    public static int numberOfStudent = 0;
    
    public void student(String name, int age) {
        this.name = name;
        this.age = age;
        //分配学号
        this.sid = ++numberOfStudent;
    }

    public void show(){
        System.out.println("Student:name="+name+",age="+age+",sid="+sid);
    }
}
