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

		Node resultNode=returnKthToLastNode(node,3);

		System.out.println(printLinkedList(resultNode));

	}

	/**
	 * Function to return all node following kth value till end
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


	/**
	 * Function to return node which is at kth position from end
	 * 
	 * @param node
	 * @param i
	 * @return
	 */
	private static Node returnKthToLastNode(Node node, int k) {

		Node node1= node;
		Node node2=node; 

		for(int i=0; i<k;i++) {
			node1= node1.next;
		}

		while(node1.next !=null) {
			node1=node1.next;
			node2=node2.next;
		}

		return node2;
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
