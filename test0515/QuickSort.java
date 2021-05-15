package test0515;

public class QuickSort {

    public int Partition(int[] a,int low,int high) {

        //选取基准元素
        int pivot = a[low];
        while(low<high){
            while(low<high&&a[high] >= pivot)--high;
            //先从右往左，找到第一个比基准元素小的，将该元素填入左哨兵的位置
            a[low]=a[high];
            while(low < high && a[low] <= pivot)++low;
            //先从左往右，找到第一个比基准元素大的，将该元素填入右哨兵的位置
            a[high] = a[low];
            //右哨兵继续走，直到遇见左哨兵，循环结束

        }
        a[low] = pivot;
        //将基准元素放到相遇的位置
        return  low;
    }

    public void QuickSort(int[] a,int low , int high){
        if(low < high){
            int pivotpos = Partition(a, low, high);
            QuickSort(a, low, pivotpos - 1);
            QuickSort(a, pivotpos + 1,high);
        }
    }

    public static void main(String[] args) {
        int[] a = {2,1,3,5,7,6,4,9,8};
        QuickSort quickSort = new QuickSort();
        quickSort.QuickSort(a,0,8);

        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+ " ");

        }
    }

}
