public class User {
//    成员变量
    private String username;
    private double leftMoney;

//    构造方法
    public User(){}
    public User(String username,double leftMoney){
        this.username = username;
        this.leftMoney = leftMoney;
    }


//    get/set方法
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }

    public double getLeftMoney(){
        return leftMoney;
    }
    public void setLeftMoney(double leftMoney){
        this.leftMoney = leftMoney;
    }


//    展示信息的方法
    public void show(){
        System.out.println("用户名："+username+"，余额"+leftMoney+"元");
    }
}
