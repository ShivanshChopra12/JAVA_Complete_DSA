package lec34;

//leetcode : https://leetcode.com/problems/reverse-nodes-in-k-group/submissions/
public class ListNode {
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

public class K_Groups {
	public ListNode reverseKGroup(ListNode given, int k) {
		if (given == null) {
			return null;
		}

		ListNode temp = given;
		for (int i = 0; i < k; i++) {
			if (temp == null) { // agr multiple nai hoga then vo loop end tak nhi jaega , mtlb temp me null
								// ajega
				return given; // so udr hum same print kra dege as it is
			}
			temp = temp.next;
		}

		ListNode sp = reverseKGroup(temp, k); // K se problem recursion ko dedi

		// choti problem hum solve kr rhe hein:
		ListNode curr = given;
		ListNode prev = null;

		for (int i = 0; i < k; i++) {
			ListNode after = curr.next;
			curr.next = prev;

			prev = curr;
			curr = after;
		}
		given.next = sp; // humne jo solve ki hai + jo rec. ne solve kia uska connection h ye
		return prev;
	}
}
