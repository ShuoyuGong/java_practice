import java.util.Random;
import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args){
//        生成数字
        Random r_class = new Random();
        int num = r_class.nextInt(101);
        System.out.println(num);
        System.out.println("数字已生成，游戏开始");
        Scanner s_class = new Scanner(System.in);
        int guess_num = s_class.nextInt();
        while(num != guess_num){
            if(guess_num > num){
                System.out.println("大了");
                guess_num = s_class.nextInt();
            }else if(guess_num < num){
                System.out.println("小了");
                guess_num = s_class.nextInt();
            }
        }
        System.out.println("正确");
    }
}
