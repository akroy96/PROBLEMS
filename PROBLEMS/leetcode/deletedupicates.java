package gitprojects.leetcode;

// public class singlylinkedlist {

//     private ListNode head;//instance var head will hold the complete linkedlist
    
//     private static class ListNode{ 
//         private int data;
//         private ListNode next;

//         public ListNode(int data){ //constructor of ListNode with only its data part 
//                                     //as its argument/attribute.
//             this.data=data;
//             this.next=null;
//         }
//     }

//     public void display(){
//         ListNode current=head;
//         while(current!=null){
//             System.out.print(current.data+"-->");
//             current=current.next;
//         }
//         System.out.print("null\n");
//     }
//     public int length(){
        
//         if(head==null){
//             return 0;
//         }
//         int count=0;
//         ListNode current=head;
//         while(current!=null){
//             count++;
//             current=current.next;
//         }
//         return count;
//         // System.out.println(count);
//     }

//     public void insertFirst(int value){
//         ListNode newNode=new ListNode(value); //newNode.next pointing to null by default
//         newNode.next=head; //newNode.next pointing to head now.so its inserted at the beginning
//         head=newNode; //since head should point to the first node in sll

//     }

//     public void insert(int position,int value){
//         ListNode node=new ListNode(value);
        
//         if(position==1){
//             node.next=head;
//             head=node;
//         }
//         else{
//             ListNode previous=head;
//             int count=1;
//             while(count<position-1){
//                 previous=previous.next;
//                 count++;
//             }
//             ListNode current=previous.next;
//             node.next=current;
//             previous.next=node;
//         }
//     }

//     public ListNode deleteFirst(){
//         if(head==null){
//             return null;
//         }
//         ListNode temp=head;
//         head=head.next;
//         temp.next=null;
//         return temp;
//     }

//     public void insertLast(int value){
//         ListNode newNode=new ListNode(value);
//         if(head==null){
//             head=newNode;
//             return;
//         }
//         ListNode current=head;
//         while(null!=current.next){
//             current=current.next;
//         }
//         current.next=newNode;
//     }
//     public static void main(String []args){
//         singlylinkedlist sll=new singlylinkedlist(); //initialise singlylinkedlist, 
//                                                         //as soon as we initialise 
//                                                         //the value of head is null.
//         // sll.head=new ListNode(10);
//         // ListNode second=new ListNode(1);
//         // ListNode third=new ListNode(8);
//         // ListNode fourth=new ListNode(11);

//         // //now we connect them together to form a chain
//         // sll.head.next=second; //10-->1
//         // second.next=third; //10-->1-->8
//         // third.next=fourth;//10-->1-->8-->11-->null

//         // //insert node beginning of singly linked list in java
//         // sll.insertFirst(11);
//         // sll.insertFirst(8);
//         // sll.insertFirst(1);


//         ////insert at the end of singlylinkedlist
//         // sll.insertLast(11);
//         // sll.insertLast(8);
//         // sll.insertLast(1);
//         // sll.insertLast(111);
//         // sll.insertLast(10);


//         ////insert at any given position of sll
//         sll.insert(1,3); //3-->null
//         sll.insert(2,5); //3->5->null
//         sll.insert(1,2); //2->3->5->null
//         sll.insert(2,4); //2->4->3->5->null
//         sll.insert(5,7); //2->4->3->5->7->null

//         sll.display();

//         System.out.println(sll.deleteFirst().data);
//         System.out.println(sll.deleteFirst().data);

//         sll.display();

//         // int count=sll.length();
//         // System.out.println("length of sll is "+sll.length());
//     }
// }
public class deletedupicates {
    //   Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        else if(head.next==null){
            return head;
        }
            
        ListNode current=head;
        while(current!=null && current.next!=null){
            if(current.val==current.next.val){
                current.next=current.next.next;
            }
            else{
                current=current.next;
            }
        }
        return head;
    }

    
}
