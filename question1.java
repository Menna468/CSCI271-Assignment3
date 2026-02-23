import java.util.Scanner;

public class question1 {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String S = input.nextLine();
        int result = sum(S);
        System.out.println("Sum = " + result);

        input.close();
    }

    public static int sum(String n) {        
        if (n.isEmpty()) {
            return 0;
        }

        return 1 + sum(n.substring(1));   

    }
}

//The running time of this function is O(n^2)