package linkedLists;

public class SumList {

	public static void main(String[] args) {

		Node first= createLinkedList();
		Node second= createSecondLinkedList();

		System.out.println(printLinkedList(first));
		System.out.println(printLinkedList(second));

		sumList(first, second);

	}


	/**
	 * Two linkedlist data is added and created a third linked list according to reverse order
	 * @param first
	 * @param second
	 */
	private static void sumList(Node first, Node second) {

		StringBuilder sb1= new StringBuilder();
		StringBuilder sb2= new StringBuilder();
		int counter=0;

		while(first != null) {

			if(sb1.length() ==0) {
				sb1.append(first.data);
			}
			else {
				sb1.insert(sb1.length()-counter, first.data);
			}

			first= first.next;
			counter++;
		}

		System.out.println(sb1);

		counter=0;
		while(second != null) {

			if(sb2.length() ==0) {
				sb2.append(second.data);
			}
			else {
				sb2.insert(sb2.length()-counter, second.data);
			}

			second= second.next;
			counter++;
		}

		System.out.println(sb2);

		int sum=Integer.valueOf(sb1.toString()) + Integer.valueOf(sb2.toString());

		String sumString= String.valueOf(sum);
		char[] charArray= sumString.toCharArray();

		Node result=null;
		Node head=null;

		for(int i=charArray.length -1; i >= 0; i--) {
			Node each= new Node(Character.getNumericValue(charArray[i]));
			if(null == result) {
				result=each;
				head= result;
			}
			else {
				while(result.next !=null) {
					result= result.next;
				}
				result.next=each;
			}
		}

		System.out.println(printLinkedList(head));

	}


	// sample linked list for testing
	private static Node createLinkedList() {

		Node first= new Node(1);
		Node head=first;
		Node next= new Node(0);

		for(int i=2; i< 4; i++) {
			next= new Node(i);
			while(first.next !=null) {
				first= first.next;
			}
			first.next=next;
			first.next.previous=first;
		}
		return head;

	}


	// sample linked list for testing
	private static Node createSecondLinkedList() {

		Node first= new Node(9);
		Node head=first;
		Node next= new Node(5);
		while(first.next !=null) {
			first= first.next;
		}
		first.next=next;
		first.next.previous=first;

		next= new Node(9);

		while(first.next !=null) {
			first= first.next;
		}
		first.next=next;
		first.next.previous=first;

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
