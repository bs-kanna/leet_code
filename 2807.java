//Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head == null)
            return head;
        ListNode curr = head;
        while(curr.next!=null){
            int gcd = gcd(curr.val,curr.next.val);
            curr.next = new ListNode(gcd,curr.next);
            curr = curr.next.next;
        }
        return head;
    }
    int gcd (int a,int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
        // if(b==0)
        //     return a;
        // return gcd(b,(a%b));
    }
}