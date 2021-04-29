import java.util.HashMap;

import org.w3c.dom.Node;
public class LinkedLists {
	public static void removeDups(Node head) {
		// O(n) time, O(n) space
		/*HashMap <Character, Integer> hm = new HashMap<>();
		Node prev = null;
		Node temp = head;
		hm.put(head.data, 0);
		while (temp != null) {
			if (hm.containsKey(temp.data) && temp.next != null) {
				prev.next = temp.next;
			}
			else {
				hm.put(temp.data, 0);
				prev = temp;
			}
			temp = temp.next;
		}*/
		
		//O(n^2) time, O(1) space
		/*Node temp1 = head;
		Node temp2 = head;
		while (temp1 != null) {
			temp2 = temp1;
			while (temp2.next != null) {
				if (temp2.next.data == temp1.next.data) {
					temp2.next = temp2.next.next;
				}
				else
					temp2 = temp2.next;
			}
			temp1 = temp1.next;
		}*/
	}
	public static Node removeKthFromLast(Node head, int k) {
		// O(n) time, O(1) space
		/*Node firstTmp = head;
		Node secondTmp = head;
		for (int i = 0; i < k; i++) {
			secondTmp = secondTmp.next;
		}
		while (secondtmp != null) {
			firstTmp = firstTmp.next;
			secondTmp = secondTmp.next;
		}
		return firstTmp;*/
		return null;
	}
	public static void deleteMiddleNode(Node toDelete) {
		//O(n) time, O(1) space
		/*Node nextOne = toDelete.next;
		while (nextOne != null) {
			toDelete.data = nextOne.data;
			toDelete = nextOne;
			nextOne = nextOne.next;
		}
		toDelete.next = null;*/
		//O(1) time, O(1) space
		/*Node nextOne = toDelete.next;
		toDelete.data = next.data;
		toDelete.next = toDelete.next.next;*/
	}
	public static void partition(Node head, int x) {
		//O(n) time, O(n) space
		/*Node lessHead = null;
		Node lessPointer = lessHead;
		Node moreHead = null;
		Node morePointer = moreHead;
		while (head != null) {
			if (head.data < x) {
				if (lessHead == null)
					lessHead = new Node(head.data);
				else {
					lessPointer.next = new Node(head.data);
					lessPointer = lessPointer.next;
				}
			}
			else {
				if (moreHead == null)
					moreHead = new Node(head.data);
				else {
					morePointer.next = new Node(head.data);
					morePointer = morePointer.next;
				}
			}
			head = head.next;
		}
		lessPointer.next = moreHead;
		head = lessHead;*/
		
		//O(n) time, O(1) space
		/*Node lessHead = null;
		Node lessPointer = lessHead;
		Node moreHead = null;
		Node morePointer = moreHead;
		while (head != null) {
			Node next = head.next;
			head.next = null; //disconnecting the node
			if (head.data < x) {
				if (lessHead == null)
					lessHead = head;
				else {
					lessPointer.next = head;
					lessPointer = lessPointer.next;
				}
			}
			else {
				if (moreHead == null)
					moreHead = head;
				else {
					morePointer.next = head;
					morePointer = morePointer.next;
				}
			}
			head = next;
		}
		if (lessHead == null)
			head = moreHead;
		else {
			lessPointer.next = moreHead;
			head = lessHead;
		}*/
	}
	public static Node sumLists(Node head1, Node head2) {
		//O(m+n) time, O(1) space
		/*Node node = head1;
		Node node2 = head2;
		int sum = 0;
		int carry = 0;
		while (node != null) {
			sum = node.data + node2.data;
			node.data = sum + carry;
			if (node.data / 10 == 1) {
				node.data = node.data % 10;
				carry = 1;
			}
			else {
				carry = 0;
			}
			node = node.next;
			node2 = node2.next;
		}
		if (node2 != null) {
			node = node2;
			node.data += carry;
			
		}
		else if (carry == 1) {
			node = new Node(carry);
		}
		return head1;*/
		
		//with converting to int

		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
