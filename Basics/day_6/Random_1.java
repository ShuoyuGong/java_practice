import java.util.Random;
public class Random_1 {
    public static void main(String[] args){
        int max_number = 50;
        Random r = new Random();
        for(int i = 1;i<=50;i++){
            int num = r.nextInt(50 +1);
            if(num == 50){
                System.out.println("-------------------");
            }
            System.out.println(num);
        }
    }
}
