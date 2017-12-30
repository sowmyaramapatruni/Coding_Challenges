public class LinkedList<T> {
    private int count = 0;
    private static class Node<T> {
        private T data;
	private Node<T> next;
        
	/**
	public Node(T t){
	    this.data = t;
	}*/
	public void set(T t){
	    this.data = t;
	} 

	public T get(){
	    return this.data;
	}
    }
    private Node<T> Head = null;
    private Node<T> Tail = null;
    public void insert(T t){
        Node<T> n = new Node<T>();
	if (this.Head == null){
	    n.set(t);
	    this.Head = n;
	    this.Tail = n;
	    n.next = null;
	} else {
	    Node<T> temp = this.Head;
	    while(temp.next != null) {
	        temp = temp.next;
	    }
	    temp.next = n;
	    n.set(t);
	    n.next = null;
	    this.Tail = n;
	}
	this.count++ ;
    }
    public T removeLast() throws EmptyException{
	T value;
        if (Head == null){
	   throw new EmptyException();
	} else {
	    Node<T> temp = Head;
	    while(temp.next.next != null) {
                temp = temp.next;
            }
	    value = temp.next.data;
	    this.Tail = temp;
	    temp.next = null;
	    this.count--;
	}
        return value;
    }
    public T getValue(int index) throws InvalidIndexException{
	if (index > this.count || index < 1){
	    throw new InvalidIndexException();
	}
	Node<T> temp = this.Head;
	int curr = 1;
	T value = null;
	//get the last element
        if(index == this.count){
	    value = this.Tail.data;
	    return value;
	}
	if (this.Head == this.Tail){
	    return this.Head.data;
	}
	while(temp.next != null){
	    if (curr == index){
	        value = temp.data;
		break;
	    }else {
	        curr++;
		temp = temp.next;
	    }
	}
	return value;
    }
    public void setValue(int index, T t) throws InvalidIndexException{
        //check if index in less than length
	if (index > this.count || index < 1){
	    throw new InvalidIndexException();
	}

	//check if index is the last element.
	if (index == this.count){ 
	    this.Tail.set(t);
	}
	if (this.Head == this.Tail){
	    this.Head.set(t);
	}
        Node<T> temp = this.Head;
	int curr = 1;
	while(temp.next != null){
	    if (curr == index){
	        temp.set(t);
		break;
	    } else{
	        curr++;
		temp = temp.next;
	    }
	}
    
    }
    public int length(){
        return this.count;
    }

    public void insertAt(int index, T t)throws InvalidIndexException{
        //check if index in less than length
	Node<T> current = new Node<T>(); 
	current.set(t);
        if (index > this.count || index < 1){
            throw new InvalidIndexException();
        }

        //check if index is the last element.
        if (index == this.count){
            this.Tail.next=current;
	    current.next = null;
            this.Tail = current;
        }
        if (this.Head == this.Tail){
            
            this.Tail.next=current;
	    current.next = null;
            this.Tail = current;
	}
	if(index == 1){
	   current.next=this.Head.next;
	   this.Head=current;
	}
	int curr =1;
	Node<T> temp = this.Head;
	while (temp.next != null){
	       if(curr == index-1) {
	           current.next=temp.next;
		   temp.next=current;
		   break;
	       }else{
	        curr++;
		temp = temp.next;
	       }
	}

    }

    public void display(){
        Node<T> temp = Head;
	while(temp.next != null){
	    System.out.print(temp.data);
	    System.out.print(" -> ");
	    temp = temp.next;
	}
	System.out.println(temp.data);
 	
    }

    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<Integer>();
	list.insert(1);
	list.insert(2);
	list.insert(3);
	list.insert(4);
	list.insert(5);
	list.insert(6);
	list.display();
	//list.removeLast();
	list.setValue(6, 100);
	list.insertAt(1,200);
	list.display();
	//System.out.println(list.getValue(3));
    }
}

