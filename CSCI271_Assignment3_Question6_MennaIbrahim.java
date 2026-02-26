/*************************************************************************
* Project 3 for CSCI 271-001 Spring 2026
*
* Author: Menna Ibrahim
* OS: Mac
* Compiler: javac 25.0.1
* Date: Feb 25, 2026
*
* Purpose
* This program reads a list of integers from the keyboard and 
* stores them into an array A, then, the program will return the 
* sum of all even integers in A using a recursive function sumEven(). 
* The program will then print the resulting sum to the screen. 
* In doing so, the function must be recursive and should not print 
* anything to the screen, the main program will.
*
*************************************************************************/

/*******************************************************************
* I declare and confirm the following:
* - I have not discussed this program code with anyone other than my
* instructor or the teaching assistants assigned to this course.
* - I have not used programming code obtained from someone else,
* or any unauthorised sources, including the Internet, either
* modified or unmodified.
* - If any source code or documentation used in my program was
* obtained from other sources, like a text book or course notes,
* I have clearly indicated that with a proper citation in the
* comments of my program.
* - I have not designed this program in such a way as to defeat or
* interfere with the normal operation of the supplied grading code.
*
* Menna Ibrahim
********************************************************************/

import java.util.Scanner;

public class CSCI271_Assignment3_Question6_MennaIbrahim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /****************************** Test Case ********************************/
        System.out.println("________________________________________________________");
        System.out.println();
        int[] T = {55, 32, 3, 2, 50 ,49, 19};
        System.out.println("Testing the array {55, 32, 3, 2, 50, 49, 19}: " + sumEven(T, 7));
        System.out.println("________________________________________________________");
        /************************************************************************/

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

    /*****************************<sumEven>****************************
    * Description: a recursion method that takes numbers and stores it 
    * into an array then takes all the even numbers and adds them
    *
    * Parameters: array A and int n for the size
    *
    * Pre: must give the size n first
    *
    * Post: prints out the sum of even integers
    *
    * Returns: an integer
    *
    * Called by: main, itself
    * Calls: itself
    ************************************************************************/

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