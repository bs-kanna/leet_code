 //Definition for singly-linked list.
 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode curr = head;
        while(curr.next != null){
            // System.out.println("1. "+curr.val);
            curr.val += curr.next.val;
            curr.next = curr.next.next;
            if(curr.next.val == 0) {
                if(curr.next.next == null) curr.next = null;
                else curr = curr.next;
            }
        }
        return head;
    }
}