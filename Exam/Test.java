package Exam;

public class Test {

    public static void main(String[] args) {

        TestDemo1 testDemo1 = new TestDemo1();
        Node node1 = new Node(2);
        node1.next = new Node(4);
        node1.next.next = new Node(5);

        Node node2 = new Node(3);
        node2.next = new Node(4);


        Node cur = testDemo1.func1(node1, node2);

        while (cur != null) {
            System.out.print(cur.data+ " ");
            cur = cur.next;
        }
        System.out.println();


    }
}
