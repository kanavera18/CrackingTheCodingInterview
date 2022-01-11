package linkedLists;

/**
 * @author User
 * Kanav Sharma
 */
public class KthToLastElement {

	public static void main(String[] args) {

		Node node=createLinkedList();

		System.out.println(printLinkedList(node));

		Node returnNode=returnKthToLast(node,3);

		System.out.println(printLinkedList(returnNode));
	}

	/**
	 * Function to retun node following kth value
	 * 
	 * @param node
	 * @param i
	 * @return
	 */
	private static Node returnKthToLast(Node node, int i) {

		Node n= node;
		int counter=0;

		while(n.next !=null) {			
			counter++;			
			if(counter == i) {
				return n;
			}

			n=n.next;
		}

		return n;

	}

	// sample linked list for testing
	private static Node createLinkedList() {

		Node first= new Node(0);
		Node head=first;
		Node next= new Node(0);

		for(int i=1; i< 8; i++) {
			next= new Node(i%2);
			while(first.next !=null) {
				first= first.next;
			}
			first.next=next;
			first.next.previous=first;
		}
		return head;

	}

	/**
	 * Function to print linked List created
	 * @param duplicate
	 * @return
	 */
	private static String printLinkedList(Node duplicate) {

		if(duplicate.next !=null) {
			return duplicate.data + "->" + printLinkedList(duplicate.next);
		}
		else {
			return ((Integer) duplicate.data).toString();
		}

	}

}
