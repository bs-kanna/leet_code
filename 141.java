//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
    public boolean hasCycle(ListNode head) {
        // //version: 1
        // Set<ListNode> present = new HashSet<>();
        // if(head == null) return false;
        // ListNode curr = head;
        // while(present.add(curr)){
        //     // System.out.println(curr.val);
        //     curr = curr.next;
        //     if(curr==null)
        //         return false;
        // }
        // return true;

        //version: 2
        ListNode go = head;
        ListNode goo = head;
        while(goo != null && goo.next != null){
            go = go.next;
            goo = goo.next.next;
            if(go == goo)
                return true;
        }
        return false;
    }
}