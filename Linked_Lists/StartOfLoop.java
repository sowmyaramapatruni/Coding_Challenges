public class StartOfLoop {

    public static LinkedListNode getLoopStart(LinkedListNode head) {
        //check if loop exists
	if (head == null) {return null;}
        LinkedListNode fast = head;
	LinkedListNode slow = head;

	while(fast != null && fast.next != null) {
	    fast = fast.next.next;
	    slow = slow.next;
	    if (fast == slow){
	        break;
	    }
	}
	if (fast == null || fast.next == null) {
	    return null;
	}
	slow = head;
	while(fast != slow) {
	    fast = fast.next;
	    slow = slow.next;
	}
	return fast;
        
    }

    public static void main(String[] args){
        //create a list with a loop.
        LinkedListNode head = new LinkedListNode(0);
        LinkedListNode n1 = new LinkedListNode(1);
        LinkedListNode n2 = new LinkedListNode(2);
        LinkedListNode n3 = new LinkedListNode(3);
        LinkedListNode n4 = new LinkedListNode(4);
        LinkedListNode n5 = new LinkedListNode(5);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n3;

        LinkedListNode res = getLoopStart(head);
	if(res != null){
            System.out.println("Loop starts at: " + res.data);
	} else {
	    System.out.println("No loop exists");
	}

	int[] arr2 = {1, 2, 3, 4, 5}; 
	LinkedListNode head2 = CreateList.createLinkedList(arr2);

        LinkedListNode res2 = getLoopStart(head2);
	if(res2 != null){
            System.out.println("Loop starts at: " + res2.data);
	} else {
	    System.out.println("No loop exists");
	}
    }
}
