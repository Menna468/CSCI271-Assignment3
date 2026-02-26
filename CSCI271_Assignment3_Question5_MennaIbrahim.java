import java.util.Scanner;

public class CSCI271_Assignment3_Question5_MennaIbrahim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String S = input.nextLine();

        String backwards = backward(S);
        System.out.println("Thw word in backwards: " + backwards);

        input.close();
    }

    public static String backward(String s) {
        //base case
        if (s.length() == 0) {
            return "";
        }

        //recursive
        return backward(s.substring(1)) + s.charAt(0);
    }
}

//T(n) = T(n − 1) + O(n)
//The running time for this function is O(n^2)