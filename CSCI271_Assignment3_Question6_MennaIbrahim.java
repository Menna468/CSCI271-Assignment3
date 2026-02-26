import java.util.Scanner;

public class CSCI271_Assignment3_Question6_MennaIbrahim {
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

        int result = sumEven(A, n);

        System.out.println("The sum of even numbers = " + result);
        //closing the input
        input.close();
    }


    public static int sumEven(int[] A, int n) {
        if (n == 0) {
            return 0;
        }

        if (A[n - 1] % 2 == 0) {
            return A[n - 1] + sumEven(A, n - 1);
        }

        else {
            return sumEven(A, n - 1);
        }

    }


}


//T(n) = T(n - 1) + c 
//The running time of this function is O(n)