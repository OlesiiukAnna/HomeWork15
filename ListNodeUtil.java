package home.Task_14;

public class ListNodeUtil {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        ListNode newHead = new ListNode(head.value);
        ListNode lastNode = newHead;

        while (current.next != null) {
            if (current.value == current.next.value) {
                current.next = current.next.next;
            } else {
                lastNode.next = new ListNode(current.next.value);
                lastNode = lastNode.next;
                current = current.next;
            }
        }
        return newHead;

//        ListNode current = head;
//        ListNode nextNode;
//
//        while (current != null) {
//            nextNode = current;
//            while (nextNode.next != null) {
//                if (current.value == current.next.value) {
//                    nextNode.next = nextNode.next.next;
//                } else {
//                    nextNode = nextNode.next;
//                }
//            }
//            current = current.next;
//        }
//
//        return head;

    }
}
