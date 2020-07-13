public class PrintRectangle {
  public static void main(String[] args) {
    print();
  }

  public static void print() {
    for (int i = 0; i <= 5; i++) {
      for (int j = 0; j <= 8; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}