// Nick Parker
// CS2, 2/3/20
// week 2 lab

// imports
import java.util.ArrayList;
import java.util.Arrays;
import java.io.File; // import java.io.File
import java.util.Scanner; // import java scanner tool
import java.io.FileNotFoundException;
import java.io.FileWriter; // import file writer tool
import java.io.IOException;
import java.time.LocalDateTime; // import for date and time purposes
import java.time.format.DateTimeFormatter; // import for date and time purposes
import java.math.RoundingMode; // in order to round
import java.text.DecimalFormat; // in order to round

public class FoodTruck{
    // formatting rounding to 2 decimals
    private static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

// commented out code of files I created using filewriter for testing purposes

      // try/catch for scanning file
//      try {
        // create menu file
//        FileWriter filewriter = new FileWriter("menu.txt");

        // write to file
//        filewriter.write("Chicken Shwarma Pita");
//        filewriter.write("\nFreedom Fries");
//        filewriter.write("\nFermented Shark Juice");

        // close filewriter
//        filewriter.close();

        // end try
//          }
//        catch(IOException e){
//          System.out.println("There was a problem writing to the file.");
        // end catch
//        }


//      try{
        // create prices file
//        FileWriter filewriter = new FileWriter("prices.txt");

        // write to file
//        filewriter.write("3.99");
//        filewriter.write("\n2.99");
//        filewriter.write("\n2.50");

        // close filewriter
//        filewriter.close();

        //end try
//        }
//      catch(IOException e){
//        System.out.println("There was a problem writing to the file.");
      // end catch
//        }
     // try/catch for scanning file

      try{
        // create instance for refernce to file name/path
        File menu   = new File("menu.txt");
        File prices = new File("prices.txt");

        Scanner menuScanner  = new Scanner(menu);
        Scanner priceScanner = new Scanner(prices);



        String menuArray[] = new String[3];
        double priceArray[] = new double[3];

        // initialize counter
        int counter = 0;

        while(counter < 3){
            // scan through menu file and add to array
            menuArray[counter] = menuScanner.nextLine();

            //add to counter
            counter ++;

        } // end of while loop
        menuScanner.close();

        // initialize second counter
        int counter2 = 0;

        while(counter2 < 3){
            // scan through price file and add to array
            priceArray[counter2] = priceScanner.nextDouble();

            //add to counter
            counter2 ++;

        } // end of while loop
        priceScanner.close();

        //input Scanner
        Scanner input = new Scanner(System.in);

        // console print
        System.out.println("\n\nWelcome to Nick's Food Stuff");

        // user input object
        System.out.print("\nEnter Name: ");
        String name = input.nextLine();

        //print console output
        System.out.println("\nEnter the quantity of each item");
        System.out.println("------------------------------");

        // amount1 input
        double amount1;
        System.out.print(menuArray[0] + " - $");
        System.out.printf("%4.2f", priceArray[0]);
        System.out.print(": ");
        amount1 = input.nextDouble();

        // amount2 input
        double amount2;
        System.out.print(menuArray[1] + " - $");
        System.out.printf("%4.2f", priceArray[1]);
        System.out.print(": ");
        amount2 = input.nextDouble();

        // amount3 input
        double amount3;
        System.out.print(menuArray[2] + " - $");
        System.out.printf("%4.2f", priceArray[2]);
        System.out.print(": ");
        amount3 = input.nextDouble();

        // Date time formatting
        // create formatter
        DateTimeFormatter date = DateTimeFormatter.ofPattern("MM/dd/yyyy 'at' hh:mm:ss a");
        //Local date instance
        LocalDateTime localDateTime = LocalDateTime.now();
        // Get formatted string
        String ldtString = date.format(localDateTime);

        // Math portion
        // initialize totals
        double am1Total = priceArray[0] * amount1;
        double am2Total = priceArray[1] * amount2;
        double am3Total = priceArray[2] * amount3;
        double taxPer   = .0625;

        //add items to subTotal
        double subTotal = am1Total + am2Total + am3Total;

        //calculate tax
        double tax = subTotal * taxPer;

        //add tax to subTotal
        double Total = subTotal + tax;

        //invoice number
        // find space in Name
        int space = name.indexOf(" ");
        // find initials
        char first1 = name.charAt(0);
        char first2 = name.charAt(1);
        char last1  = name.charAt(space + 1);
        char last2  = name.charAt(space + 2);
        // convert to upper case
        char cap1 = Character.toUpperCase(first1);
        char cap2 = Character.toUpperCase(first2);
        char cap3 = Character.toUpperCase(last1);
        char cap4 = Character.toUpperCase(last2);
        // add initials
        String initials = Character.toString(cap1) + Character.toString(cap2) + Character.toString(cap3) + Character.toString(cap4);

        //invoice id
        int unicode1 = (int)cap1;
        int unicode2 = (int)cap3;
        //add unicode values
        int unicodeSum = unicode1 + unicode2;
        //multiply by length of full name
        int length = name.length();
        int unicodeProduct = unicodeSum * length;
        String unicodeStr = Integer.toString(unicodeProduct);
        // add unicodeProduct to date and time
        char addDate1 = ldtString.charAt(0);
        char addDate2 = ldtString.charAt(1);
        char addDate3 = ldtString.charAt(3);
        char addDate4 = ldtString.charAt(4);
        char addTime1 = ldtString.charAt(14);
        char addTime2 = ldtString.charAt(15);
        char addTime3 = ldtString.charAt(17);
        char addTime4 = ldtString.charAt(18);
        //convert to strings
        String strDate1 = Character.toString(addDate1);
        String strDate2 = Character.toString(addDate2);
        String strDate3 = Character.toString(addDate3);
        String strDate4 = Character.toString(addDate4);
        //add strDates
        String IDdates = strDate1 + strDate2 + strDate3 + strDate4;
        // find chars for time
        String strTime1 = Character.toString(addTime1);
        String strTime2 = Character.toString(addTime2);
        String strTime3 = Character.toString(addTime3);
        String strTime4 = Character.toString(addTime4);
        // add strTimes
        String IDtimes = strTime1 + strTime2 + strTime3 + strTime4;
        // finish unicode
        String invoiceID = initials + unicodeStr + IDdates + IDtimes;


        //print final console reciept
        System.out.println("\n");
        System.out.printf("%-30s", "Invoice Number:");
        System.out.printf("%30s", invoiceID);
        System.out.println();
        System.out.printf("%-30s", "Date and Time:");
        System.out.printf("%30s", ldtString);
        System.out.println();
        System.out.println();
        System.out.printf("%-30s", "Item");
        System.out.printf("%10s", "Quantity");
        System.out.printf("%10s", "Price");
        System.out.printf("%10s", "Total");
        System.out.println("\n================================================================");
        System.out.println();
        // print amount for menu item 1
        System.out.printf("%-30s", menuArray[0]);
        System.out.printf("%10s", amount1);
        System.out.printf("%10s", "$" + df.format(priceArray[0]));
        System.out.printf("%10s", "$" + df.format(am1Total));
        // print amount for menu item 2
        System.out.println();
        System.out.printf("%-30s", menuArray[1]);
        System.out.printf("%10s", amount2);
        System.out.printf("%10s", "$" + df.format(priceArray[1]));
        System.out.printf("%10s", "$" + df.format(am2Total));
        // print amount for menu item 3
        System.out.println();
        System.out.printf("%-30s", menuArray[2]);
        System.out.printf("%10s", amount3);
        System.out.printf("%10s", "$" + df.format(priceArray[2]));
        System.out.printf("%10s", "$" + df.format(am3Total));
        // print subTotal
        System.out.println("\n================================================================");
        System.out.printf("%-30s", "Subtotal");
        System.out.printf("%30s", "$" + df.format(subTotal));
        // print sales tax
        System.out.println();
        System.out.printf("%-30s", "6.25% sales tax");
        System.out.printf("%30s", "$" + df.format(tax));
        // print total
        System.out.println();
        System.out.printf("%-30s", "Total");
        System.out.printf("%30s", "$" + df.format(Total));

        //writing reciept to file
        FileWriter recieptWriter = new FileWriter(invoiceID + ".txt");

// commented out seciton of code of loop I tried to create to read the code
// from the console and write it to the file. The file is still created
// with the correct name


        //while loop to read from console
        // initialize counter3
//        int counter3 = 1;
//        while(counter < 27){

//          String Line = System.console().readLine(counter3);

//          recieptWriter.write(Line);
          //add to counter
//          counter3 ++;

//        } // end while loop
        recieptWriter.close();


      } //end try
      catch(IOException e){
        System.out.println("There was a problem reading the file.");
      } // end catch


    } //end main

} // end class
