// Nick Parker
// CS2 week 3 HW

// importing
import java.util.ArrayList;
import java.util.Arrays;
import java.io.File; // import java.io.File
import java.util.Scanner; // import java scanner tool
import java.io.FileNotFoundException;
import java.io.FileWriter; // import file writer tool
import java.io.IOException;

public class numbers{

    public static void main(String[] args){

      try{

        // create array
        String[] code = {"*", "B", "E", "A", "@", "F", "K", "%", "R", "M"};

        // ask or user input
        // input scanner
        Scanner input = new Scanner(System.in);

        System.out.print("\n\nEnter a sequence of base 10 numbers: ");
        String string = input.nextLine();

        // create number.txt file
        FileWriter filewriter = new FileWriter("numbers.txt");


        // creating space
        System.out.println();

        // print statement
        System.out.print("You message translated into KenSpeak is: ");

        for(int x = 0; x < string.length(); x++) {

          //write to file
          filewriter.write(string.charAt(x) + "\n");
          //convert string to int
          int i = Character.getNumericValue(string.charAt(x));
          // printing encoded string to terminal
          System.out.print(code[i]);

        } // end of for loop
        //close filewriter
        filewriter.close();

        //create instace for file
        File numbers = new File("numbers.txt");
        // create scanner
        Scanner numberScanner = new Scanner(numbers);

        // File writer for encodedNumbers file
        FileWriter codeWriter = new FileWriter("encodedNumbers.txt");

        // loop to write to file
        int counter = 0;

        while(numberScanner.hasNextLine()){

          // creating variables for one line and converting to int
          String line = numberScanner.nextLine();
          int number  = Integer.parseInt(line);
          // writing code to file
          codeWriter.write(code[number]);


        } // end of while loop
        codeWriter.close();
        numberScanner.close();

      } // end of try
      catch(IOException e){
        System.out.println("There was a problem writing the file.");
      } // end catch

    } // end of main

} // end of class
