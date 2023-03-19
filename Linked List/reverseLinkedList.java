public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
class Solution {
    public ListNode reverseList(ListNode head) {
        //Initialize prev pointer to null
        ListNode prev = null;  
        //Initialize current to head
        ListNode current = head;
        //While current does not become null
        while(current != null) { 
            //Assign current.next to current
            ListNode next = current.next; 
            //Assign Prev to current.next
            current.next = prev;
            //Assign current to prev 
            prev = current;
            //Assign next to current
            current = next;
        }
        //Return prev as it contains the head of the reversed Linked list
        return prev; 
    }
}
/*
Time Complexity = O(n)
Space Complexity = O(1)
*/
