//cci150 3.7

import java.util.*;

public class Queue2
{
	private LinkedList<Animal> list;
	
	public Queue2() {
		list = new LinkedList<Animal>();
	}
	
	public void enqueue(Animal animal) {
		list.add(animal);
	}
	public Animal dequeueAny() {
		if(list.size() != 0) {
			return list.removeFirst();
		} else {
			return null;
		}
	}
	public Dog dequeueDog() {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getClass() == Dog.class) {
				return list.remove(i);
			}
		}
		return null;
	}
	public Cat dequeueCat() {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getClass() == Cat.class) {
				return list.remove(i);
			}
		}
		return null;
	}
}

class Animal {
	String name;
}
class Dog extends Animal {
	
}
class Cat extends Animal {
	
}
