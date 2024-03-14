
/*
 * SLinkedListReplicated.java
 * Sahithra Kesavan
 * 
 * This file has the main class for testing the SLinkedIntList class
 * 
 */




public class SLinkedListReplicated  {
 
    public static void main(String s[]) 
    {
    	
    	
		//Students create 2 LinkedIntList objects.
    	// a) Uses the default constructor
    	SLinkedList<Integer> list1 = new SLinkedList<>();
    	// b) Uses the the construtor that allows an integer value to be passed in.
    	SLinkedList<Integer> list2 = new SLinkedList<>(5); 
    	
		
      	//Test out each of your various methods (add, insert, get, indexOf, remove, size, toString)) 
      		//using either of the instantiated LinkedIntList objects
    	  list1.add(5);
          list1.add(10);
          list1.add(12);
          list1.add(4);
          list1.add(6);
          list1.add(10);
          list1.add(-8);
          list1.add(28391);
          
          System.out.println("List 1: " + list1.toString());
          System.out.println("Size of list 1: " + list1.size());
          System.out.println("Value at index 1 in list 1: " + list1.get(1));
          System.out.println("Index of value -8 in list 1: " + list1.indexOf(-8));
          System.out.println("Removed value at index 1 in list 1: " + list1.remove(1));
          System.out.println("List 1 after removal: " + list1.toString());
          
          // Test methods for list2
          list2.add(15);
          list2.add(-25);
          list2.add(19201291);
          list2.add(33);
          list2.add(4);
          list2.add(1920191);
          
          System.out.println("List 2: " + list2.toString());
          System.out.println("Size of list 2: " + list2.size());
          System.out.println("Value at index 0 in list 2: " + list2.get(0));
          System.out.println("Index of value 33 in list 2: " + list2.indexOf(33));
          System.out.println("Removed value at index 2 in list 2: " + list2.remove(2));
          System.out.println("List 2 after removal: " + list2.toString());
    }
    
	
}
