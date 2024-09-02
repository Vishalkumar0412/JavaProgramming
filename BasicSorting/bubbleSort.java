package BasicSorting;

public class bubbleSort {
    public static void sort(int arr[]){
            //outer -turn loop     
        for(int turn=0;turn<arr.length-1;turn++){
            // inner loop
            for(int j=0;j< (arr.length-1-turn);j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    
                }
            }
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
