package test527;
import java.util.Arrays;

public class QuickSort {



    public static void main(String[] args) {

        int[] arr = {4,32,7,8,9,36,68,3,45,875,14,4,90,78};

        System.out.println("排序前："+Arrays.toString(arr));

        Sort(arr,0,arr.length-1);

        System.out.println("排序后："+ Arrays.toString(arr));
    }


    private static void Sort(int[] arr,int left,int right){

        if(left>=right){
            return;//表示只有一个元素货没有元素时，直接返回
        }

        int low = left;
        int high = right;
        int key = arr[left];//用最左边的值作为基准值

        while(low<high){
            //high向左移，直到遇到比key小的值
            while(arr[high]>=key && low<high){
                high--;
            }
            arr[low] = arr[high];
            //把找到比key小的值赋给arr[low]

            //low向右移，直到遇到比key大的值
            while(arr[low]<=key && low<high){
                low++;
            }
            arr[high] = arr[low];
            //把找到的比key大的值赋给arr[high]
//
//            //low  high两个值交换
//            if(low<high){
//                int temp = arr[low];
//                arr[low] = arr[high];
//                arr[high] = temp;
//            }
        }

        arr[low] = key;
        Sort(arr,left,low);
        Sort(arr,low+1,right);

    }

}
