package Arrays;


public class linearSearch{
    public static int linearSearch(int arr[], int key){

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]== key){
                return i;

            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        int key =6;
      int res = linearSearch(arr, key);
      if(res==-1)
      System.out.println("Element Not found");
   else System.out.println("index of Element is "+ res);
    }
}