public class MaxValueArray {
    public static void main(String[] args){
        int[] arr = {12,45,78,90,45,23,1234534};
        int max = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
