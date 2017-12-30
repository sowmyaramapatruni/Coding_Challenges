public class ReverseList {

    public static void printReverse(LinkedListNode head) {
        if(head == null){
	    return;
	} else {
	    printReverse(head.next);
	    System.out.println(head.data);
	}
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
	LinkedListNode head = CreateList.createLinkedList(arr);
	System.out.println("List: " + head.printForward());
	printReverse(head);
    }
}
