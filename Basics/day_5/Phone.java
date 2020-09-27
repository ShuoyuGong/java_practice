public class Phone {
    String brand;
    int price;
    String color;


//    成员方法
    public void call(String name){
        System.out.println("给"+name+"打电话");
    }
//    发短信
    public void sendMessage(){
        System.out.println("群发短信");
    }
}
