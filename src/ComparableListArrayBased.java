// *******************************************************************
// Lab 2			Authors: Zhipeng Mei, Vince Garcia, Johnson Mei
// Class: CS 111C		Date:	 2/9/16
// Array-based implementation of the ADT list.
// The ComparableListArrayBased class
// *******************************************************************
import java.util.Scanner;
public class ComparableListArrayBased implements ComparableListInterface  {
  
 
  private static final int MAX_LIST = 50;
  private Comparable items[];  // an array of list items
  private int numItems;  // number of items in list

  public ComparableListArrayBased() {
    items = new Comparable[MAX_LIST];
    numItems = 0;
  }  // end default constructor

  public boolean isEmpty() {
    return (numItems == 0);
  } // end isEmpty

  public int size() {
    return numItems;
  }  // end size

  public void removeAll() {
    // Creates a new array; marks old array for
    // garbage collection.
    items = new Comparable[MAX_LIST];
    numItems = 0;
  } // end removeAll

  public void add(int index, Comparable item) throws  ListIndexOutOfBoundsException {
    if (numItems >= MAX_LIST) {
      throw new ListException("ListException on add");
    }  // end if
    if (index >= 0 && index <= numItems) {
      // make room for new element by shifting all items at
      // positions >= index toward the end of the
      // list (no shift if index == numItems+1)
      for (int pos = numItems-1; pos >= index; pos--) {
          items[pos+1] = items[pos];
      } // end for
      // insert new item
      items[index] = item;
      numItems++;
    }
    else {  // index out of range
      throw new ListIndexOutOfBoundsException("ListIndexOutOfBoundsException on add");
    }  // end if
  } //end add

  public Comparable get(int index) throws ListIndexOutOfBoundsException {
    if (index >= 0 && index < numItems) {
      return items[index];
    }
    else  {  // index out of range
      throw new ListIndexOutOfBoundsException("ListIndexOutOfBoundsException on get");
    }  // end if
  } // end get

  public void remove(int index) throws ListIndexOutOfBoundsException {
    if (index >= 0 && index < numItems) {
      // delete item by shifting all items at
      // positions > index toward the beginning of the list
      // (no shift if index == size)
      for (int pos = index + 1; pos < numItems; pos++) {
        items[pos-1] = items[pos];
      }  // end for
      numItems--;
    }
    else {  // index out of range
        throw new ListIndexOutOfBoundsException("ListIndexOutOfBoundsException on remove");
    }  // end if
  } // end remove


   static public void main(String args[]) {
  
       
   }   

   public Boolean isInAscendingOrder(ComparableListArrayBased aList) {
    
    int size = aList.size();
    
    for(int i=0; i<size -1; i++) {
        for(int j=1; j<size; j++){
            
            int a = (int) aList.items[i];
            int b = (int) aList.items[i+1]; 
            
//            System.out.println("a is " + a);
//            System.out.println("b is " + b +"\n");
            
             if ( a > b) {
                 System.out.println("Your list of integers is not in ascending order.");
               return false;
            }  
        }
    }
                     
    System.out.println("Your list of integers is in ascending order.");
    return true;
   
 }  


}  // end ListArrayBased
