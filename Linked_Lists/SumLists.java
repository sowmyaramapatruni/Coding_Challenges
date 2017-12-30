public class SumLists {
    public static LinkedListNode doSum(LinkedListNode head1, LinkedListNode head2) {
        LinkedListNode current1 = head1;
        LinkedListNode current2 = head2;
        LinkedListNode head3 = null;
	LinkedListNode current3 = null;
        int carry = 0;

	while(current1 != null || current2 != null){
	    int d1 = current1 == null ? 0 : current1.data;
            int d2 = current2 == null ? 0 : current2.data;

            int sum = d1 + d2 + carry;
            
            if (sum >= 10){
	        sum = sum -10;
		carry = 1;
	    } else {
	        carry = 0;
	    }

            if (head3 == null){
	        LinkedListNode temp1 = new LinkedListNode(sum);
		head3 = temp1;
		current3 = head3;
	    } else {
	        LinkedListNode temp2 = new LinkedListNode(sum);
		current3.next = temp2;
		current3 = temp2;
	    }
	    current1 = current1 == null ? null : current1.next;
	    current2 = current2 == null ? null : current2.next;
            
	}
	if(carry == 1){
	    LinkedListNode temp3 = new LinkedListNode(carry);
	    current3.next = temp3;
	    current3 = temp3;
	}

        return head3;
    }

    public static void main(String[] args){
        int[] arr1 = {7, 1, 6};
	int[] arr2 = {5, 9};
        LinkedListNode head1 = CreateList.createLinkedList(arr1);
	LinkedListNode head2 = CreateList.createLinkedList(arr2);
        System.out.println("List1: " + head1.printForward());
	System.out.println("List2: " + head2.printForward());
	LinkedListNode head3 = doSum(head1, head2);
	System.out.println("Sum= " + head3.printForward());
    }
}
