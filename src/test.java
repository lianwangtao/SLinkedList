public class test {
	public static void main(String[] args) throws NullDataException {
		
		SLinkedList<String> list = new SLinkedList<String>();
		
		/*
		 * Test for Add & isEmpty
		 */
		//1. empty list
		if (list.isEmpty()) System.out.println("Without anything inside, the list is empty!");
		else System.out.println("The is empty method failed");
		
		//2.Add one item
		list.add("First item");
		if (list.isEmpty()) System.out.println("Without anything inside, the list is empty!");
		else System.out.println("Added one item.");
		
		
		
	}
}