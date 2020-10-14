public class SplitFunction {
    public static void main(String[] args){
        String s = "aa-dd-gg-bb-rr-yy";
        String[] strArray = s.split("-");
        for(int i = 0;i < strArray.length;i++){
            System.out.println(strArray[i]);
        }
    }
}
