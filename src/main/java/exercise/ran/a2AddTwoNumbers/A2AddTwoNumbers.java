package exercise.ran.a2AddTwoNumbers;

public class A2AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode firstResultListNode = new ListNode((l1.val + l2.val)%10);
        ListNode lastNode = firstResultListNode;
        int carry = (l1.val + l2.val) /10;

        while(l1.next != null || l2.next != null || carry !=0){
            int bitSum = carry;
            if (l1.next != null){
                bitSum += l1.next.val;
                l1 = l1.next;
            }
            if (l2.next != null) {
                bitSum += l2.next.val;
                l2 = l2.next;
            }
            carry = bitSum/10;
            ListNode nextNode = new ListNode(bitSum%10);
            lastNode.next = nextNode;
            lastNode = nextNode;
        }
        return firstResultListNode;
    }
}
