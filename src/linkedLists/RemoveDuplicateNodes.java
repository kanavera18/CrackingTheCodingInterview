package linkedLists;

import java.util.HashSet;
import java.util.Set;

/**
 * @author User
 * 
 * Kanav Sharma
 *
 */
public class RemoveDuplicateNodes {

	public static void main(String[] args) {

		Node duplicate=createLinkedList();

		System.out.println(printLinkedList(duplicate));

		Node withOutDuplicate=RemoveDup(duplicate);
		
		System.out.println(printLinkedList(withOutDuplicate));

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

	/**
	 * Function to remove duplicates from linked List
	 * 
	 * @param node
	 * @return
	 */
	private static Node RemoveDup(Node node) {

		Node n= node;

		Set<Integer> set= new HashSet<>();

		set.add(n.data);

		while(n.next !=null) {
			if(set.contains(n.next.data)) {
				n.next=n.next.next;
			}
			else {
				set.add(n.next.data);
				n= n.next;
			}
		}

		return node;
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

}
