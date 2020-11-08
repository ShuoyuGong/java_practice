import java.util.ArrayList;

public class Qunzhu extends User {
//定义构造类
    public Qunzhu(){}

public Qunzhu(String username,double leftMoney){
//        通过super调用父类构造方法
    super(username,leftMoney);
}


public ArrayList<Double> send(int money,int count){
//        获取群主余额
    double leftMoney = getLeftMoney();
    if(money > leftMoney){
        return null;
    }
    //    修改群主的余额
    setLeftMoney(leftMoney - money);
//    创建集合 保存等份余额
    ArrayList<Double> list = new ArrayList<>();
//扩大100倍，避免小数运算损失精度
    money = money * 100;
//    每份的金额
    int m = money /count;
//    不能整除的余数
    int l = money % count;
//    无论是否整除，n-1份 都是每份的等额金额
    for (int i = 0;i < count -1 ;i++){
        list.add(money /100.0);
    }
//    判断是否整除
    if(l == 0){
        list.add( m /100.0);
    }else {
        list.add((m+l)/100.0);
    }

    return list;

}
}
