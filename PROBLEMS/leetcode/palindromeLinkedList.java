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
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode previous=null;
        ListNode temp=null;
        //finding the middle of the singlylinkedlist
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
        previous=slow;
        slow=slow.next;
        previous.next=null;
        //finding the reverse of singlylinkedlist starting from mid listNode i.e., slow here
        while(slow!=null){
            temp=slow.next;
            slow.next=previous;
            previous=slow;
            slow=temp;
        }
        //fast points to head and slow points to head of reverse sll i.e., previous
        fast=head;
        slow=previous;
        //comparison of each listNode and traversing towards mid listNode
        while(slow!=null){
            if(fast.val!=slow.val){
                return false;
            }
            fast=fast.next;
            slow=slow.next;
        }
        return true;
    }     
    
}
