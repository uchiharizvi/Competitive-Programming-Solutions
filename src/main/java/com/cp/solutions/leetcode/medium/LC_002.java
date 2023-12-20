package com.cp.solutions.leetcode.medium;

public class LC_002 {
    static class Node {
        int data;
        Node next;

        Node() {
        }

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    /**
     * TC: 2 ms
     * SC: 48 MB
     */
        public Node addTwoList(Node l1, Node l2) {
            //add code here
            Node result = new Node();
            Node first = l1;
            Node second = l2;
            int divider = 0;
            int remainder = 0;
            Node response = result;
            while (first != null || second != null) {
                int firstVal = (first != null) ? first.data : 0;
                int secVal = (second != null) ? second.data : 0;

                int sum = firstVal + secVal + divider;//2+5+0 = 7
                divider = sum / 10; //
                remainder = sum % 10;//7
                /**understand this in detail**/
                response.next = new Node(remainder);
                response = response.next;
                if (first != null) first = first.next;//iteration linked-list
                if (second != null) second = second.next;//iteration linked-list
            }
            if (divider > 0) response.next = new Node(divider);
            return result.next;
        }


    public static void main(String[] args) {
        Node l1 = new Node(2);
        l1.next = new Node(4);
        l1.next.next = new Node(3);

        Node l2 = new Node(5);
        l2.next = new Node(6);
        l2.next.next = new Node(4);
        LC_002 code = new LC_002();
        Node result = code.addTwoList(l1,l2);
        print(result);

    }

    private static void print(Node result) {
       while (result!=null){
           System.out.println(result.data);
           result = result.next;
       }
    }
}
