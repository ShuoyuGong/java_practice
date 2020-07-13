public class Achievement {
  public static void main(String[] args) {
    int s = 90;
    if (s >= 90 && s <= 100) {
      System.out.println("优秀");
    } else if (s >= 80 && s <= 89) {
      System.out.println("好");
    } else if (s >= 70 && s <= 79) {
      System.out.println("良");
    } else if (s >= 60 && s <= 69) {
      System.out.println("及格");
    } else if (s < 60) {
      System.out.println("不及格");
    } else {
      System.out.println("非法数据");
    }
  }
}