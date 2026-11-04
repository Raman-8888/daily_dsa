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
    public ListNode deleteDuplicates(ListNode head) {

        ArrayList<Integer>res=new ArrayList<>();

        if(head==null)return head;

        while(head!=null)
        {
            if(!res.contains(head.val))
            {
                res.add(head.val);
            }
            head=head.next;
        }
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;

        for(int i:res)
        {
            curr.next=new ListNode(i);
            curr=curr.next;
        }
        return dummy.next;
        
    }
}