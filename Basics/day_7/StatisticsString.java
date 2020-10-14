import java.util.Scanner;

public class StatisticsString {
    public static void main(String[] args) {
//        键盘录入字符
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串数据");
        System.out.println("--------------------------");


        String s = sc.nextLine();


//        定义统计变量
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
//        遍历字符串，得到每一个字符
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

//            拿字符进行判断
            if (ch >= 'A' && ch <= 'Z') {
                bigCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                smallCount++;
            } else if (ch >= '0' && ch <= '9') {
                numberCount++;
            } else {
                System.out.println("该字符" + ch + "非法");
            }
        }


//        输出结果
        System.out.println("大写字符：" + bigCount);
        System.out.println("小写字符：" + smallCount);
        System.out.println("数字字符：" + numberCount);

    }
}
