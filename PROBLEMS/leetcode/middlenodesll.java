public ListNode middleNode(ListNode head) {
        if(head.data>100)
            return null;
        else{
            if(head==null || head.next==null){
            return head;
        }
        
        ListNode slowPtr=head;
        ListNode fastPtr=head;
        while(fastPtr!=null && fastPtr.next!=null){
            slowPtr=slowPtr.next;
            fastPtr=fastPtr.next.next;
        }
        return slowPtr;
        }
    }
