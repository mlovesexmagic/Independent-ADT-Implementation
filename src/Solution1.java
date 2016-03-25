// ************************************************************************************************************
// Lab 2			Authors: Zhipeng Mei, Vince Garcia, Johnson Mei
// Class: CS 111C		Date:	 3/9/16
// Solution1 is the driver program.  Data is passed to this class so that it can perform operations
// This class is independent of the ADT implementation.
// Objects aList is instantiated to hold user input data and comparison.
// The user is prompted to enter a list of integers.  The values are read as strings for continious input & then passed into a StringTokenizer.
// The Integer.parseInt method is used to send the values as integers into the variable newInput.  The integers are then
// added into aList.  
// Values are passed to the isInAscendingOrder method in ComparableListArrayBased so they can be compared.
// The aList is cleared at the end of the loop so that new values can be inserted and compared appropriately
// ************************************************************************************************************
// Precondition: User inputs a number, series of numbers, or a blank line
// Postcondition: The input is sent to to the list for comparison within InAscendingOrder
import java.util.Scanner;
import java.util.StringTokenizer;
public class Solution1 
{
    static Scanner in = new Scanner(System.in);
    public static void main(String args[]) {
        int number;

        String proceed;     
        ComparableListArrayBased aList = new ComparableListArrayBased();
   
        boolean done = false;
        while(!done){

            //prompt user input
            System.out.print("Input a list of integers: ");  
            String userInput;
            userInput = in.nextLine();

            //token method to split the string 
            StringTokenizer st = new StringTokenizer(userInput);

            //get the total count of current tokens
            int stSize = st.countTokens();
            
            // storing user's input into aList 
            while (st.hasMoreTokens()) {
                for(int i=0; i<stSize; i++){
                    int newInput = Integer.parseInt(st.nextToken());
                    aList.add(i,newInput);
                }
            }   

            //calling the isInAscendingOrder method from ComparableListArrayBased
            aList.isInAscendingOrder1(aList);

           System.out.print("Do you want to continue (y/n): ");
           proceed = in.nextLine();
            if (proceed.charAt(0) == 'n') {
               done =true;
          }   
           if(proceed.charAt(0) == 'y') {
              done = false;
              aList.removeAll();        //clear aList
              System.out.println("");
           }
        }// end while
   }//end main
} //end class

// ************************************************************************************************************
//Captured Output:

//Input a list of integers:  5  9  101  183  4893
//Your list of integers is in ascending order.
//Do you want to continue (y/n):  y
//
//Input a list of integers:  5  9  101  183  48
//Your list of integers is not in ascending order.
//Do you want to continue (y/n):  y
//
//Input a list of integers:  5  4  100  101  183  4893
//Your list of integers is not in ascending order.
//Do you want to continue (y/n):  y
//
//Input a list of integers:  5  9  101  101  183  4893
//Your list of integers is in ascending order.
//Do you want to continue (y/n):  y
//
//Input a list of integers:  -48  -7  0  5  9  101  183
//Your list of integers is in ascending order.
//Do you want to continue (y/n):  y
//
//Input a list of integers:  14
//Your list of integers is in ascending order.
//Do you want to continue (y/n):  y
//
//Input a list of integers:
//Your list of integers is in ascending order.
//Do you want to continue (y/n):  n
// ************************************************************************************************************