package MaxSubArraySum;

public class PrefixSum {
    public static void maxsubArraySum(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int [arr.length];
        prefix[0] = arr[0];
        //prefix claculation
        for(int i=1;i<arr.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        // brute force approach to find max subarray sum
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i;j<arr.length;j++){
        //         int currSum = 0;
        //         for(int k=i;k<=j;k++){
        //             currSum += arr[k];
        //         }
        //         System.out.println(currSum);
        //         if(currSum > maxSum){
        //             maxSum = currSum;
        //         }
        //     }
        // }
        // using prefix sum approach to find max subarray sum
       
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=0;j<arr.length;j++){
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                 
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum ="+maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2};
        maxsubArraySum(arr);
    }
}
