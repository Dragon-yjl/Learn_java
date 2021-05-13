package test513;
import java.util.ArrayList;
import java.util.Arrays;

public class Practice1{
    private ArrayList<Integer> arrayList;


    public  Practice1(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }


    /**
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Practice1 t = new  Practice1(arrayList);
        t.addElement(4);
        t.addElement(2);
        t.addElement(1);
        t.addElement(3);
        t.addElement(7);
        t.addElement(6);
        t.addElement(5);
        System.out.println("最大值是："+t.maxi());
        System.out.println("中间值是："+t.middlei());
        System.out.println("最小值是："+t.mini());
    }

    public int length(){
        return arrayList.size();
    }


    public void addElement(int element){
        arrayList.add(element);
    }


    public int maxi(){
        int max = arrayList.get(0);
        for(int i = 1; i < arrayList.size();i++){
            if (max < arrayList.get(i)) {
                max = arrayList.get(i);
            }
        }
        return max;
    }

    public int mini(){
        int min = arrayList.get(0);
        for (int i = 1; i < arrayList.size(); i++) {
            if (min > arrayList.get(i)) {
                min = arrayList.get(i);
            }
        }
        return min;
    }

    public int middlei(){
        int middle = 0;
        int size = length();
        Integer[] i = arrayList.toArray(new Integer[size]);
        Arrays.sort(i);
        return i[size/2];
    }
}
