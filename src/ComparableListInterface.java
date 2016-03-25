//**********************************************************************
// Lab 2                	   Authors: Zhipeng Mei, Vince Garcia, Johnson Mei
// Class: CS 111C        Date:    3/9/16
// Interface ListInterface for the ADT list.
// The ComparableListInterface class utilizes ADT operations
//  Exceptions are throwin if indexes are out of range upon trying to add/remove list data
//  This class is implented into ComparableListArrayBased
// **********************************************************************
public interface ComparableListInterface {
  public boolean isEmpty();
  // Determines whether a list is empty.
  // Precondition: None
  // Postcondition: Returns true if the list is empty, otherwise returns false.
  
 
  public int size();
  // Determines the length of a list.
  // Precondition: None.
  // Postcondition: Returns the number of items that are currently in the list.
  
  public void add(int index, Comparable item) throws ListIndexOutOfBoundsException, ListException;
  // Adds an item to the list at position index.
  // Precondition: index indicates the position at which the item should be inserted in the list.
  // Postcondition: If insertion is successful, item is
  // at position index in the list, and other items are renumbered accordingly.
  // Throws: ListIndexOutOfBoundsException if index < 0 or index > size().
  // Throws: ListException if item cannot be placed on the list

  public Comparable get(int index) throws ListIndexOutOfBoundsException;
  // Retrieves a list item by position.
  // Precondition: index is the number of the item to be retrieved.
  // Postcondition: If 0 <= index < size(), the item at
  // position index in the list is returned.
  // Throws: ListIndexOutOfBoundsException if index < 0 or
  // index > size()-1.


  public void remove(int index) throws ListIndexOutOfBoundsException;
  // Deletes an item from the list at a given position.
  // Precondition: index indicates where the deletion should occur.
  // Postcondition: If 0 <= index < size(), the item at 
  // position index in the list is deleted, and other items are renumbered accordingly.
  // Throws: ListIndexOutOfBoundsException if index < 0 or
  // index > size()-1.

  public void removeAll();
  // Deletes all the items from the list.
  // Precondition: None.
  // Postcondition: The list is empty.
} // end ListInterface


