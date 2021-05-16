package test516;

public class ArrayTest2 {
    public static void main(String[] args) {

        int [] arr = new int [9];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = (int) (Math.random() * 30) + 1;
            for (int j = 0; j < i; j++) {
            if(arr[i] == arr[j]){
                i--;
                break;
            }

            }

        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] +" ");

        }
    }
}
