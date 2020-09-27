public class Use_Student_1 {
    public static void main(String[] args){
//        创建学生数组
        Student_1[] news = new Student_1[3];
//        创建学生对象
        Student_1 s1 = new Student_1("GSY",20);
        Student_1 s2 = new Student_1("GS",30);
        Student_1 s3 = new Student_1("GY",40);
//        把学生对象作为元素赋值给数组
        news[0] = s1;
        news[1] = s2;
        news[2] = s3;
        for(int i = 0;i<news.length;i++){
            Student_1 s = news[i];
            System.out.println(s.getName()+"-------"+s.getAge());
        }
    }
}
