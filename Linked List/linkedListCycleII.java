/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
class Solution {
    public ListNode detectCycle(ListNode head) {
        //two pointer approach
        ListNode slow = head;
        ListNode fast = head;
        //Initially cycle is assigned to false
        boolean cycle = false;
        //Iterate through the loop until fast pointer gets to null
        while(fast != null && fast.next != null){
            slow = slow.next;
            //moves two jumps
            fast = fast.next.next;
            //If the slow matches to fast then change cycle variable to true
            if(slow==fast){
                cycle = true;
                //when cycle is detected break it
                break;
            }
        }
        //If cycle is not there return null
        if(!cycle){
            return null;
        }
        //Assign slow as head
        slow = head;
        //Iterate until the fast and slow meets
        while(slow!=fast){
            slow = slow.next;
            //Then move both pointer by one node
            fast = fast.next;
        }
        //Return either fast or slow pointer as it is same
        return fast;    
    }
}
/*Time Complexity = O(n)
Space Complexity = O(1)*/
