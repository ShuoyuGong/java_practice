class NewPhone extends PhoneOne {
    @Override
    public void showNum(){
        super.showNum();
        System.out.println("显示来电姓名");
        System.out.println("显示头像");
    }
}
