// ***************************************************************************
// Lab 2			Authors: Zhipeng Mei, Vince Garcia, Johnson Mei
// Class: CS 111C		Date:	 3/9/16
// ***************************************************************************

//Precondition: List is full
//Postcondition: Exception is thrown when the array storing the list becomes full.
public class ListException extends RuntimeException {
  public ListException(String s) {
    super(s);
  }  // end constructor
}  // end ListException