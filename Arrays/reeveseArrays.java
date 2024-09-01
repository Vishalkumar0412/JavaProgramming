package Arrays;

public class reeveseArrays {
    public static void reverseArray(int arr[]){
     int start=0 , end =  arr.length-1;
     while(start < end)
     {
        int temp = arr[end];
        arr[end]=arr[start];
        arr[start]=temp;
        start++;
        end--;
     }

    }
    public static void main(String[] args) {
        int arr[]={6,5,5,9,8,1};
        System.out.println("Orginal array ");
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+"  ");
        }
        reverseArray(arr);
        System.out.println("\n Reversed array ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
    }
}
