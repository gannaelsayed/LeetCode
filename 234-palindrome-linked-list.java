 class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
 
public class draft {

	


	public static ListNode getLastNode(ListNode head) {
		if (head.next == null) {
			return head;
		} else {
			return getLastNode(head.next); //without the return here the approach did not work because we always came back to the first method that kept calling itself and returned the very first head
		}
		
	}

	public static ListNode getBeforeLastNode(ListNode head) {

		if (head.next.next == null) {
			return head;
		} else {
			return getBeforeLastNode(head.next);
		}
	} 

	public boolean isPalindrome(ListNode head) {

			if (head.next == null) { // LL of length 1
				return true;
			} else if (head.next.next == null) { // LL of length 2
				if (head.val == head.next.val)
					return true;
				return false;
			} else { // LL of length more than 2
				ListNode first = head;
				ListNode last = getLastNode(head);
				

				if (first.val != last.val) {
					return false;
				} else {
					
					ListNode beforeLast = getBeforeLastNode(head); // won't cause a problem since I only call it it length
					// is more than 2
					beforeLast.next = null;
					return isPalindrome(first.next);
				}

			}


	}
	
	public static void main(String[] args) {
		
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(1);
		ListNode three = new ListNode(2);
		ListNode four = new ListNode(1);
		one.next = two;
		two.next = three;
		three.next=four;
		Solution s = new Solution();
		System.out.println(s.isPalindrome(one));
		
	}

}
