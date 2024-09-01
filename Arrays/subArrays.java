package Arrays;

public class subArrays {
    public static void subArrays(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
    }
    public static void main(String[] args) {
         int arr[]={5,4,3,2,1};
         subArrays(arr);
    }
}
