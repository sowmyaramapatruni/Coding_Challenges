public class RemoveMiddle { 
    public static int[] arr = {1,2, 3,4,5,6,7,8,9};
    public static LinkedListNode head = CreateList.createLinkedList(arr);

    public static boolean removePassedNode(LinkedListNode k) {
        LinkedListNode next = k.next;
	k.data = next.data;
	k.next = next.next;
	return true;
    }

    public static void main(String[] args) {
        System.out.println("List: " + RemoveMiddle.head.printForward());
        LinkedListNode k = RemoveMiddle.head.next.next.next;
        if(removePassedNode(k)){
            System.out.println("List: " + RemoveMiddle.head.printForward());
	} else {
	    System.out.println("Unable to remove the node: Improper position suggested");
	}
    }
}
