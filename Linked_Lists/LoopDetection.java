public class LoopDetection {

    public static boolean checkLoop(LinkedListNode head) {

	if (head == null) {return false;}
        LinkedListNode fast = head.next;
	LinkedListNode slow = head;

	while(fast != null && fast.next != null) {
	    if (fast == slow){
	        return true;
	    }
	    fast = fast.next.next;
	    slow = slow.next;
	}
        return false;
    }

    public static void main(String[] args){
        //create a list with a loop.
        LinkedListNode head = new LinkedListNode(1);
        LinkedListNode n1 = new LinkedListNode(2);
        LinkedListNode n2 = new LinkedListNode(3);
        LinkedListNode n3 = new LinkedListNode(4);
        LinkedListNode n4 = new LinkedListNode(5);
        LinkedListNode n5 = new LinkedListNode(6);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n3;

        System.out.println(checkLoop(head));

	int[] arr2 = {1, 2, 3, 4, 5}; 
	LinkedListNode head2 = CreateList.createLinkedList(arr2);

	System.out.println(checkLoop(head2));
    }
}
