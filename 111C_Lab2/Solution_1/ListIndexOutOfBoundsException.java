// ***************************************************************************
// Lab 2			Authors: Zhipeng Mei, Vince Garcia, Johnson Mei
// Class: CS 111C		Date:	 3/9/16
// ***************************************************************************

//precondition: Data is present
//postcondition: Exception is throwin if one of the operations is provided an index value that is out of range
public class ListIndexOutOfBoundsException
            extends IndexOutOfBoundsException {
  public ListIndexOutOfBoundsException(String s) {
    super(s);
  }  // end constructor
}  // end ListIndexOutOfBoundsException

