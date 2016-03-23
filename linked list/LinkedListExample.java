import java.util.*;
public class LinkedListExample {
 public static void main(String args[]) {
 /* Linked List Declaration */
 LinkedList<Integer> linkedlist = new LinkedList<Integer>();//made this hold ints
 linkedlist.add(1);
 linkedlist.add(5);
 linkedlist.add(3);
 linkedlist.add(6);
 linkedlist.add(2);//added ints to this list
 /*Display Linked List Content*/
 System.out.println("Linked List Content: " +linkedlist+" Wow that's pretty neat.");//Added pretty neat here
 /*Add First and Last Element*/
 linkedlist.addFirst(1);//changed this to one
 linkedlist.addLast(419);//changed this to 419
 System.out.println("LinkedList Content after addition: " +linkedlist);
 /*This is how to get and set Values*/
 Object firstvar = linkedlist.get(0);
 System.out.println("First element: " +firstvar);
 linkedlist.set(0, 418);//changed this to 418
 Object firstvar2 = linkedlist.get(0);
 System.out.println("First element after update by set method: " +firstvar2);
 /*Remove first and last element*/
 linkedlist.removeFirst();
 linkedlist.removeLast();
 System.out.println("LinkedList after deletion of first and last element: " +linkedlist);
 /* Add to a Position and remove from a position*/
 linkedlist.add(0, 421);//changed this to 421
 linkedlist.remove(3);//now removes 3 instead of 2
 

 
 
 System.out.println("Final Content: " +linkedlist);
 }
 
 //mystuff
 
 
 //finds the smallest number
 for(int i = 0; i<linkedList.length();i++){
    int smallest = linkedList.get(0);
    if(linkedList.get(i) < smallest){
        smallest = linkedList.get(i);
    }
 }
 
 for()
 
 System.out.println("Selection Sorted Content: " +linkedlist);
 }
}