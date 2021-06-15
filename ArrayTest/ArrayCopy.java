package ArrayTest;

import java.util.Arrays;

public class ArrayCopy {

    /*
    数组拷贝
    1.浅拷贝：以下四种方式属于浅拷贝
    2.深拷贝:
    当修改拷贝后的数组当中的下标的元素的时候，不影响原来数组的元素的值。
    拷贝的时候，对象本身也要拷贝，不能只拷贝引用
     */
    /**
     * 方法一：
     * 数组拷贝
      * @param array int array[] = {1,2,3}
     * @return 复制以后的数组
     */
    public static int[] copyArray(int[] array) {
        int[] array1 = new int[array.length];
        for(int i = 0;i<array.length;i++) {
            array1[i] = array[i];
        }
        return array1;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
//        int[] arr = copyArray(array);
//        System.out.println(Arrays.toString(arr));

        //方法二：
        //1.拷贝的原数组 2.拷贝的长度
//        int[] arr = Arrays.copyOf(array,array.length);
//
//        System.out.println(Arrays.toString(arr));

        //方法三：

        /*
         *     public static native void arraycopy(Object src,  int  srcPos,
         *                                         Object dest, int destPos,
         *                                         int length);
         *
         * 1.native:说明此方法是一个本地方法
         * 2.src：源数组
         *   srcPos:源数组的pos位置开始拷贝
         *   dest:拷贝到的目的数组
         *   destPos：拷贝到的目的数组的pos位置
         *   length：拷贝多长
         * 3.arraycopy:拷贝速度最快
         */
//
//        int[] arr = new int[array.length];
//        System.arraycopy(array,0,arr,0,array.length);
//        System.out.println(Arrays.toString(arr));

        //方法四：
        //数组名.clone()
        int[] arr  = array.clone();//克隆，产生需要克隆的对象的一个副本
        System.out.println(Arrays.toString(arr));
    }


}
