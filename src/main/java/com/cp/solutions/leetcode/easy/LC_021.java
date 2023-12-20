package Easy;

/**
 * Valid Parenthesis
 */
public class LC_021 {
    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyNode = new ListNode(0);
        ListNode tail = dummyNode;
        while (true) {
            //Null Condition
            if (list1 == null) {
                tail.next = list2;
                break;
            }
            //Null Condition
            if (list2 == null) {
                tail.next = list1;
                break;
            }
            if (list1.data <= list2.data) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        return dummyNode.next;
    }
}

class ListNode {
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
