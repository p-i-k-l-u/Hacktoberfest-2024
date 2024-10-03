// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LinkedListCycleDetection {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false; // No cycle if list is empty or has only one node
        }
        
        ListNode slow = head;  // slow pointer moves one step
        ListNode fast = head;  // fast pointer moves two steps
        
        while (fast != null && fast.next != null) {
            slow = slow.next;       // move slow pointer by 1
            fast = fast.next.next;  // move fast pointer by 2
            
            if (slow == fast) {     // cycle detected
                return true;
            }
        }
        
        return false;  // no cycle found
    }
    
    public static void main(String[] args) {
        // Example to test the code
        LinkedListCycleDetection detection = new LinkedListCycleDetection();
        
        // Creating a cycle in the linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 3 (cycle back to 3)
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = head.next.next; // Create the cycle (pointing to node 3)
        
        System.out.println("Cycle detected: " + detection.hasCycle(head));  // Output: true
    }
}
