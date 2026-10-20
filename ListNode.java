// Definition for singly-linked list node
class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class ListNode {

    /**
     * Approach 1: Iterative Arithmetic (Multiplication by 2)
     * Time Complexity:  O(N) - single pass through the linked list
     * Space Complexity: O(1) - uses constant auxiliary space
     */
    public int getDecimalValue(ListNode head) {
        int sum = 0;
        ListNode current = head;

        while (current != null) {
            sum = (sum * 2) + current.val;
            current = current.next;
        }

        return sum;
    }

    public static void main(String[] args) {
        ListNode solver = new ListNode();

        // Test Case 1: [1, 0, 1] -> Expected: 5
        ListNode head1 = new ListNode(1, new ListNode(0, new ListNode(1)));
        System.out.println("Test Case 1 [1, 0, 1] -> Decimal: " + solver.getDecimalValue(head1));

        // Test Case 2: [1, 1, 1, 1] -> Expected: 15
        ListNode head2 = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1))));
        System.out.println("Test Case 2 [1, 1, 1, 1] -> Decimal: " + solver.getDecimalValue(head2));

        // Test Case 3: [0] -> Expected: 0
        ListNode head3 = new ListNode(0);
        System.out.println("Test Case 3 [0] -> Decimal: " + solver.getDecimalValue(head3));
    }
}