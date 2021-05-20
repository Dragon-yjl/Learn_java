package test520;

public class ArrayUtilTest {
    public static void main(String[] args) {

        ArrayUtil util = new ArrayUtil();
        int[] arr = new int[]{32,34,23,54,-645,-254,543,-56,999};

        int max = util.getMax(arr);
        System.out.println("最大值为："+max);

        int min = util.getMin(arr);
        System.out.println("最小值为："+min);

        int sum = util.getSum(arr);
        System.out.println("总和为："+sum);

        System.out.println("排序前");
        util.print(arr);

        System.out.println();
        System.out.println("排序后");
        util.sort(arr);
        util.print(arr);

        System.out.println("查找");
        int index = util.getIndex(arr,999);
        if(index >= 0){
            System.out.println("找到了，索引地址为："+index);
        }else{
            System.out.println("未找到");
        }
    }
}
