package test516;

public class ArrayTest1 {
    public static void main(String[] args) {

        int [] arr = new int [9];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = (int) (Math.random() * (30 - 1 + 1 ) + 1);
            boolean flag = false;

            while(true){
                for (int j = 0; j < i  ; j++) {
                    if(arr[i] == arr[j]){
                        flag = true;
                        break;
                    }

                }
                if(flag) {
                    arr[i] = (int) (Math.random() * 30) + 1;
                    flag = false;
                    continue;
                }
                break;
            }

        }

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
