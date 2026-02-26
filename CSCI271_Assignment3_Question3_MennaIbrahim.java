/*************************************************************************
* Project 3 for CSCI 271-001 Spring 2026
*
* Author: Menna Ibrahim
* OS: Mac
* Compiler: javac 25.0.1
* Date: Feb 25, 2026
*
* Purpose
* This program reads a list of integers from the user and stores them 
* into an array A, then, the program will find the maximum integer in 
* A using a recursive function max().
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

public class CSCI271_Assignment3_Question3_MennaIbrahim {
    public static void main(String[] args) {
        //
        Scanner input = new Scanner(System.in);

        /****************************** Test Case ********************************/
        System.out.println("________________________________________________________");
        System.out.println();
        int[] T = {43, 34,23,56,78,95,5};
        System.out.println("Testing the array {43, 34, 23, 56, 78, 95, 5}: " + max(T, 6));
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

        int result = max(A, n);

        System.out.println("Max is " + result);
        //closing the input
        input.close();
    }


    /*****************************<max>****************************
    * Description: a recursion method that takes integers and store 
    * them into an array and finds the biggest number
    *
    * Parameters: array A and integer n
    *
    * Pre: gives the size of the array
    *
    * Post: it outputs the max number from the aray
    *
    * Returns: an integer
    *
    * Called by: main, itself
    * Calls: itself
    ************************************************************************/
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