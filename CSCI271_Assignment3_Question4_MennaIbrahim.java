/*************************************************************************
* Project 3 for CSCI 271-001 Spring 2026
*
* Author: Menna Ibrahim
* OS: Mac
* Compiler: javac 25.0.1
* Date: Feb 25, 2026
*
* Purpose
* This program reads in an integer N and a single digit D from 
* the user and displays the number of times D occurs in N. The 
* program will use a recursive function that takes N and D
* as arguments and returns the number of times D appears in N recursively.
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

public class CSCI271_Assignment3_Question4_MennaIbrahim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /****************************** Test Case ********************************/
        System.out.println("_______________________________________________");
        System.out.println("Testing the numbers (422327262) and (2): " + common(422327262, 2));
        System.out.println("_______________________________________________");
        /************************************************************************/

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

    /*****************************<common>****************************
    * Description: a recursion method that takes a long number and a single digit 
    * and counts how many times the digit is in the long number
    *
    * Parameters: long n and int d
    *
    * Pre: must be a long number then a single digit
    *
    * Post: counts how many the digit repeats in the long number
    *
    * Returns: an integer
    *
    * Called by: main, itself
    * Calls: itself
    ************************************************************************/
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