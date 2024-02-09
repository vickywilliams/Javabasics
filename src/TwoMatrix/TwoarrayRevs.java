package TwoMatrix;

public class TwoarrayRevs {
    public static void main(String[] args){
    
    int [][] arr1 = new int[5][3];
    int [][] arr= {{2,3,5},{8,3,2},{2,9,4},{7,9,2},{8,2,6}};
    arr1[0][0] = 2;
    arr1[0][1] = 3;
    arr1[0][2] = 5;
    arr1[1][0] = 8;
    arr1[1][1] = 3;
    arr1[1][2] = 2;
    arr1[2][0] = 2;
    arr1[2][1] = 9;
    arr1[2][2] = 4;
    arr1[3][0] = 7;
    arr1[3][1] = 9;
    arr1[3][2] = 2;
    arr1[4][0] = 8; arr1[4][1] = 2; arr1[4][2] = 6; 

    for (int i = arr.length-1; i>=0; i--) {
        int[] row = arr[i];
        for (int j = row.length-1; j>=0; j--) {
            System.out.print(" "+row[j]);
        }   
        System.out.println();
    }
    }
    public static void ColReverse(int[][] arr) {
        for (int i=0; i < arr.length; i++) {
            int[] row = arr[i];
            for (int j = row.length-1; j>=0; j--) {
                System.out.print(" "+row[j]);
            }   
            System.out.println();
        }  
        
    }
}
