package wrapperClass;

/**
 * 包装类：总有一些地方，必须用到对象，但8种基本数据类型作为特例，总是显得格格不入
 * java为每种基本数据类型，一一对应了一个类，由该类将基本数据类型包起来
 *八种基本数据类型的包装类
 * byte  Byte
 * short  Short
 * int   Integer
 * long   Long
 * float   Float
 * double   Double
 * boolean  Boolean
 * char   Character
 *
 * 包装类使用：
 * 1.可以将int类型变为Integer  装箱过程
 * int a = 10;
 * Integer aBox = new Integer(a);
 * 当a的值改变为200之后，但是aBox的值仍然不变，一旦装箱完成，与a没有关系了
 *包装类是引用类型 比较的时候要用a.equals(b)
 */


public class TestDemo {


    public static void main(String[] args) {

        Integer a = 100;
        Integer b = 200;

//        if(a == b) {
//            System.out.println("tgafq");
//        } else {
//            System.out.println("fahiofqa");
//        }
        if(a.equals(b)) {
            System.out.println("哈哈");
        }else {
            System.out.println("hhe1'");
        }
    }

    public static void main1(String[] args) {

        int a = 100;
        Integer aBox = new Integer(a);
        a = 200;
        Integer aBox1 = a;
        aBox = 200;
        System.out.println(a);//200
        System.out.println(aBox);//100
        System.out.println(aBox1);//200
    }

}
