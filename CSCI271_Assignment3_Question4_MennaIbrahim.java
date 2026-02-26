import java.util.Scanner;

public class CSCI271_Assignment3_Question4_MennaIbrahim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //askign for input
        System.out.println("Enter the long number and the one digit: ");
        //user input
        long N = input.nextLong();
        int D = input.nextInt();
        //calling recursion function
        int Answer = common(N, D);
        //printing out the answer
        System.out.println("Answer = " + Answer);
        //closing the input
        input.close();

    }

    public static int common(long n, int d) {
        //base case
        if (n == 0) {
            return 0;
        }

        //to take the last number of the long number
        long remainder = n % 10;

        //if the last number equals the small number then it adds one calls the function again
        if (remainder == d) {
            n /= 10;
            return 1 + common(n, d);
        }

        //if it doesn't match then it calls the function again
        else {
            n /= 10;
            return common(n, d);
        }

    }

}

//The running time of this function is O(log n)