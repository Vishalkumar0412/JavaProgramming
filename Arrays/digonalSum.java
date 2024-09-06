import java.util.*;

public class digonalSum {
    public static void main(String[] args) {

        int[][] arr = { { 1, 2, 3, 4 },
                { 5, 6, 7, 3 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 13 } };
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        // sout array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j || i + j == arr.length-1) {
                    sum += arr[i][j];

                }
               

            }
        }
        System.out.println(sum);
    }
}