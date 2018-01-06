import java.util.*;
public class AnimalShelter {
    private int order;
    private LinkedList<Dog> dogs = new LinkedList<Dog>();
    private LinkedList<Cat> cats = new LinkedList<Cat>();

    public void enqueue(Animal a){
	a.setOrder(order);
	order++;
        if (a instanceof Dog) {
	    dogs.addLast((Dog)a);
	} else if(a instanceof Cat) {
	    cats.addLast((Cat)a);
	}
    }
    public Animal dequeueAny() {
        if(dogs.isEmpty()) {return dequeueCats();}
	else if(cats.isEmpty()){return dequeueDogs();}
	else {
	    Dog d = dogs.peek();
	    Cat c = cats.peek();
	    if(d.isOlderThan(c)) {
	       return dequeueDogs();
	    } else {
	       return dequeueCats();
	    }
	}
    }

    public Dog dequeueDogs(){
        return dogs.poll();
    }
    public Cat dequeueCats(){
        return cats.poll();
    }
    

    public static void main(String args[]){
        AnimalShelter shell = new AnimalShelter();
	Dog d1 = new Dog("d1");
	Dog d2 = new Dog("d2");
	Dog d3 = new Dog("d3");

	Cat c1 = new Cat("c1");
	Cat c2 = new Cat("c2");
	Cat c3 = new Cat("c3");

	shell.enqueue(d1);
	shell.enqueue(c1);
	shell.enqueue(d2);
	shell.enqueue(c2);
	shell.enqueue(d3);
	shell.enqueue(c3);

	Animal a = shell.dequeueAny();
	System.out.println(a.getName());
	
	Animal b = shell.dequeueCats();
	System.out.println(b.getName());
	
	Animal c = shell.dequeueDogs();
	System.out.println(c.getName());

	Animal d = shell.dequeueAny();
	System.out.println(d.getName());
    
    }


}
