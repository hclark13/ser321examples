import java.io.*;
/**
 * Purpose: demonstrate simple Java Fraction class with command line,
 * jdb debugging, and Ant build file.
 *
 * Updated for SER321 Fall B Assignment 1: Change Fraction.main so it accepts 2 arguments
 *
 * @author Hayden Clark (hclark13)
 * @version October 2023
 */
public class Fraction {
 public static void main (String args[]) {
        int num = 0;
        int denom = 0;

	if (args.length == 2) {
       	    //int num = 0;
       	    //int denom = 0;
            try {
              num = Integer.parseInt(args[0]);
              denom = Integer.parseInt(args[1]);
            } catch (Exception e) {
              System.out.println("Arguments: " + args[0] + ", " + args[1] + " must be integers.");
              System.exit(1);
            }
            System.out.println(num + " / " + denom + " = " + num / denom);
        } else if (args.length == 1) {
	    //chek which arg is empty and fill with default value
	    

            System.out.println(num + " / " + denom + " = " + num / denom);
        } else { //no args, prints default values
		System.out.println(num + " / " + denom + " = " + num / denom);
        }
  }
}

