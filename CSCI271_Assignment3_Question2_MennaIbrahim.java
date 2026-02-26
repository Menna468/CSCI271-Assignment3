/*************************************************************************
* Project 3 for CSCI 271-001 Spring 2026
*
* Author: Menna Ibrahim
* OS: Mac
* Compiler: javac 25.0.1
* Date: Feb 25, 2026
*
* Purpose
* This program reads a string S and a single character C from the user 
* and displays the number of times C occurs in S. This program will use 
* a function that takes S and C as arguments and returns the number of 
* times C appears in S recursively.
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

public class CSCI271_Assignment3_Question2_MennaIbrahim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /****************************** Test Case ********************************/
        System.out.println("________________________________________________________");
        System.out.println();
        System.out.println("Testing the word (familiar) and (i): " + common("familiar", 'i'));
        System.out.println("________________________________________________________");
        /************************************************************************/

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

    /*****************************<common>****************************
    * Description: a recursion method that take a string and a character 
    * and counts how many times the character is in the string
    *
    * Parameters: string s and character c
    *
    * Pre: must be a string then a chracter
    *
    * Post: counts how many the character repeats in the string
    *
    * Returns: an integer
    *
    * Called by: main, itself
    * Calls: itself
    ************************************************************************/
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