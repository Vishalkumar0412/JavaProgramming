package Arrays;

public class binnarySearch {
public static int searching(int arr[],int key){
    int start =0;
    int end = arr.length-1;
    while(start <= end){
        int mid = (start+end);
        if (arr[mid]== key){
            return mid;
        }
        else if(arr[mid]>key){
            end = mid-1;

        }
        else{
            start=mid+1;
        }
    }
   
return -1;

}
public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7,8,9,10};
    int key =10;
    int res=searching(arr, key);
    if(res==-1)
    System.out.println("Element not found");
    else
    System.out.println("Searching Element  is :"+res);
}
}g
