package reviewClass;

public class LinkedTest {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.addFirst(1);
        linkedList.addFirst(4);
        linkedList.addFirst(2);
        linkedList.addFirst(2);
        linkedList.addFirst(4);
        linkedList.addFirst(1);

        linkedList.display();

        System.out.println(linkedList.middleNode().data);

        System.out.println(linkedList.isPalindrome());

    }
}
