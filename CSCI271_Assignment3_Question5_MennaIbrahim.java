/*************************************************************************
* Project 3 for CSCI 271-001 Spring 2026
*
* Author: Menna Ibrahim
* OS: Mac
* Compiler: javac 25.0.1
* Date: Feb 25, 2026
*
* Purpose
* This program reads in a string S from the user and displays it backwards. 
* The program must use a recursive function that takes S as an argument and 
* returns S’ as S but backwards.
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

public class CSCI271_Assignment3_Question5_MennaIbrahim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /****************************** Test Case ********************************/
        System.out.println("_______________________________________________");
        System.out.println("Testing the word (backwards): " + backward("backwards"));
        System.out.println("_______________________________________________");
        /************************************************************************/


        System.out.println("Enter a word: ");
        String S = input.nextLine(); //input

        String backwards = backward(S);
        System.out.println("Thw word in backwards: " + backwards);

        input.close();
    }

    /*****************************<backward>****************************
    * Description: a recursion method that takes a string and prints it out backwards
    *
    * Parameters: string s
    *
    * Pre: must be a string
    *
    * Post: prints out the string but in backwards
    *
    * Returns: a string
    *
    * Called by: main, itself
    * Calls: itself
    ************************************************************************/
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