package test513;

public class ArrayTest3 {
    public static void main(String[] args) {

        String[] arr = new String[]{"JJ","DD","MM","GG","AA","BB"};

        //数组复制
        String[] arr1 = new String[arr.length];
        for (int i = 0; i <arr1.length ; i++) {
            arr1[i] = arr[i];
        }

        //数组反转
        //方法一
        for (int i = 0; i <arr.length/2 ; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i -1] = temp;
        }
        //方法二
        //for (int i = 0, j = arr.length - 1;i < j; i++,j--) {
        //    String temp = arr[i];
        //    arr[i] = arr[j];
        //    arr[j] = temp;
        //}

        //遍历
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + "\t");

        }
        System.out.println();
        //查找
        //线性查找
        String dest ="BB";
        dest = "DD";
        dest = "ss";

        boolean isFlag = true;

        for (int i = 0; i <arr.length ; i++) {

            if(dest.equals(arr[i])){
                System.out.println("找到了指定的元素，位置为:"+ i);
                isFlag = false;
                break;
            }
        }
        if(isFlag){
            System.out.println("很遗憾没有找到");
        }

        //二分查找，前提所要查找的·数组必须有序

        int[] arr2 = new int[]{-98,-34,-11,9,12,14,34,45,56,78,89,789,890};

        int dest1 = 890;
        int head = 0;
        int end = arr2.length - 1;
        boolean isFlag1 = true;
        while(head <= end){

            int middle = (head + end)/2;
            if(dest1 == arr2[middle]){
                System.out.println("找到了，位置是:" + middle);
                isFlag1 = false;
                break;
            }else if(arr2[middle] > dest1){
                end = middle - 1;
            }else{
                head = middle + 1;
            }
        }
        if(isFlag1){
            System.out.println("很遗憾没有找到");
        }
    }
}
