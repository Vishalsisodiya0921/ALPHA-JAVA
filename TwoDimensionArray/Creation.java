package TwoDimensionArray;

import java.util.Scanner;
public class Creation {
    public static boolean seach(int[][]matrix,int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(matrix[i][j] == key){
                    System.out.println("Found at cell ("+ i +","+ j+")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String[] args){
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;

        try (Scanner sc = new Scanner(System.in)) {
            for(int i=0; i<n ;i++){
                for(int j=0;j<m;j++){
                    matrix[i][j] = sc.nextInt();
                }
            }
        }
        //output
        for(int i=0; i<n ;i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        seach(matrix, 9);
    }
}
