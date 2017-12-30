import java.util.*;
public class RemoveDups {

    public static void removeDupsMethod(LinkedListNode head){
        LinkedListNode current = head;
	while(current != null){
	    LinkedListNode runner = current;
	    while(runner.next != null) {
	        if (current.data == runner.next.data){
		    runner.next = runner.next.next;   
		} else {
		    runner = runner.next;
		}
	    }
	    current = current.next;
	}
    
    }
    public static void main(String[] args){
         //int[] arr = {0,1,2,3,4,5,1,1,2,3};
         int[] arr = {};
	 LinkedListNode head = CreateList.createLinkedList(arr);
	 System.out.println("current: " + head.printForward());
	 removeDupsMethod(head);
	 System.out.println("after removing dups: " + head.printForward());
    }
}
