public class CreateList {
    private int[] array;
    public CreateList(){
    }

    public static LinkedListNode createLinkedList(int[] arr) throws NullListException {
	if (arr.length == 0) {
	    throw new NullListException();
	}
        LinkedListNode head = null;
	head = new LinkedListNode(arr[0]);
	LinkedListNode temp = head;
	for (int i = 1; i<arr.length; i++){
	    LinkedListNode node = new LinkedListNode(arr[i], null, temp);
	    temp = node;
	}
	return head;
    }
/**
    public static void main(String[] args) {
	LinkedListNode head = null;
        head = new LinkedListNode(0);
	LinkedListNode temp = head;
        for(int i = 1; i<10; i++){
	    LinkedListNode node = new LinkedListNode(i, null, temp);
	    temp = node;
	}
	String res = head.printForward();
	System.out.println(res);
    }*/
}
