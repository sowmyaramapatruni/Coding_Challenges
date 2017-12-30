public class IsPalindrome {
    public static LinkedListNode reverseList(LinkedListNode node){
        LinkedListNode head = null;
	while(node != null){
	    LinkedListNode n = new LinkedListNode(node.data);
	    n.next = head;
	    head = n;
	    node = node.next;
	}
	return head;
    }
    

    public static boolean checkPalindrome(LinkedListNode head) {
        //create a reserve list
        LinkedListNode head2 = reverseList(head);
	LinkedListNode one = head;
	LinkedListNode two = head2;

	while(one != null || two != null){
	    if (one.data != two.data){
	        return false;
	    }
	    one = one.next;
	    two = two.next;
	}
	//check if elements in the list are equal until half of the list\
        return true;
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 4, 2, 1};
	LinkedListNode head = CreateList.createLinkedList(arr);
	System.out.println(head.printForward());
	boolean res = checkPalindrome(head);
	System.out.println(res);
    }
}
