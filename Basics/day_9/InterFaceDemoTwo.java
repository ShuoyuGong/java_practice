public class InterFaceDemoTwo implements A,B {
    @Override
    public void showA() {
        System.out.println("showA");
    }

    @Override
    public void show() {
        System.out.println("show");
    }

    @Override
    public void showB() {
        System.out.println("showB");
    }
}
