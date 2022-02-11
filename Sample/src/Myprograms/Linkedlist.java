package Myprograms;
import java.util.Collections;
import java.util.LinkedList;

public class Linkedlist {

   public static void main(String[] args) {
       LinkedList<String> linkedList = new LinkedList<>();
       linkedList.add("Uma");
       linkedList.add("Sandy");
       linkedList.add("Yuvi");
       linkedList.add("Nila");
       linkedList.add("Resh");
       linkedList.add("Vicky");
       linkedList.add("Apsara");
       linkedList.add("Varsha");

       System.out.println("Elements list is below: ");
       sortMethod(linkedList);
   }

   private static void sortMethod(LinkedList<String> linkedList) {
       
       System.out.println("Orignal LinkedList:" + linkedList);
       
       Collections.sort(linkedList);
       System.out.println("1. Sort ascending order: " + linkedList);
       
       Collections.sort(linkedList, Collections.reverseOrder());
       System.out.println("2. Sort desending order: " + linkedList);

       
       String removedElement = linkedList.remove(2);
       
       System.out.printf("3. Removed element %s from index 2: %s \n", removedElement, linkedList);

       
       removedElement = linkedList.removeFirst();
       
       System.out.printf("4. Removed first element %s of linked list:%s \n", removedElement, linkedList);

       
       removedElement = linkedList.removeLast();
       
       System.out.printf("5. Removed last element %s of linked list:%s \n", removedElement, linkedList);

       
   }
}


	
		
		 
		
