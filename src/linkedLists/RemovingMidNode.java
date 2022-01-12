package linkedLists;

public class RemovingMidNode {

	public static void main(String[] args) {

		Node sample=createLinkedList();
		System.out.println(printLinkedList(sample));

		boolean result=removeMidNode(sample);
		System.out.println(result);
	}


	private static boolean removeMidNode(Node sample) {

		if(sample==null) {
			return false;
		}
		
		if(sample.next !=null) {
			sample.data= sample.next.data;
			sample.next=sample.next.next;
			return true;
					
		}
		return false;

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
