/**
 * @author gsy
 */
public class StaticVariable {
    private String name;
    private int age;
    private int sid;
    public static int numberOfStudent = 0;


    public StaticVariable(String name, int age){
        this.name = name;
        this.age = age;
        this.sid = ++numberOfStudent;
    }
    public StaticVariable(){
    }

    public static void showNum() {
        System.out.println("num:" + numberOfStudent);
    }


    public void show(){
        System.out.println("Student : name=" + name + ", age=" + age + ", sid=" + sid);
    }
}
