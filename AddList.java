public class AddList {    
        public static void main(String[] args) {
            ListNode list1 = new ListNode(2, new ListNode(4, new ListNode(3)));
            ListNode list2 = new ListNode(5, new ListNode(6, new ListNode(4)));
            Test3 test=new Test3();
            ListNode l3=test.addTwoNumbers(list1, list2);
            while (l3 != null) {
                System.out.print(l3.val+"->");
                l3 = l3.next;
            }
        }
}
class Test3 {

    ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode l3 = temp;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            ListNode node = new ListNode(sum % 10);
            carry = sum / 10;
            if (temp == null) {
                l3 =temp = node;
            }
            else {
                l3.next = node;
                l3 = l3.next;
            }
        }
        if (carry > 0) {
            l3.next = new ListNode(carry);
        }
        return temp.next;
    }
}