public class ChangeArray1 {
    public static void main(String[] args){
        int[] arr = {1,5,7};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }

    public static void change(int[] arr){
       arr[0] = 5000;
    }
}
