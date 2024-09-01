package Arrays;

public class largestNumber {
    public static int largestNumbers(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++){
            if(largest < arr[i]){
            largest=arr[i];
            }
        }
       return largest; 
    }
    public static void main(String[] args) {
        int arr[]={6,5,5,9,8,1};
        int res = largestNumbers(arr);
        System.out.println("Largest Number will be "+res);
    }
}
