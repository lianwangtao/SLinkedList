/*
 * SLinkedList
 * Author: Shane Lian
 * Class: SlinkedList
 */

import java.util.*;

public class SLinkedList<E> implements Iterable<E>{
	//private fields
	private Node<E> head;
	private int size;
	//constructor
	public SLinkedList(){
		this.head = null;
		this.size = 0;
	}
	
	//Add item to the end of the list
	public void add(E data) throws NullDataException {
		//If the data is null, throw exception
		if (data == null) throw new NullDataException("Null Data!");
		//If the list is empty, make it into the head
		if (head == null) {
			head = new Node<E> (data, null);
			size++;
		}else {
			//If the list is not empty, add the node to the end
			Node<E> curr = head;
			while (curr.getNext() != null) {
				curr = curr.getNext();
			}
			curr.setNext(new Node<E>(data, null));
			size++;
		}
	}
	//Add item at the specific index of the list
	public void add(int index, E data) {
		
	}

	//Get an item from the specific index of the list
	public Node<E> get(int index) {
		return null;
	}
	
	//Check if the list contains an item
	public boolean contains(E data) {
		return true;
	}
	
	//Remove an item from a specific index of the list
	public void remove(int index) {
		
	}
	
	//Get the size of the list
	public int size() {
		return this.size;
	}
	
	//Check if the list is empty
	public boolean isEmpty() {
		if (size == 0) return true;
		else return false;
	}

	@Override
	public Iterator<E> iterator() {
		return null;
	}
	
	
}
