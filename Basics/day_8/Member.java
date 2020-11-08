import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member(){}

    public Member(String username,double leftMoney){
        super(username, leftMoney);
    }

//    打开红包
    public void openHB(ArrayList<Double> list){
//        创建random对象
        Random r  = new Random();
//        随机生成一个角标
        int index = r.nextInt(list.size());
//        移除金额
        Double money = list.remove(index);
//        调用父类方法 设置余额
        setLeftMoney(money);
    }
}
