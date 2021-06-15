package ArrayTest;

public class TestArray {

    /**
     * 输入一个数组,以字符串形式输出
     * 要判断所有输入情况，数组为null，或者数组里面啥也没有的情况
     * @param array int[] array = {1,2,3,4,5}
     * @return  返回一个字符串[1, 2, 3, 4, 5]
     */

    public static String myString(int[] array) {

        if(array == null) {
            return "null";
        }
        if(array.length == 0) {
            return "[]";
        }
        String ret = "[";
        for(int i =0;i<array.length;i++) {
            if(i!=array.length-1) {
                ret = ret + array[i]+", ";
            }else {
                ret +=array[i] + "]";
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] array = null;
        String str = myString(array);
        System.out.println(str);
    }

    /**
     * 输入一个数组，让数组每个元素以字符串输出
     * @param array 整型数组 int[] array = {1,2,3,4,5}
     * @return  字符串[ 1, 2, 3, 4, 5]
     * 下面这个代码做不到空格
     */

    public static StringBuilder myString1(int[] array) {

        StringBuilder str = new StringBuilder();
        for(int i = 0;i<array.length;i++) {
            str.append(array[i]);
        }
        return str;

    }

    public static void main2(String[] args) {

        int[] array = {1,2,3,4,5,6};
        String str = myString(array);
        System.out.println("[ "+str+" ]");//[ 123456 ]
    }


    /**
     * 通过数组传引用交换两个变量的值
     * @param array1 数组作为形参，传引用，传地址
     */
    public static void swap(int[] array1) {
        int tmp = array1[0];
        array1[0] = array1[1];
        array1[1] = tmp;

    }

    public static void main1(String[] args) {
        int[] array  = {10,20};

        System.out.println(array[0] + " " + array[1]);

        swap(array);
        System.out.println(array[0]+" "+ array[1]);
    }
}
