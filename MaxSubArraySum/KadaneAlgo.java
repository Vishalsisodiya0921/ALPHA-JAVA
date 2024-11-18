package MaxSubArraySum;

public class KadaneAlgo {
    public static void kadanes(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0;i < arr.length;i++){
            currSum += arr[i];

            // reset current sum if it becomes negative
            if(currSum < 0){
                currSum = 0;
            } 
            // if(currSum > maxSum){
            //     maxSum = currSum;
            // }
            //        Or
             maxSum = Math.max(currSum,maxSum);
        }
        System.out.println("our max subarray sum is = "+maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(arr);
    }
}
