import java.util.Scanner;

public class CSCI271_Assignment3_Question3_MennaIbrahim {
    public static void main(String[] args) {
        //
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");

        //user input
        int n = input.nextInt();

        //makes new array
        int[] A = new int[n];

        
        System.out.println("Enter " + n + " numbers: ");

        for (int i = 0; i < n; i++) {
            A[i] = input.nextInt();
        }

        int result = max(A, n);

        System.out.println("Max is " + result);
        //closing the input
        input.close();
    }


    public static int max(int[] A, int n) {
        if (n == 1) {
            return A[0];
        }

        int m = max(A, n - 1);

        if (A[n - 1] > m) {
            return A[n - 1];
        }

        else {
            return m;
        }

    }


}


//T(n) = T(n - 1) + c 
//The running time of this function is O(n)