import java.util.Scanner;

public class question4 {
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

        long remainder = n % 10;

        if (remainder == d) {
            n /= 10;
            remainder = n;
            return 1 + common(n, d);
        }

        if (remainder != d) {
            n /=10;
            remainder = n;
            //return common(n, d);
        }

        return common(n, d);

    }

}