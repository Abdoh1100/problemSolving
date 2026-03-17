package com.mvc.problems.interviewList;
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
        ListNode current= this;
        while(current!=null){

            sb.append(current.val).append(" ");
            current=current.next;
        }
        return sb.toString();
    }
}
public class mergeTwoSortedLists {


    public static ListNode mergeTwoLists(ListNode list1,ListNode list2){

       ListNode head=new ListNode(-1);
       ListNode current=head;
        while(list1!=null&&list2!=null){
            if(list1.val<=list2.val){
                current.next=list1;
                list1=list1.next;
            }else{
                current.next=list2;
                list2=list2.next;
            }
            current=current.next;
        }
        if(list1!=null){
            current.next=list1;
        }
        if(list2!=null){
            current.next=list2;
        }
        return head.next;
    }

    public static void  main (String[]args){

        // list1 = [1,2,4]
        ListNode list1 = new ListNode(1,
                new ListNode(2, new ListNode(4)));
        System.out.println(list1);
        // list2 = [1,3,4]
        ListNode list2 = new ListNode(1,
                new ListNode(3, new ListNode(4)));
        System.out.println(mergeTwoLists(list1,list2));




    }
}
