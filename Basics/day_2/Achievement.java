public class Achievement {
  public static void main(String[] args) {
    int s = 90;
    if (s >= 90 && s <= 100) {
      System.out.println("����");
    } else if (s >= 80 && s <= 89) {
      System.out.println("��");
    } else if (s >= 70 && s <= 79) {
      System.out.println("��");
    } else if (s >= 60 && s <= 69) {
      System.out.println("����");
    } else if (s < 60) {
      System.out.println("������");
    } else {
      System.out.println("�Ƿ�����");
    }
  }
}