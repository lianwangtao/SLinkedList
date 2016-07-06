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
			curr = toEnd(curr);
			curr.setNext(new Node<E>(data, null));
			size++;
		}
	}
	
	//Add item at the specific index of the list
	public void add(int index, E data) throws NullDataException {
		//If the data is null, throw exception
		if (data == null) throw new NullDataException();
		//If the list is empty, add the node to the head
		if (size == 0) {
			head = new Node<E>(data, null);
			size++;
		}else if (index >= size) {
			//If the index is larger than or equal to the size, add the item to the end
			Node<E> curr = head;
			while (curr.getNext() != null) {
				curr = curr.getNext();
			}
			curr.setNext(new Node<E>(data, null));
			size++;
		}else {
			//Else add the item to the specific position
			Node<E> curr = head;
			for (int i = 0; i < index; i++) {
				curr = curr.getNext();
			}
			curr.setNext(new Node<E>(data, curr.getNext()));
			size++;
		}
	}

	//Get an item from the specific index of the list
	public Node<E> get(int index) {
		
		return null;
	}
	
	//Check if the list contains an item
	public boolean contains(E data) throws NullDataException {
		//If the data is null, throw an exception
		if (data == null) throw new NullDataException();
		//Check if the head has the data
		if (head.getData().equals(data)) return true;
		else {
			//Otherwise check if the list contains the data
			Node<E> curr = head;
			while (curr.getNext() != null) {
				curr = curr.getNext();
				if (curr.getData().equals(data)) return true;
			}
		}
		return false;
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
	
	//Helper method for traversing to the end
	@SuppressWarnings("rawtypes")
	private static Node toEnd(Node head) {
		Node curr = head;
		while (curr.getNext() != null) {
			curr = curr.getNext();
		}
		return curr;
	}

	//Helper method for traversing to a node before the index
	@SuppressWarnings("rawtypes")
	private static Node toIndex(int index, Node head) {
		Node curr = head;
		for (int i = 0; i < index; i++) {
			curr = curr.getNext();
		}
		return curr;
	}
	
	@Override
	public Iterator<E> iterator() {
		return null;
	}
	
	
}
