//Programmer: Marissa Gonçalves
//Date: October 2, 2017
//Purpose: This program allows to prompt for an integer, computes, then finally display several properties.

import java.util.Scanner;

public class IntegerFactsProject

{
    
    	   public static void main (String[]args)

    {
                //define a scanner
		Scanner keyboard = new Scanner (System.in);

                
                
                //print out the purpose of the program
                System.out.println ("This program will:");
                System.out.println ("1) prompt you for an integer and then");
                System.out.println ("2) list several facts about that integer.");
                System.out.println ();
                
                
                
                
                //prompt the user to enter an integer as a string of characters
		System.out.print ("Enter an integer: ");
               
                
                //peek at the error that can occur
                if (!keyboard.hasNextLong())
                {
                   System.out.println ("Error: the input is not an integer.");
                   System.out.println ("Try again later.");
                   System.exit(1);
                }
                
               
                //read the input as a string
                String stringInteger = keyboard.nextLine();
               
                
              
                 
                 
                //print out the input
                System.out.println ("A list of several facts about the number " + stringInteger);
                
                
                    
                //allow the variables to be recognized before the following loops are being executed 
                int digit = 0;
                int evenCounter = 0;
                int oddCounter = 0;
                int zeroCounter = 0;
                int count = 0;
                long remainder = 0;
                long sum = 0;
                long reverse = 0;
                long product = 1;
                
                
                //print the amount of equal signs for the fixed statement and the inputted integer by using a loop
                for (digit = 0; digit < "A list of several facts about the number ".length() + stringInteger.length(); digit++)   
                {   
                   System.out.print ("=");
                }
                
                
                
                
                //skip a line
                System.out.println();
              
                
                
                
                //read each of the digits as characters by using a loop
                System.out.print ("a) digits in it are: ");
                
                
                //allow each digit to be read and printed, and classified as odd, even or a zero based on the user's input
                for (digit = 0; digit < stringInteger.length(); digit++)     
                {  
                    
                    //convert each character to its numerical value
                    char ch = stringInteger.charAt(digit);
                    int d = Character.getNumericValue(ch);
                    
                    
                    if (d % 2 != 0)
                    {
                        ++oddCounter;
                    } 
                    
                    else
                    {
                        ++evenCounter;
                    }
                  
                     if (d == 0)
                    {
                        ++zeroCounter;
                    } 
                    
                    
                   System.out.print (stringInteger.charAt(digit) + " ");
                   
                }
                
                
                
                //skip a line
                System.out.println();
            
               
                
              
                //allow the input to be converted from a string to a long varaible using parse method
                long integerLong = Long.parseLong (stringInteger);
                
                
                
                
                //determine whether the input is negative or positive and print the statement
                if (integerLong < 0)
                {   
                    System.out.println ("b) it is negative");
                }
                else
                {
                    System.out.println ("b) it is positive");
                }
                
                
                
                
                //determine whether the input is even or odd and print the statement
                if (integerLong % 2 == 0)
                {
                    System.out.println ("c) it is even");
                }
                else
                {
                    System.out.println ("c) it is odd");
                }
                
                
                
                
                //calculate the number of digits, sum, product and the reverse the input consists
                do
                {
                   count += 1;
                    
                   remainder = integerLong % 10;
                   
                   sum += remainder;
                   product *= remainder;
                   
                   reverse *= 10;
                   reverse += (integerLong % 10);
                   
                   integerLong /= 10;  
                }
                while (integerLong != 0);
               
                
                
                //print out the information based on the calcuated results found in the previous loops
                System.out.println ("d) it has " + count + " digits");
                System.out.println ("e) it has " + oddCounter + " odd digits");
                System.out.println ("f) it has " + evenCounter + " even digits");
                System.out.println ("g) it has " + zeroCounter + " zero digits");
                System.out.println ("h) sum of digits in it is " + sum);
                System.out.println ("i) product of digits in it is " + product); 
                   
  
                
                
                //mention two conditions to determine whether the initial number is larger or smaller than its reverse
                if (integerLong > reverse)
                {
                   System.out.println ("j) it is larger than its reverse " + reverse);
                }
                else
                {
                   System.out.println ("j) it is smaller than its reverse " + reverse);
                }
         
                
                
                
                
                //print the amount of equal signs for the fixed statement and the inputted integer by using a loop
                for (digit = 0; digit < "A list of several facts about the number ".length() + stringInteger.length(); digit++)   
                {   
                   System.out.print ("=");
                }
                
                
                
                //skip a line
                System.out.println ();
            
                
    }
}
    
    
