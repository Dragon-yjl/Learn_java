package test513;

public class ArrayTest1 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = (int)(Math.random()*(99-10+1)+10);

        }
        //遍历数组
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        //求数组元素最大值
        int maxVaule = arr[0];//保险起见不能写0，负数数组就不能写0
        for (int i = 1; i <arr.length ; i++) {
            if(maxVaule < arr[i]){
                maxVaule = arr[i];
            }

        }
        System.out.println("最大值为: "+ maxVaule);

        //最小值
        int minVaule = arr[0];//保险起见不能写0，负数数组就不能写0
        for (int i = 1; i <arr.length ; i++) {
            if(minVaule > arr[i]){
                minVaule = arr[i];
            }

        }
        System.out.println("最小值为: "+ minVaule);
        //求数组元素总和
        int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            sum += arr[i];

        }
        System.out.println("总和为: " + sum );
        //求数组元素平均值
        int avgValue = 0;
        avgValue= sum / arr.length;
        System.out.println("平均数为: " + avgValue);

    }
}
