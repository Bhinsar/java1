public class MergeList {
    
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        Test2 test=new Test2();
        ListNode l3= test.mergeTwoLists(list1,list2);
        while (l3 != null) {
            System.out.print(l3.val+"->");
            l3 = l3.next;
        }
    }
}
class Test2 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode(0);
        ListNode list3 = temp;
        while (list1 !=null && list2 != null) {
            if(list1.val < list2.val){
                list3.next = list1;
                list1 = list1.next;
            }else{
                list3.next = list2;
                list2 = list2.next;
            }
            list3 =list3.next;
        }
        if (list1 != null) {
            list3.next = list1;
            list1 = list1.next;            
        }
        if (list2!=null) {
            list3.next=list2;
            list2=list2.next;
        }
        return temp.next;
        
    }
}