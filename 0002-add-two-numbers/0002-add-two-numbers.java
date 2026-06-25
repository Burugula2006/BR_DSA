class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        int carry=0;
        while(l1!=null || l2!=null){
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            int digit =val1+val2+carry;
            carry= digit>=10?1:0;
            digit =digit%10;
            temp.next=new ListNode(digit);
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            temp=temp.next;
        }
        if(carry==1){
            temp.next=new ListNode(carry);
        }
    return dummy.next;
    }
}