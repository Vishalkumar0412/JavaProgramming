package BasicSorting;

public class selectionSort {
    public static void sort(int arr[]){
        //outer loop 
        
        for(int i=0;i<arr.length-1;i++){
            int minPos=i; 
            // inner loop
            for(int j=i+1;j<arr.length-1;j++){
            if(arr[minPos]<arr[j]) {
                minPos=j;
            }
        }   
        //swap
        int temp= arr[minPos];
        arr[minPos]=arr[i];
        arr[i]=temp;
    
    }
}
   public static void main(String[] args) {
    int arr[]={6,5,3,9,8,1};
    
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+"  ");
    }
    sort(arr);
    System.out.println();
    for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+"  ");
    }
    
   }
}
