public class Partition {
    public static LinkedListNode doThePartition(LinkedListNode head, int element){
        LinkedListNode current = head;
	while(current.next != null){
	    if(current.data < element){
	        if(current != head){
		    //move to head
		    LinkedListNode temp = current;
		    LinkedListNode next = current.next;
		    current.data = next.data;
		    current.next = next.next;
		    temp.next = head;
		    head = temp;
		    continue;
		}
	    }
	    current = current.next;
	
	}
        return head;

    }

    public static void main(String[] args) {
         int[] arr = {3, 5, 8, 5, 10, 2, 1};
         //int[] arr = {};
         LinkedListNode head = CreateList.createLinkedList(arr);
         System.out.println("current: " + head.printForward());
         LinkedListNode new_head = doThePartition(head, 5);
         System.out.println("after removing dups: " + new_head.printForward());

    }
} 
