package TwoDimensionArray;

public class DiagonalSum {
    public static int diagonalSum(int matrix[][]){// O(n^2)

        int sum = 0;
        int n = matrix.length;

        // for(int i=0; i<n; i++){
        //     for(int j=0; j<n; j++){
        //         if(i ==j){
        //             sum += matrix[i][i];
        //         }
        //         else if(i+j == n-1){
        //             sum += matrix[i][j];
        //         }
        //     }
        // }
        for(int i=0;i<n;i++){ // O(n)
            //pd
            sum += matrix[i][i];
            //sd
            if(i != n-1-i){
                sum += matrix[i][n-1-i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
        {5, 6, 7, 8},
        {9,10,11,12},
        {13,14,15,16}};
        System.out.println("Sum of diagonal elements: "+diagonalSum(matrix));
    }
}
