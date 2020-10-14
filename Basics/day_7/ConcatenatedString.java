public class ConcatenatedString {
    public static void main(String[] args) {
        //        定义一个方法，把数组{1,2,3}按照指定个格式拼接成一个字符串。格式参照如下：[word1#word2#word3]。
        int[] arr = {1, 2, 3};
        String s = arrayToString(arr);


        System.out.println("s:" + s);


    }


    public static String arrayToString(int[] arr) {
        String str = new String("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                str = str.concat(arr[i] + "]");
            } else {
                str = str.concat(arr[i] + "#");
            }
        }
        return str;
    }
}
