package home.Task_14;
/*
Задан отсортированный список который состоит из ListNode.
Написать метод deleteDuplicates, который вернет список без дубликатов.
        Example:
        Input: 1->1->2->3->3
        Output: 1->2->3
*/
public class Task_14_2 {

    public static void main(String[] args) {

        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(1);
        listNode.next.next = new ListNode(2);
        listNode.next.next.next = new ListNode(3);
        listNode.next.next.next.next = new ListNode(4);
        listNode.next.next.next.next.next = new ListNode(4);

        ListNodeUtil nodeUtil = new ListNodeUtil();
        printList(listNode);
        System.out.println("\n");
        printList(nodeUtil.deleteDuplicates(listNode));

    }

    public static void printList(ListNode head) {
        ListNode current = head;

        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }

    }
}
