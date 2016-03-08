import java.util.Scanner;
import java.util.StringTokenizer;
public class TestList 
{
    static Scanner in = new Scanner(System.in);
    public static void main(String args[]) {
        int number;

        String proceed;   
        
        
        //cut it down to one array b/c efficient issue
        ComparableListArrayBased aListTemp = new ComparableListArrayBased();
        ComparableListArrayBased aListNew = new ComparableListArrayBased();
   
        boolean done = false;
        while(!done){
            
            aListTemp.removeAll();
            aListNew.removeAll();
            
            System.out.print("\nInput a list of integers: ");  

            //prompt user input
            String userInput;
            userInput = in.nextLine();

            //token method to split the string 
            StringTokenizer st = new StringTokenizer(userInput);

            // storing user's input in a reverse order 
            while (st.hasMoreTokens()) {
                int newStuff = Integer.parseInt(st.nextToken());
                aListTemp.add(0,newStuff);
            }   

            // re-arrange the list based on user's input order
            int size = aListTemp.size();
            for(int i=0; i < size; i++){
                aListNew.add(0,aListTemp.get(i));
            }

            aListNew.isInAscendingOrder(aListNew);   

           System.out.print("Do you want to continue (y/n): ");
           proceed = in.nextLine();
            if (proceed.charAt(0) == 'n') {
               done =true;
          }   
           if(proceed.charAt(0) == 'y') {
              done = false;
           }
        }// end while
   }//end main
} //end class