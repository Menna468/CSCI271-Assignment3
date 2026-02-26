import java.util.Scanner;

public class CSCI271_Assignment3_Question2_MennaIbrahim {
    public static void main(String[] args) {
        //
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string and a character: ");
        //user input
        String S = input.nextLine();
        char C = input.next().charAt(0);
        //changing to uppercase
        S = S.toUpperCase();
        C = Character.toUpperCase(C);
        //calling the recursion function
        int result = common(S, C);
        //outputting the result
        System.out.println("Result = " + result);
        //closing the input
        input.close();
    }

    public static int common(String s, char c) {
        
        //base case
        if (s == "") {
            return 0;
        }

        char character = s.charAt(0);

        if (Character.compare(character, c) == 0) {
            return 1 + common(s.substring(1), c);
        }
        
        else {
            return common(s.substring(1), c);
        }

    }
}

//The running time of this function is O(n^2)