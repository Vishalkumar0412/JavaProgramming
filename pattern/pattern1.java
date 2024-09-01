package pattern;

public class pattern1 {
    public static void holo_rectangle(int nRows , int nCols){
        //outter loop
        for(int i=1;i<=nRows;i++)
        {
            //inner 
            for(int j=1;j<=nCols;j++){
                if(i==1 || i==nRows || j==1 || j==nCols){
                    System.out.print("X");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        holo_rectangle(6,15);
    }
}
