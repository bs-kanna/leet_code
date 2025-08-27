
//Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }else if(list2 == null){
            return list1;
        }
        ListNode head = new ListNode();
        if(list1.val <= list2.val){
            head =  list1;
            head.next = list1.next;
            list1 = list1.next;
        }else{
            head =  list2;
            head.next = list2.next;
            list2 = list2.next;
        }
        // System.out.println("head: "+head.val);
        ListNode current = head;
        // System.out.println("current: "+current.val);
        while(list1 != null && list2 != null){
            // System.out.println("list1: "+list1.val+" -- list2: "+list2.val);
            if(list1.val <= list2.val){
                current.next =  list1;
                current = current.next;
                list1 = list1.next;
            }else{
                current.next =  list2;
                current = current.next;
                list2 = list2.next;
            }
            // System.out.println("current: "+current.val);
        }
        if(list2 == null){
            current.next = list1;   
        }else{
            current.next = list2;
        }
        return head;
    }
}