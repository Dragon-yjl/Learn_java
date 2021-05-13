package test513;

public class ArrayExer2 {
    public static void main(String[] args) {
        int[] array1,array2;

        array1 = new int[]{2,3,5,7,11,13,17,19};

        //显示array1的内容
        for (int i = 0; i < array1.length ; i++) {
            System.out.print(array1[i] + "\t");

        }

        //赋值array2等于array1
        //不能叫数组赋值相当于文件夹创建快捷方式，地址值是一样的
        //都指向了堆空间中唯一的数组的实体
        array2 = array1;
        //真正的数组复制
        //array2 = new int[array1.length];
        //for (int i = 0; i <array2.length ; i++) {
        //    array2[i] = array1[i];
        //}

        //修改array2的偶索引元素，使其等于索引值，
        // 如（array[0]=0,array[2]=2）
        for (int i = 0; i <array2.length ; i++) {
            if(i % 2==0){
                array2[i]=i;
            }

        }
        System.out.println();
        //打印array1
        for (int i = 0; i <array1.length ; i++) {
            System.out.print(array1[i] + "\t");

        }
    }
}
