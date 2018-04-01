package exercise.ran.a2AddTwoNumbers;

import org.junit.Test;

public class a2AddTwoNumbersTest {
    @Test
    public void appTest(){
        //(2 -> 4 -> 3) + (5 -> 6 -> 4) = （7 -> 0 -> 8)
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(4);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(5);
        ListNode n5 = new ListNode(6);
        ListNode n6 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        n4.next = n5;
        n5.next = n6;

        A2AddTwoNumbers a2AddTwoNumbers = new A2AddTwoNumbers();
        ListNode resultNode = a2AddTwoNumbers.addTwoNumbers(n1,n4);
        System.out.print(resultNode.val);
        while (resultNode.next != null){
            resultNode = resultNode.next;
            System.out.print(resultNode.val);
        }

        System.out.println(" ");

        //(4 -> 3) + (5 -> 6 -> 4) = （9 -> 9 -> 4)
        n2 = new ListNode(4);
        n3 = new ListNode(3);
        n4 = new ListNode(5);
        n5 = new ListNode(6);
        n6 = new ListNode(4);
        n2.next = n3;
        n4.next = n5;
        n5.next = n6;

        resultNode = a2AddTwoNumbers.addTwoNumbers(n2,n4);
        System.out.print(resultNode.val);
        while (resultNode.next != null){
            resultNode = resultNode.next;
            System.out.print(resultNode.val);
        }

        System.out.println(" ");

        //(0) + (5 -> 6 -> 4) = （5 -> 6 -> 4)
        n1 = new ListNode(0);
        n4 = new ListNode(5);
        n5 = new ListNode(6);
        n6 = new ListNode(4);
        n1.next = null;
        n2.next = n3;
        n4.next = n5;
        n5.next = n6;

        resultNode = a2AddTwoNumbers.addTwoNumbers(n1,n4);
        System.out.print(resultNode.val);
        while (resultNode.next != null){
            resultNode = resultNode.next;
            System.out.print(resultNode.val);
        }

        System.out.println(" ");

        //(0) + (0) = （0)
        n1 = new ListNode(0);
        n2 = new ListNode(4);
        n3 = new ListNode(3);
        n4 = new ListNode(0);
        n5 = new ListNode(6);
        n6 = new ListNode(4);
        n1.next = null;
        n2.next = n3;
        n4.next = null;
        n5.next = n6;

        resultNode = a2AddTwoNumbers.addTwoNumbers(n1,n4);
        System.out.print(resultNode.val);
        while (resultNode.next != null){
            resultNode = resultNode.next;
            System.out.print(resultNode.val);
        }

        System.out.println(" ");

        //(5) + (5) = （0 -> 1)
        n1 = new ListNode(5);
        n2 = new ListNode(4);
        n3 = new ListNode(3);
        n4 = new ListNode(5);
        n5 = new ListNode(6);
        n6 = new ListNode(4);
        n1.next = null;
        n2.next = n3;
        n4.next = null;
        n5.next = n6;

        resultNode = a2AddTwoNumbers.addTwoNumbers(n1,n4);
        System.out.print(resultNode.val);
        while (resultNode.next != null){
            resultNode = resultNode.next;
            System.out.print(resultNode.val);
        }

        System.out.println(" ");
    }
}
