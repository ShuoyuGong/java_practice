public class SumHundred {
  public static void main(String[] args) {
    System.out.print(Sum());
  }

  public static int Sum() {
    int res = 0;
    for (int i = 0; i <= 100; i++) {
      res += i;
    }
    return res;
  }
}