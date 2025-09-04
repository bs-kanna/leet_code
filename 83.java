 //Definition for singly-linked list.
 public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        if(current == null)
            return head;
        while(current.next != null){
            if(current.val == current.next.val){
                current.next = current.next.next;
                // System.out.println("1 "+current.val);
            }else{
                current = current.next;
                // System.out.println("2 "+current.val);
            }
        }
        return head;
    }
}