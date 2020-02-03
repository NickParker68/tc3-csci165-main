// Nick Parker, CSCI165
// 2/1/20

// import appropriate modules
import java.util.Scanner;

public class Primitives{

    public static void main(String[] args) {

// Question 1

        // define and initialize byte
        byte b = 100;
        System.out.println();
        System.out.printf("%d", b);

        // define and initialize short
        short s = 32743;
        System.out.println();
        System.out.printf("%8d", s);

        // define and initialize int
        int i = 4000;
        System.out.println();
        System.out.printf("%06d", i);

        // define and initialize long
        long l = 2341233412341234L;
        System.out.println();
        System.out.printf("%d", l);

        // define and initialize float
        float f = 5E-2F;
        System.out.println();
        System.out.printf("%8f", f);

        // define and initialize double
        double d = 12.3454;
        System.out.println();
        System.out.printf("%6f", d);

        // define and initialize boolean
        boolean bool = true;
        System.out.println();
        System.out.println(bool);

        // define and initialize char
        char char1 = 'A';
        char char2 = 65;
        System.out.println();
        System.out.println("The Value of char1 is: " + char1);
        System.out.println("The value of char2 is: " + char2);

// Question 2

        int input;

        Scanner in = new Scanner(System.in);

        // request user input
        System.out.println("\n\nEnter an integer:");
        input = in.nextInt();
        System.out.println("\nYou Entered " + input);

        // square, cube, and 4th power Integer
        double square = Math.pow(input, 2);
        double cube   = Math.pow(input, 3);
        double fourth = Math.pow(input, 4);

        // print statments
        System.out.println("\nThe square of the integer is " + square);
        System.out.println("\nThe cube of the inetger is " + cube);
        System.out.println("\nThe integer raised to the fourth power is " + fourth);

// Question 3

        // assigning variables to min and max integer values
        int smallest = Integer.MAX_VALUE;
        int largest  = Integer.MIN_VALUE;

        // print values
        System.out.println("\nThe smallest value of an integer is " + smallest);
        System.out.println("\n The largest value of an integer is" + largest);

        // compareUnsigned
        System.out.println("\n" + Integer.compareUnsigned(smallest, largest));
        System.out.println("the value of -1 means that the smallest integer value is less than the largest value.");

        // compare
        System.out.println("\n" + Integer.compare(smallest, largest));
        System.out.println("The 1 means that the largest integer value is bigger than the lowest integer value");

// Question 4 skipped because of reasons mentioned in discord

// Question 5

        // user input as Integer
        int input2;
        int input3;

        System.out.println("\n\nEnter an integer for the dividend: ");
        input2 = in.nextInt();
        System.out.println("\nEnter an integer for the divisor: ");
        input3 = in.nextInt();

        // calculate remainder and modulo divsion
        double remainder = input2 % input3;
        double modulo    = input2 / input3;

        // print statements
        System.out.println("\n\nThe remainder is: ");
        System.out.printf("%f", Math.floor(remainder));
        System.out.println("\nThe modulo divsion results in: ");
        System.out.printf("%f", Math.floor(modulo));

  // end of main
  }

// end of class
}

// question 1
