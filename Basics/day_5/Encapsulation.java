public class Encapsulation {
    private String name;
    private int age;


    public void main(String[] args){
        setName("龚烁宇");
        System.out.println(name);
    }

    public void setName(String name){
//        name =name;
        this.name = name;
    }

    public void setAge(int age){
//        age = age;
        this.age = age;
    }


}
