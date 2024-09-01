package Arrays;

public class findPairsArray {
    public static void pairs(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print(" ("+arr[i]+","+ arr[j]+") ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2};
        pairs(arr);
    }
}
