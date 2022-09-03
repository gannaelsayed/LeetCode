/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

import java.util.ArrayList;
import java.util.List;

class Solution {
    
	
	public static int getListLength(ListNode head) {
		int length = 1;
		while(head.next != null) {
			length++;
			head = head.next;
		}
		return length;
	}

	public boolean isPalindrome(ListNode head) {

		int listLength = getListLength(head);
		List firstHalf = new ArrayList();
		List secondHalf = new ArrayList();
		
		for (int i = 1; i<=listLength/2; i++) {
			firstHalf.add(head.val);
			head = head.next;
		}
		if (listLength%2==1)
			head = head.next;
		for (int i = 1; i<=listLength/2; i++) {
			secondHalf.add(0, head.val);
			head = head.next;
		}
		
		return(firstHalf.equals(secondHalf));

	}
	
	public static void main(String[] args) {
		
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(0);
		ListNode three = new ListNode(0);
		ListNode four = new ListNode(1);
		one.next = two;
		two.next = three;
		//three.next= four;
		Solution s = new Solution();
		System.out.println(s.isPalindrome(one));
		
	}
}