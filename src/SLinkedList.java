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
	public void add(E data) {
		
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

	@Override
	public Iterator<E> iterator() {
		return null;
	}
	
	
}
