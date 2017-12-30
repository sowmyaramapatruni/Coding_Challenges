public class KthToLastNode {

    public static LinkedListNode findKthNode(LinkedListNode head, int k){
        LinkedListNode current = head;
	LinkedListNode runner = head;
	int length = 1;
	while(runner.next != null){
	    runner = runner.next;
	    length++;
	}
	//length = length+1;
	if(k > length){ return null;}
	if(k == 0){
	    return runner;
	}
	int count = 1;
	while(count <= length-k-1){
	    if (current.next == null){
	        return null;
	    }
	    current = current.next;
	    count++;
	}
	return current;

    }
    public static void main(String[] args) {
        int[] arr = {1,2, 3,4,5,6,7,8,9};
	LinkedListNode head = CreateList.createLinkedList(arr);
	System.out.println("List: " + head.printForward());
	int k = 6;
        LinkedListNode node = findKthNode(head, 2);
	if (node != null){
	    System.out.println("Kth element data: " + node.data);
	} else {
	    System.out.println("Invalid k passed");
	}
    }
}
