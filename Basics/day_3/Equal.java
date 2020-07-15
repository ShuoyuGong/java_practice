public class Equal {
  public static void main(String[] args) {
    byte a = 10;
    byte b = 20;
    short c = 10;
    short d = 20;
    int e = 10;
    int f = 20;
    long g = 10;
    long h = 20;
    System.out.println(compare(a, b));
    System.out.println(compare(c, d));
    System.out.println(compare(e, f));
    System.out.println(compare(g, h));
  }

  public static boolean compare(byte a, byte b) {
    System.out.println("byte");
    return a == b;
  }

  public static boolean compare(short c, short d) {
    System.out.println("short");
    return c == d;
  }

  public static boolean compare(int e, int f) {
    System.out.println("int");
    return e == f;
  }

  public static boolean compare(long g, long h) {
    System.out.println("long");
    return g == h;
  }
}