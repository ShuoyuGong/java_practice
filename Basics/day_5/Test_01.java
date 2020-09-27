public class Test_01 {
    public static void main(String[] args){
        Phone p = new Phone();
        System.out.println("品牌："+p.brand);
        System.out.println("价格："+p.price);
        System.out.println("颜色："+p.color);
        System.out.println("---------------------");


        p.brand = "GSY";
        p.price = 2000;
        p.color = "blue";

        System.out.println("品牌："+p.brand);
        System.out.println("价格："+p.price);
        System.out.println("颜色："+p.color);
        System.out.println("---------------------");


        p.call("龚烁宇");
        p.sendMessage();

    }
}
