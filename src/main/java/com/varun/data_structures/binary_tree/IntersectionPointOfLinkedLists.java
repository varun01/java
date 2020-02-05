package com.varun.data_structures.binary_tree;

/**
 * @author Varun
 *
 */
public class IntersectionPointOfLinkedLists {

	/**
	 * @param headA LinkedList 1
	 * @param headB LinkeList 2
	 * @return Returns node value where both lists merged.
	 */
	int intersectPoint(Node headA, Node headB)
	{
         int ac =0, bc = 0; // Counter for lengths of both lists.
         Node a = headA;
         Node b = headB;
         while(a != null || b != null){ // Iterating over linkedList to find length's of both.
             if(a != null){
                 ac++;
                 a = a.next;
             }
             if(b != null){
                 bc++;
                 b = b.next;
             }
         }
         
         while(ac > 0){ // Iterating over linked list to find intersection point
             if(ac > bc ){
                 ac--;
                 headA = headA.next;
             } else if (bc > ac){
                 bc--;
                 headB = headB.next;
             } else{
                 if(headA.data == headB.data){
                     return headA.data;
                 }
                 headA = headA.next;
                 headB = headB.next;
             }
         }
         return 0;
	}
	
	class Node
	{
	    int data;
	    Node next;
	    Node(int d) {
	        data = d; 
	        next = null;
	    }
	}

}
