import java.util.*;
public class LinkedListExample {
 public static void main(String args[]) {
 /* Linked List Declaration */
 LinkedList<Intger> linkedlist = new LinkedList<Integer>();//made this hold ints
 linkedlist.add(1);
 linkedlist.add(5);
 linkedlist.add(3);
 linkedlist.add(6);
 linkedlist.add(2);//added ints to this list
 /*Display Linked List Content*/
 System.out.println("Linked List Content: " +linkedlist+" Wow that's pretty neat.");//Added pretty neat here
 /*Add First and Last Element*/
 linkedlist.addFirst("First Item");
 linkedlist.addLast("Last Item");
 System.out.println("LinkedList Content after addition: " +linkedlist);
 /*This is how to get and set Values*/
 Object firstvar = linkedlist.get(0);
 System.out.println("First element: " +firstvar);
 linkedlist.set(0, "Changed first item");
 Object firstvar2 = linkedlist.get(0);
 System.out.println("First element after update by set method: " +firstvar2);
 /*Remove first and last element*/
 linkedlist.removeFirst();
 linkedlist.removeLast();
 System.out.println("LinkedList after deletion of first and last element: " +linkedlist);
 /* Add to a Position and remove from a position*/
 linkedlist.add(0, "Newly added item");
 linkedlist.remove(3);//now removes 3 instead of 2
 System.out.println("Final Content: " +linkedlist);
 }
}