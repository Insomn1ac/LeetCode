package reverse.linked.list;

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

    public static ListNode fromArray(int... numbers) {
        ListNode head = null;
        ListNode prev = null;
        for (int num : numbers) {
            ListNode node = new ListNode(num);
            if (prev == null) {
                head = node;
            } else {
                prev.next = node;
            }
            prev = node;
        }
        return head;
    }

    public int[] toArray() {
        int size = 0;
        ListNode node = this;
        while (node != null) {
            size++;
            node = node.next;
        }
        int[] numbers = new int[size];
        size = 0;
        node = this;
        while (node != null) {
            numbers[size++] = node.val;
            node = node.next;
        }
        return numbers;
    }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }
        return prev;
    }
}