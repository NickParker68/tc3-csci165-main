// Nick Parker CS2
// 2/2/20

//Question 7

//import scanner
import java.util.Scanner;

public class Initials{

    public static void main(String[] args) {

      String input;

      Scanner in = new Scanner(System.in);

      // name user input
      System.out.println("\nEnter your first and last name: ");
      input = in.nextLine();

      //find space in name
      int space = input.indexOf(" ");
      System.out.println(space);

      //find Initials
      char first = input.charAt(0);
      char last  = input.charAt(space + 1);

      // print initials
      System.out.println("\nThe first initial is " + first);
      System.out.println("\nThe last initial is " + last);

      //print unicode values
      System.out.println("\nThe unicode value for the first initial is: " + (int)first);
      System.out.println("\nThe unicode value for the last initial is: " + (int)last);

      //print sum of the unicode
      int sum = (int)first + (int)last;
      System.out.println("\nThe sum of the unicode numbers is: " + sum);

      //convert char into strings
      String strLast  = Character.toString(last);
      String strFirst = Character.toString(first);

      //print concatenated initials
      System.out.println("\nThe Initials are:");
      System.out.println(strFirst + strLast);




    //end of class
    }

// end of class
}
