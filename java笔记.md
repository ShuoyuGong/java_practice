============================day_0===============================入门程序、常量、变量
1.编译
    将我们编写的java源文件翻译成JVM认识的class文件，在这个过程中，javac编译器会检查我们所写的程序是否有错误，有错误就会提示出来，没有错误就会编译成功
2.运行
    将calss文件交给JVM运行，此时JVM就会执行编写的程序了
3.main方法
    主方法，固定格式不可修改，main方法是程序入口或起点，无论我们编写多少程序，JVM运行的时候，都会从main方法执行
4.常量
    类型                含义                                               数据举例
    整数常量            所有的整数                                         0，1，567，-9
    小数常量            所有的小数                                         0.0  -0.1  2.55
    字符常量            单引号引起来，只能写一个字符，必须有内容            'a'  '',  '好'
    字符串常量          双引号引起来，可以写多个字符，也可以不写            "A","hello","你好",""
    布尔常量            只有两个值                                         true,false
    空常量              只有一个值                                         null
5.数据类型分两类
    基本数据类型：包括整数，浮点数，字符，布尔
    引用数据类型：包括类，数据，接口
6.基本数据类型
    数据类型             关键字                      内存占用               取值范围
    字节型               byte                        1个字节                -128-127
    短整形               short                       2个字节                -32768-32767
    整形                 int                         4个字节                -231次方-2的31次方-1
    长整形               long                        8个字节                -2的63次方-2的63次方-1
    单精度浮点数         float                       4个字节                1.4013E-45-3.4028E+38
    双精度浮点数         double                      8个字节                4.9E324-1.79EE+308
    字符型               char                        2个字节                0-65535
    布尔类型             boolean                     1个字节                true,false
7.变量定义
  1.变量定义包括三个要素：数据类型，变量名，数据值
  2.格式：数据类型 变量名 = 数据值
  3.练习
      定义所有基本数据类型的变量(Variable.java)
  4.注意事项
    变量名称：在同一大括号内范围内，变量的名字不可相同
    变量赋值：定义的变量，不赋值不能使用

============================day_1===============================数据类型转换、运算符、方法入门
0.学习内容
    1.数据类型转换
    2.算数运算符
    3.比较运算符
    4.逻辑运算符
    5.三元运算符
    6.简单方法定义和调用
1.自动转换
    一个int类型变量和一个byte类型变量进行加法运算，结果会是什么数据类型(Sum.class)
    自动转换：将 取值范围小的类型 自动提升为 取值范围大的类型
    byte类型内存占有1个字节，在和int类型运算时提升为int类型，自动补充3个字节，因此计算后的结果还是int类型
    当一个int类型变量和一个double变量运算时，int类型将会自动提升为double类型进行运算(DouleSum.java)
    转换规则：范围小的类型向范围大的类型提升，byte,short,char运算时直接提升为int
    byte/short/char-->int-->long-->float-->double
2.强制转换
    int i = 1.5 ----->直接赋值-->错误
    强制类型转换：将 取值范围大的类型 强制转换为 取值范围小的类型，自动转换是java自动执行的，而强制转换需要手动执行
    转换格式：数据类型 变量名 = (数据类型) 被转数据值
    将 1.5 赋值到 int 类型，代码为：
    int i = (int) 1.5;
3.算数运算符
    +                              加法运算，字符串拼接运算
    -                              减法
    *                              乘法
    /                              除法
    %                              去摸运算，两个数字相除取余数
    ++/--                          自增自减运算
    java中，整数使用以上运算符，无论怎么计算，也不会得到小数(Count.java)
4.混合运算时++i和i++的区别
    ++i：先计算，在赋值(PlusPlusi.java)
    i++：先赋值，在计算(IPlusPlus.java)
5.+符号在字符串中的操作(StringSplicing.java)
    +符号在遇到字符串的时候，表示连接、拼接的含义
    "a"+"b"的结果是"ab",连接含义
6.赋值运算符
    =                               等于号
    +=                              加等于
    -=                              减等于
    *=                              乘等于
    /=                              除等于
    %=                              取模等
    赋值运算符，将符号右边的值，赋给左边的变量(AssignmentOperation.java)
7.比较运算符(ComparisonOperation.java)
    ==                    比较符号两边数据是否相等，相等结果为true
    <                     比较符号左边的数据是否小于右边的数据，如果小于结果为true
    >                     比较符号左边的数据是否大于右边的数据，如果大于结果为true
    <=                    比较符号左边的数据是否小于等于右边的数据，如果小于等于结果为true
    >=                    比较符号左边的数据是否大于等于右边的数据，如果大于等于结果为true
    !=                    比较符号左边的数据是否不等于右边的数据 ，如果不等于结果为true
8.逻辑运算符(LogicalOperation.java)
                                两边都是true,结果为true
    &&         短路于           一边是false,结果是false
                                短路特点：符号左边是false,右边不在运算

    ||         短路或           两边都是false,结果是false
                                一边是true,结果是true
                                短路特点：符号左边是true，右边不在运算

    !          取反             !true结果是false    !false结果是true
    逻辑运算符，用来连接两个布尔类型结果的运算符，运算结果都是布尔值true 或 false
9.三元运算符
    三元运算符格式：数据类型 变量名 = 布尔类型表达式 ? 结果1 : 结果2
    三元运算符计算方式：(TernaryOperation.java)
        布尔类型表达式结果为true，三元运算符整体结果为结果1，赋值给变量
        布尔类型表达式结果为false，三元运算符整体结果为结果2，赋值给变量
10.方法
    10.1  定义
              将一个功能抽取出来，把代码单独定义在一个大括号内，形成一个单独的功能，当需要这个功能的时候，就可以调用，即实现了代码的复用性，也解决了代码冗余现象
    10.2  方法的定义
              定义格式：
                  修饰符 返回值类型  方法名(参数列表){
                    code......
                    return ;
                  }
              定义格式解释：
                  修饰符：目前固定写法public static
                  返回值类型：目前固定写法void,其他返回值类型再说
                  方法名：我们定义的方法起名，满足标识符规范，用来调用方法
                  参数列表：目前无参数，有参数再说
                  return：方法结束，因为返回值类型是void，方法大括号内return可以不写
    10.3  方法的调用(MethodCall.java)
              方法不会自己运行，需要我们调用，我们在主方法main中调用定义好的方法
    10.4  三元运算符方法调用(TernaryMethodCall.java)
    10.5  注意事项
              方法必须定义在一类中方法外
              方法不能定义在另一个方法里面

============================day_2===============================流程控制语句
0.学习内容
    1.if,else判断语句
    2.switch选择语句
    3.for循环语句
    4.while循环语句
    5.do while循环语句
    6.跳出语句break，continue
1.顺序结构(顺序执行，根据编写的顺序，从上到下运行)
    public static void main(String[] args){
      System.out.println(1);
      System.out.println(2);
      System.out.println(3);
    }
2.判断语句
    2.1 IF(IF.java)
          if(关系表达式){
            语句体;
          }
    2.2 IF...ELSE
          if(关系表达式){
            语句体1;
          }else{
            语句体2;
          }
    2.3 IF...ELSE...IF...ELSE(Achievement.java)
          if(判断条件1){
            执行语句1;
          }else if(判断数据2){
            执行语句2;
          }
          ...
          }else if(判断条件n){
            执行语句n;
          }else{
            执行语句n+1;
          }
3.选择语句(Week.java)
    3.1格式
         switch(表达式){
           case 常量值1:
              语句体1;
              break;
            case 常量值2:
              语句体2;
              break;
            ...
            default:
              语句体n+1;
              break;
         }
4.循环语句
    4.1FOR循环语句格式
        for(初始化表达式1;布尔表达式2;步进表达式3){
          循环体3;
        }
        执行顺序1234>234>234...2不满足为止
        练习1：输出10次HelloWorld(TenHelloWorld.java)
        练习2：计算1-100之间的偶数和(OneHundredSum.java)
    4.2WHILE循环语句
        初始化表达式1
            while(布尔表达式2){
              循环体3
              步进表达式4
            }
        执行顺序1234>234>234...2不满足为止
        练习1：输出10次HelloWorld(TenHelloWorldWhile.java)
        练习2：计算1-100之间的偶数和(OneHundredSumWhile.java)
    4.3DO...while循环语句
        初始化表达式1
            do{
              循环体3
              步进表达式4
            }while(布尔表达式2)
            执行顺序134>234>234...2不满足为止
        练习1：输出10次HelloWorld(TenHelloWorldDoWhile.java)
    4.4FOR和WHILE的区别
        控制条件语句所控制的那个变量，在for循环结束后，就不能在访问了，而while循环结束还可以继续使用，如果你想继续使用，就用while，否则推荐使用for，原因是for循环结束，该变量就从内存中消失，能够提高内存的效率
        在已知循环次数的时候推荐使用for，循环次数未知时候推荐使用while

============================day_3===============================Idea、方法
0.学习目标
    1.集成开发工具开发IDEA
    2.方法的参数和返回值
    3.方法的重载
1.方法的定义和调用-->输出五行*(PrintRectangle.java)
2.定义方法两个明确-->整数求和(IntSum.java)
    需求：定义方法实现两个整数的求和计算
    明确返回值类型：方法计算的是整数求和，结果必然是个整数，返回值类型定义为int类型
    明确参数列表：计算拿两个整数的和，并不清楚，但可以确定是整数，参数列表可以定义为两个int类型的变量，由调用者定义方法时传递
3.判断两个数字是否相等(IntBeEqualTo.java)
    分析：定义方法实现功能，需要两个明确，即返回值和参数列表
    明确返回值：比较整数，比较的结果只有两种可能，结果是布尔类型
    明确参数列表：比较的两个整数不确定，所以默认定义int类型的参数
4.计算1-100的和(SumHundred.java)
    明确返回值：1-100的求和，计算后必然还是整数，返回值类型是int
    明确参数：需求中已知到计算的数据，没有未知的数据，不定义参数
5.实现不定次数打印(IndefiniteNumPrint.java)
6.方法的重载
    定义：指在同一个类中，允许存在一个以上的同名方法，只要他们参数列表不同即可，与修饰符和返回值类型无关
    参数列表：个数不同，数据类型不同，顺序不同
    重载方法练习:JVM通过方法的参数列表，调用不同的方法
    6.1练习1：(Equal.java)
            比较两个数据是否相等，参数类型分别为两个byte类型，两个short类型，两个int类型，两个long类型，并在main方法中测试
    6.2练习2：(Println.java)
            模拟输出语句中的println方法效果，传递什么类型的数据就输出什么类型的数据，只允许定义一个方法名println

============================day_4===============================数组
0.学习目标
    1.数组概念
    2.数组的定义
    3.数组的索引
    4.数组内存
    5.数组的遍历
    6.数组的最大值获取
    7.数组反转
    8.数组作为方法参数和返回值
1.JAVA内存
    1.栈(Stack)：存放的都是方法中的局部变量，方法运行一定要在栈当中运行
        局部变量：方法的参数，或者是方法{}内部变量
        作用域：一旦超出作用域，立刻从栈内存中消失
    2.堆(Heap)：凡是new出来的东西，都在堆当中
        堆内存里面的东西都有一个地址值：16进制
        堆内存里面的数据，都有默认值，规则：
            整数          默认为0
            浮点数        默认为0.0
            字符          默认为'\U0000'
            布尔          默认为false
            引用类型      默认为null
    3.方法区(Method Area)
        存储.class相关信息，包含方法的信息
    4.本地方法栈(Native Method Stack)
        与操作系统相关
    5.寄存器(PC Register)
        与CPU相关
2.容器概念
    容器：是将多个数据存储到一起，每个数据为该容器的元素
3.数组概念
    数组就是存储数据长度的容器，保证多个数据的数据类型要一致
4.数组的定义
    4.1方式一：
        数组存储的数据类型[]  数组名字    =   new 数组存储的数据类型[长度];
        数组定义格式解释
            数组存储的数据类型：创建的数组容器可以存储什么数据类型
            []：表示数组
            数组名字：为定义的数组起个变量名，满足标识符规范，可以使用名字操作数组
            new：关键字，创建的数组容器可以存储什么数据类型
            数组存储的数据类型：创建的数组容器可以存储什么数据类型
            [长度]：数组的长度，表示数组容器中可以存储多少个元素
            注意：数组有定长特性，长度一旦修改，不可更改
            定义一个可以存储3个整数的数组容器：代码如下
            int[] arr = new int[3];
    4.2方式二：
        数据类型[] 数组名 = new 数据类型[]{元素1,元素2,元素3...};
        int[] arr = new int[]{1,2,3,4,5};
    4.3方式三：
        数据类型[] 数组名 = {元素1，元素2，元素3...};
        int[] arr = {1,2,3,4};
5.数组的访问
    5.1索引
        每一个存储到数组的元素，都会自动拥有一个编号，从0开始，这个编号称为数组索引(index)；可以通过数组的索引访问到数组中的元素
    5.2格式
        数组名[索引]
    5.3数组的长度属性(Array.java)
        每个数组都具有长度，而且是固定的，java中赋予了数组的一个属性，可以获取到数组的长度，语句为：数组名.length，
        属性length的执行结果就是数组的长度，int类型结果，由此可以判断，数组的最大索引值为数组名.length-1
    5.4索引访问数组的元素(VisitArray.java)
        数组名[索引] = 数值，为数组中的元素赋值
        变量=数组名[索引]，获取出数组中的元素
6.数组在内存中存储
    一个数组内存图(ArrayMap.java)
7.数组越界异常(ArrayCross.java)
8.数组空指针异常(EmptyArray.java)
9.数组遍历(ForArray.java)
10.数组获取最大值元素(MaxValueArray.java)
11.数组反转(UpsideDownArray.java)
12.数组作为方法返回值(ArrayFun.java)
13.方法参数类型区别
    13.1(ChangeArray.java)
    13.2(ChangeArray1.java)
    总结：方法的参数为基本类型时，传递的是数据值，方法的参数为引用类型时，传递的是地址值

============================day_5===============================类与对象，封装，构造方法
0.学习目标
    1.面向对象
    2.类与对象
    3.三大特征--封装
    4.构造方法
1.对象的特点
    面向对象思想是一种更符合我们思考习惯的思想，它可以将复杂的事情简单化，并将我们从执行者变成了指挥者。面向对象的语言中，包含了三大基本特征-->封装、继承、多态
2.什么是类
    类：是一组相关属性和行为的集合。可以看成是一类事物的模版，使用事物的属性、特征和行为来描述该类事物
    属性：该事物的状态信息
    行为：该事物能够做什么
3.类与对象的关系
    类是对一类事物的描述，是抽象的
    对象是一类事物的实例，是具体的
    类是对象的模版，对象是类的实体
4.类的定义格式(Class.java)
    public class ClassName{
        //成员方法
        //成员变量
    }
    定义类：就是定义类的成员，包括成员变量和成员方法
    成员变量：和以前定义变量几乎一样，只不过位置发生了改变，在类中，方法外
    成员方法：和以前定义变量几乎一样，只不过把static去掉
5.对象的使用(Class.java,Student.java)
    5.1对象使用的格式
        创建对象：类名  对象名  =  new 类名();
        使用对象访问类中的成员：对象名.成员变量;   对象名.成员方法();
    5.2类与对象的练习(Phone.java,Test_01.java)
6.封装
    1.步骤：
        使用private关键字来修饰成员变量
        对需要访问的成员变量。提供对应的一对getXXX方法，setXXX方法
    2.封装的操作
        2.1private的含义
            private是一个权限修饰符，代表最小权限
            可以修饰成员变量和成员方法
            被private修饰后的成员变量和成员方法，只有在本类中才能访问
        2.2private的使用格式(Encapsulation.java)
            private 数据类型  变量名;
    3.构造方法
        当一个对象被创建的时候，构造方法用来初始化该对象，给对象的成员变量赋初始值
        定义格式：(Structure.java)
            修饰符  构造方法名  (参数列表){
                方法体
            }

============================day_6===============================Scanner类、Random类、ArrayList类
0.学习目标
    1.API概述
    2.Scanner类
    3.Random类
    4.ArrayList类
1.API概述
    API(Application Programming Interface)，应用程序编程接口。java API是程序员的字典，是JDK中提供给我们使用的类的说明文档，这些类将底层的代码实现
    封装了起来，我们不需要关心这些类是如何实现的，只需要学习这些类如何使用即可。
2.Scanner类
    2.1什么是Scanner类
        一个可以解析基本类型和字符串简单文本扫描器，例如，以下代码使用户能够从System.in中读取一个数
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
    2.2引用类型使用步骤
        导包：使用import关键字导包，在类中所有代码之前导包，java.lang包下的所有类无需导入
        格式：import 包名.类名;
        举例：java.util.Scanner;
        创建对象：使用该类的构造方法，创建一个该类的对象
        格式：数据类型 变量名 = new 数据类型(参数列表)
        举例：Scanner sc = new Scanner(System.in);
        调用方法：调用该类的成员方法，完成执行功能
        变量名.方法名();
        举例：int i = sc.nextInt();//接收上一个键盘录入的整数
    2.3Scanner使用步骤
        2.3.1 查看类
                java.util.Scanner：该类需要import导入使用
        2.3.2 查看构造方法
                public Scanner(InputStream source)：构造一个新的Scanner,它生成的值是从指定的输入流扫描的
        2.3.3 查看成员方法
                public int nextInt():将输入信息的下一个标记扫描为一个int值
        2.3.4 练习(PracticeScanner.java)
        2.3.5 练习(ScannerSum.java)
        2.3.6 练习(ScannerMax.java)
    2.4匿名对象
        概念：创建对象时，只有创建对象的语句，却没有把对象地址赋值给某个变量。虽然是创建对象的简化写法，但是应用场景非常有限
        格式：new 类名(参数列表);
        举例：new Scanner(System.in);
        应用场景
            1.创建匿名对象直接调用方法，没有变量名
                new Scanner(System.in).nextInt();
            2.一旦调用两次方法，就是创建了两个对象，造成浪费
                new Scanner(System.in).nextInt();
                new Scanner(System.in).nextInt();
            3.一个匿名对象只能，只能调用一次
            4.匿名对象可以作为方法的参数和返回值
                2.4.4.1 作为参数(AsValue.java)
                2.4.4.2 作为返回值(AsReturnValue.java)
3.Random类
    3.1 定义：此类的实例用于生成伪随机数
    3.2 Random使用步骤
        3.2.1 查看类
            java.util.Random 该类需要import导入后使用
        3.2.2 查看构造方法
            public Random() 创建一个新的随机数生成器
        3.2.3 查看成员方法
            public int nextInt(int n) 返回一个伪随机数，范围在包括0和指定值不包括n之间的int值
        3.2.4 使用Random类，完成生成3个10以内的随机整数的操作(Random_0.java)  
        3.2.5 使用Random类，获取1-n之间的随机数，包含n(Random_1.java)
        3.2.6 猜数字小游戏(GuessNumber.java)
4.ArrayList类
    4.1 引入----对象数组 使用学生数组，存储3个学生对象(Student_1.java,Use_Student_1.java)
    4.2 什么是ArrayList类
        java.util.ArrayList是大小可变得数组得实现，存储在内的数据称为元素。此类提供一些方法来操作内部存储的元素，
        ArrayList中可不断添加元素，其大小也自动增长
    4.3 ArrayList使用步骤
        4.3.1 查看类
            java.util.ArrayList <E>:该包需要导入后使用
            <E>表示一种数据类型，叫做泛型，E，取自Element(元素)的首字母，在出现E的地方，我们使用一种引用数据类型将其替换即可，表示我们将存储哪种引用类型的
            元素，代码如下：
                ArrayList<String>,ArrayList<Student>
        4.3.2 查看构造方法
            public ArrayList()：构造一个内容为空的集合
            基本格式：ArrayList<String> list = new ArrayList<String>();
            在jdk7后，右侧泛型的尖括号之内可以留空，但是<>仍然要写，简写格式：ArrayList<String> list = new ArrayList<>();
        4.3.3 查看成员方法
            public boolean add(E e):将指定元素添加到此集合的尾部
            参数 E e，在构造ArrayList对象时，<E>指定了什么数据类型，那么add<E e>方法中，只能添加什么数据类型的对象
        4.4.4 使用ArrayList类，存储三个字符串元素(ArrayList_0.java)
        4.4.5 常用方法和遍历(ArrayList_1.java)
            对于元素的操作，基本体现在增，删，查
            public boolean add(E e):将指定的元素添加到此集合的尾部
            public E remove(int index)：移除此集合指定位置上的元素，返回被删除的元素
            public E get(int index):返回此集合中指定位置上的元素，返回获取的元素
            public int size():返回此集合中的元素数，遍历集合时，可以控制索引范围，防止越界
            
    4.4 ArrayList练习
        4.4.1 将随机数添加到数组集合(Random_ArrayList.java)
        4.4.2 打印集合方法(PrintCollection.java)
        4.4.3 获取集合方法(GetCollecction.java)

============================day_7===============================String类、static关键字、Arrays类、Math类
0.学习目标
    1.String类
    2.static关键字
    3.Arrays类
    4.Math类
1.String类
    1.1 String类概述
        java.lang.String类代表字符串，java程序中所有的字符串文字，(例如"abc"),都可以看作此类的实例
        类String包括用于检查各个字符串的方法，比如比较字符串，搜索字符串，提取字符串以及创建具有翻译为大些或小写的所有字符的字符串副本
    1.2 特点
        1.2.1 字符串不变：字符串的值在创建后不能更改
            String s1 = "abc";
            s1 += "d";
            System.out.println(s1);
            内存中有"abc","abcd"两个对象，s1从指向"abc",改变指向,改指向了"abcd"
        1.2.2 因为String是不可变的，所以他们可以被共享
            String s1 = "abc";
            String s2 = "sbc";
            内存中只有一个"abc"被创建,同时被s1和s2共享
        1.2.3 "abc"等效于char[] data = {'a','b','c'}
            例如：
                String str = "abc";
            相当于：
                char data[] = {'a','b','c'};
                String str = new String(data);
            String底层是依靠字符数组实现的
    1.3 使用步骤
        1.3.1 查看类 
            java.lang.String; 此类不需要导入
        1.3.2 查看构造方法
            public String() 初始化新创建的String对象，以使其表示空字符序列
            public String(char[] value) 通过当前参数中的字符数组来构造新的String
            public String(byte[] value) 通过使用平台的默认字符集编码当前参数中的字节数组来构造新的String
            构造举例(ExamplesOfConstruction.java)
        1.3.3 判断功能的方法(JudgmentComparison.java)
            public boolean equals (Object anObject) ：将此字符串与指定对象进行比较
            public boolean equalsIgnoreCase(String anotherString) :将此字符串与指定对象比较，忽略大小写
        1.3.4 获取功能的方法(GetFunction.java)
            public int length():返回此字符串的长度
            public String concat (String str):将指定的字符串连接到该字符串的结尾
            public char charAt(int index):返回指定索引的char值
            public int indexOf(String str):返回指定子字符串第一次出现在该字符串内的索引
            public String substring (int beginIndex):返回一个子字符串，从beginIndex开始截取字符串至字符串结尾
            public String substring(int beginIndex,int endIndex):返回一个字符串，从beginIndex到endIndex截取字符串，含beginIndex,不含endIndex
        1.3.5 转换功能的方法(ConversionFunction.java)
            public char[] toCharArray():将此字符串转换为新的字符数组
            public byte[] getBytes():使用平台的默认字符集将该String编码转换为新的字节数组
            public String replace (Charsequence target,Charsequence replcement()):将此target匹配的字符串使用replcement字符串替换
        1.3.6 分割功能方法(SplitFunction.java)
            public String[] split(String regex):将此字符串按照指定的regex(规则)拆分为字符串数组
    1.4 使用类练习
        1.4.1 拼接字符串(ConcatenatedString.java)
        1.4.2 统计字符串(StatisticsString.java)
2.Static关键字
    2.1 概述
        关于static关键字的使用，它可以用来修饰的成员变量和成员方法，被修饰的成员是属于类的，而不是单单是属于某个对象的，也就是说，既然属于类，就可以不靠
        创建对象来调用了
    2.2 定义和使用格式
        当static修饰成员变量时，该变量称为类变量，该类的每个对象都共享同一个类变量的值，任何对象都可以更改该类变量的值，但也可以在不创建该类的情况下对类
        变量进行操作
        类变量:使用static修饰的变量
        举例：static int numberID (Diaoyong.java,StaticVariable.java)
    2.3 静态代码块
        给类变量进行初始化赋值(StaticCode.java)
    2.4 static关键字，可以修饰变量、方法、代码块。在使用过程中，其主要目的还是不想创建对象的情况下，去调用方法
3.Arrays类
    3.1 概述
        java.util.Arrays此类包含用来操作数组的各种方法，比如排序和搜索等，其所有方法均为静态方法，调用起来非常简单
    3.2 操作数组的方法
        public static String toString(int[] a):返回指定数组内容的字符串的表示形式(OperationArray.java)
    3.3 练习
        将一个随机字符串中的所有字符升序排列，并倒序打印(ArrayCharSort.java)
4.Math类
    4.1 概述
        java.lang.Math 类包含用于执行基本数学运算的方法，如初等指数，对数，平方根和三角函数。类似这样的工具类，所有方法均为静态方法，并且
        不会创建对象，调用起来非常简单
    4.2 基本运算方法
        4.2.1 public static double abs(double a)：返回double的绝对值
              double s1 = Math.abs(-5); s1值为5
        4.2.2 public static double ceil(double a):返回大于等于参数的最小整数
              double d1 = Math.ceil(3.3) d1值为4.0
        4.2.3 public static double floor(double a):返回小于等于参数最大的整数
              double d1 = Math.floor(3.3) d1值为3
        4.3.4 public static double round(double a):返回最接近参数的long 相当于四舍五入
              long d1 = Math.round(5.5) d1值为6.0
        4.3.5 计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个?(MathTest.java)
        

============================day_8===============================继承、super、this、抽象类
0.学习目标
    1.三大特性--继承
    2.方法重写
    3.super关键字
    4.this关键字
    5.抽象类
1.继承
    1.1 概述
        由来，多个类中存在相同属性和行为时，将这些内容抽取到单独一个类中，那么多类无需在定义这些属性和行为，只需要继承那一个类即可
    1.2 定义
        继承：就是子类继承父类的属性和行为，使得子类对象具有父类相同的属性、相同的行为，子类可以直接访问父类中的非私有的属性和行为
    1.3 好处
        提高代码复用性，类与类之间产生的关系，是多态的前提
    1.4 继承的格式
        通过exends关键字，可以声明一个子类继承另外一个父类，定义格式如下
        class 父类{
            ...
        }
        class 子类 extends 父类{
            ...
        }
    1.5 继承演示(Employee.java/Teacher.java/ExtendDemo1.java)
    1.6 继承后的特点--成员变量
        1.6.1 成员变量不重名，访问没有影响
        1.6.2 成员变量重名，子类会把父类变量覆盖，如果在子类中访问父类中非私有变量时，需要使用super关键字，修饰父类成员变量
    1.7 继承后的特点--成员方法
        1.7.1 成员方法不重名。如果子类父类中出现不重名的成员方法，这是的调用是没有影响的，对象方法调用时，会先在子类中查找有没有对应的方法
        ，若子类中存在就会执行子类中的方法，若子类中没有就会执行父类中的相应方法。
        1.7.2 成员方法重名(重写)。 如果子类父类中出现与父类一模一样的方法时(返回值类型，方法名，参数列表都相同),会出现覆盖效果，也称为重写
        或复写。声明不变，重新实现。
        1.7.3 重写的应用
            子类可以根据需要，定义特定于自己的行为。即沿袭了父类的功能名称，有根据子类的需要重新实现父类方法，从未进行扩展增强。
            (Phone.java/NewPhone.java)，重写时，用到super.父类成员方法，表示调用父类的成员方法
        1.7.4 注意事项
            子类方法覆盖父类方法，必须保证权限大于等于父类权限
            子类方法覆盖父类方法，返回值类型，函数名和参数列表都要一模一样
    1.8 继承后的特点--构造方法
        1.8.1 构造方法的名字是与类名一致的，所以子类是无法继承父类构造方法的
        1.8.2 构造方法的作用是初始化成员变量的，所以子类的初始化过程中，必须先执行父类的初始化动作，子类的构造中默认有一个super()，表示调用父类的构造方法，父类成员变量
        初始化后，才可以给子类使用。代码如下
            class Fu{
                private int n;
                Fu(){
                    System.out.println("Fu()");
                }
            }
            class Zi extends Fu(){
                Zi(){
                    super() 调用父类构造方法
                    super();
                    System.out.println("Zi()");      
                }
            }
            public class ExtendsDemo3{
                public static void main(String[] args){
                    Zi zi = new zi();
                }
            }
            输出结果：
            Fu()
            Zi()
    1.9 super和this
        1.9.1 父类空间优先于子类对象产生
        1.9.2 super和this的含义
            super:代表父类的存储空间标示(可理解为父类的引用)
            this:代表当前对象的引用(谁调用就代表谁)
        1.9.3 super和this的用法
            this.成员变量       -----本类的
            super.成员变量      -----父类的
            this.成员方法名     -----本类的
            super.成员变量名    -----父类的
            this(...)          -----本类的构造方法
            super(...)         -----父类的构造方法
    2.0 继承的特点
        2.0.1 java只支持单继承，不支持多继承
        2.0.2 java支持多层继承(继承体系)
            class A{}
            class B extends A{}
            class C extends B{}
        2.0.3 顶层父类是Object类，所有类默认继承Object，作为父类
2. 抽象类
    2.1 概述
        父类中的方法，被他的子类们重写，子类各自实现都不尽相同。那么父类的方法声明和方法主体，只有声明还有意义，而方法主体则没有存在的意义了，我们把方法主体的方法称为抽象方法，
        java语法规定，包含抽象方法的类就是抽象类
    2.2 定义
        抽象方法：没有方法体的方法
        抽象类：包含抽象方法的类
    2.3 abstract使用格式
        使用abstract关键字修饰方法，该方法就成了抽象方法，抽象方法只包含了一个方法，而没有方法体
        定义格式 : 修饰符 abstract 返回值类型 方法名(参数列表);
                  public abstract void run();
        抽象类：
            如果一个类包含抽象方法，那么该类必须是抽象类
            定义格式：abstract class 类名{}
                     public abstract class Animal{
                        public abstract void run();
                     }
    2.4 抽象的使用(AbstractClass.java)
        继承抽象类的子类必须重写父类所有抽象方法，否则，该子类也必须声明抽象类，最终，必须有子类实现该父类的抽象方法，否则，从最初的父类
        到最终的子类都不能创建对象，失去意义(Animal.java/Cat.java/CatTest.java)
        此时的方法重写，是子类对父类抽象方法的实现，我们将这种方法重写的操作，也叫做实现方法
    2.5 注意事项
        2.5.1 抽象类不能创建对象，如果创建，编译无法通过而报错，只能创建其非抽象子类的对象
        2.5.2 抽象类中，可以有构造方法，是供子类创建对象时，初始化父类成员使用的
        2.5.3 抽象类中，不一定包含抽象方法，但是有抽象方法的类必定是抽象类
        2.5.4 抽象类的子类，必须重写父类中所有抽象方法，否则，编译无法通过而报错，除非该子类也是抽象类
3. 继承的综合案例
    3.1 群主发红包
        群主的一笔金额，从群主余额中扣除，平均分成n份，让成员领取
        成员领取金额后，保存到成员余额中
    3.2 继承体系
        User 用户名 -> 展示信息() 余额 》》》》》群主 发红包 》》》》》成员 开红包
    3.3 实现
        3.3.1 User.java
        3.3.2 Qunzhu.java
        3.3.3 Member.java
        3.3.4 Test.java
        
            
 ============================day_9===============================接口，多态
 0.学习目标
    1.接口
    2.三大特征--多态
    3.引用类型转换
 1. 接口
    1.1 概述
        接口，是java中引用类型，是方法的集合，如果说类的内部封装了成员变量、构造方法和成员方法，那么接口的内部主要就是封装了方法，包含抽象方法，默认方法，和静态方法，私有方法
        接口的定义，它与定义类方式相似，但是使用interface关键字。他也会被编译成.class文件，但一定要明确它并不是类，而是另外一种引用数据类型
        引用数据类型：数据，类，接口
        接口的使用，他不能创建对象，但是可以实现(implements，类似于被继承)。一个实现接口的类(可以看作接口的子类)，需要实现接口中所有的抽象方法，创建该类对象，就可以调用方法
        了，否则他必须是一个抽象类
    1.2 定义格式
        public interface interfaceName{
            抽象方法
            默认方法
            静态方法
            私有方法
        }
    1.3 抽象方法：使用abstract修饰，可以省略，没有方法体，该方法供子类实现使用
        代码如下：
            public interface InterFaceName{
                public abstract void method();
            }
    1.4 默认方法：使用default修饰，不可省略，供子类调用或者子类重写
        代码如下：
            public interface InterFaceName{
                public default void method(){
                    执行语句
                }
            }
    1.5 静态方法：使用static修饰，供接口调用使用
        代码如下：
            public interface InterFaceName{
                public static void method(){
                    执行语句
                }
            }
    1.6 私有方法和私有静态方法
        使用private修饰，供接口中的默认方法或者静态方法调用
        代码如下：
            public interface InterFaceName{
                private void method(){
                    执行语句
                }
            }
    1.7 基本的实现
        1.7.1 实现的概述
            类与接口的关系为实现关系，即类实现接口，该类可以称为接口的实现类，也可以称为接口的子类。实现的动作类似继承，格式相仿，只是关键字不同，实现使用implements关键字
            非抽象子类实现接口：
                1.必须重写接口中所有抽象方法
                2.继承了接口默认方法，既可以直接调用，也可以重写
                3.实现格式
                    class 类名 implements 接口名{
                        重写接口中抽象方法 必须
                        重写接口中默认方法
                    }
    1.8 抽象方法的使用
        1.8.1 定义接口(LiveAble.java)
        1.8.2 定义实现类(Human.java)
        1.8.3 定义测试类(InterFaceDemo.java)
        1.8.4 默认方法的使用
            1.8.1 可以继承，可以重写，二选一，但是只能通过实现类的对象来调用
            1.8.2 继承默认方法
            1.8.3 重写默认方法
    1.9 静态方法的使用(LiveAble.java/Human.java/InterFaceDemo.java)
        1.9.1 静态与.class文件相关，只能使用接口名调用，不可以通过实现类的类名或者实现类的对象调用
        1.9.2 定义接口(LiveAble.java)
        1.9.3 定义实现类 (Human.java)
        1.9.4 定义实现类
    2.0 私有方法的使用(LiveAble.java/Human.java/InterFaceDemo.java)
        私有方法：只有默认方法可以调用
        私有静态方法：默认方法和静态方法可以调用
        如果一个接口中有多个默认方法，并且方法中有重复的内容，那么可以抽取出来，封装到私有方法中，供默认方法去调用。
        2.0.1 定义接口(LiveAble.java)
    2.1 接口的多实现
        2.1.1 在继承体系中，一个类只能继承一个父类，而对于接口而言，一个类是可以实现多个接口的，这叫做接口的多实现。并且，一个类只能继承一
        个父类，同时实现多个接口
        实现格式：
            class 类名 [extends 父类名] implements 接口名1,接口名2,接口名3...{
                重写接口中抽象方法 必须
                重写接口中默认方法 不重名时可选
            }
        2.1.2 抽象方法
            2.1.2.1 接口中，有多个抽象方法时，实现类必须重写所有抽象方法。如果抽象方法有重名的，只需要重写一次(A.java/B.java/InterFaceDemoTwo.java)
            






































