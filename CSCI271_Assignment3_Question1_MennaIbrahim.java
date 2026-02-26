/*************************************************************************
* Project 3 for CSCI 271-001 Spring 2026
*
* Author: Menna Ibrahim
* OS: Mac
* Compiler: javac 25.0.1
* Date: Feb 25, 2026
*
* Purpose
* This program reads in a string S from the user and displays the length of S. 
*In doing so, the program will use a recursive function that takes S as an 
*argument and returns the number of characters in S recursively.
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

public class CSCI271_Assignment3_Question1_MennaIbrahim {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        /****************************** Test Case ********************************/
        System.out.println("________________________________________________________");
        System.out.println();
        System.out.println("Testing the word (example): " + sum("example"));
        System.out.println("________________________________________________________");
        /************************************************************************/

        System.out.println("Enter a string: ");
        String S = input.nextLine(); //input
        int result = sum(S);
        System.out.println("Sum = " + result);

        input.close();
    }

    /*****************************<sum>****************************
    * Description: a recursion method that displays the length of a string
    *
    * Parameters: string n
    *
    * Pre: must be a string 
    *
    * Post: adds the characters of a string
    *
    * Returns: an integer
    *
    * Called by: main, itself
    * Calls: itself
    ************************************************************************/
    public static int sum(String n) {  
        //base case      
        if (n.isEmpty()) {
            return 0;
        }

        //recursion
        return 1 + sum(n.substring(1));   

    }
}

//The running time of this function is O(n^2)