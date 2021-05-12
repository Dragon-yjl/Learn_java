package yjl512;

public class ArrayTest1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        int[][] arr1 = new int[][]{{1,2,3},{4,5},{6,7,8}};
        String[][] arr2 = new String[3][2];
        String[][] arr3 = new String[3][];
        int[] arr4[] = new int[][]{{1,2,3},{4,5},{6,7,8}};
        int[] arr5[] = {{1,2,3},{4,5},{6,7,8}};
        System.out.println(arr1[0][1]);
        System.out.println(arr2[1][1]);
        arr3[1] = new String[3];
        System.out.println(arr3[1][1]);

        System.out.println(arr4.length);
        System.out.println(arr5.length);
        System.out.println(arr4[0].length);
        System.out.println(arr5[1].length);

        for (int i = 0; i <arr4.length ; i++) {
            for (int j = 0; j <arr4[i].length ; j++) {
                System.out.print(arr4[i][j]);
            }
            System.out.println();
        }

        int[][] arr6 = new int[4][3];
        System.out.println(arr6[0]);
        System.out.println(arr5[0]);
        System.out.println(arr6[0][0]);
    }
}
