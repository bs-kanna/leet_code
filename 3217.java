
//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        int max = 0;
        for(int j:nums) max=Math.max(max,j);
        int ref[] = new int[max+1];
        for(int j=0; j<nums.length; j++) ref[nums[j]]++;
        while(head.val<=max && ref[head.val]>0) head = head.next;
        ListNode curr = head;
        while(curr.next != null){
            if(curr.next.val<=max && ref[curr.next.val]>0) {
                if(curr.next.next!=null)
                    curr.next = curr.next.next;
                else{
                    curr.next = null;
                    return head;
                }
            }else 
                curr = curr.next;
        }
        return head;
    }
}