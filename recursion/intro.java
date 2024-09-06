public class intro {
    // print number n to 1 thought recursion
    public static void print_n_to1(int n){
            if(n==1){
                System.out.print(n);
                return;
            }
            System.out.print(n+ " ");
            print_n_to1(n-1);
        }
        // find the factorial of number using recursion
        public static int fact(int n){
            if (n==0){// base case 
                return 1;
            }
           int  factvarNm1 =fact(n-1);
           int factvar =  n* factvarNm1;
            return factvar;
        }
    public static void main(String[] args) {
        // print_n_to1(250);
       System.out.println(fact(7));

    }
}
