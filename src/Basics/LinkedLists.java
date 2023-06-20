public class LinkedLists {

    private Node head;

    private class Node {
        int data; // value that's stored in a node
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void insertAtBeginning(int data) { // Inserts an element to the beginning of the list
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return;
    }

    public void insertAtEnd(int data) { // Inserts an element to the end of the list
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            return;
        }
    }

    public void deleteNode(int position) { // Deletes the first occurance of an element
        int count = 1;
        Node currentNode = head;
        Node previousNode = head;
        if (position > length()) {
            System.out.println("Position out of bound.");
            return;
        }
        if (position == 1) {
            head = head.next;
            return;
        }
        while (count < position) {
            previousNode = currentNode;
            currentNode = currentNode.next;
            count++;
        }
        if (count == position) {
            previousNode.next = currentNode.next;
            return;
        }
    }

    public void printList() { // Displays the linked list
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        ;
        System.out.println();
    }

    public int length() { // Returns the number of elements in the list
        int count = 0;
        Node currentNode = head;
        while (currentNode != null) {
            count += 1;
            currentNode = currentNode.next;
        }
        return count;
    }

    public boolean search(int data) { // looks for a particular element in the list
        Node currentNode = head;

        if (head == null) {
            return false;
        }
        while (currentNode != null) {
            if (currentNode.data == data) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public void insertAfter(int position, int data) { // Inserts an element after a certain position
        int count = 1;
        Node currentNode = head;
        Node previousNode = head;
        Node newNode = new Node(data);
        if (position > length()) {
            System.out.println("Position out of bound.");
            return;
        }
        if (position == 1) {
            previousNode.next = newNode;
            newNode.next = currentNode;
            head = newNode;
            return;
        }
        while (count < position) {
            previousNode = currentNode;
            currentNode = currentNode.next;
            count++;
        }
        previousNode.next = newNode;
        newNode.next = currentNode;
        return;
    }

    public static void main(String[] args) { // main method
        LinkedLists linkedlist = new LinkedLists();

        System.out.print("Initial Linked list: ");
        linkedlist.insertAtBeginning(23);
        linkedlist.insertAtEnd(34);
        linkedlist.insertAtBeginning(12);
        linkedlist.printList();

        System.out.print("Modified Linked list: ");
        linkedlist.deleteNode(2);
        linkedlist.printList();

        System.out.print("Length of Linked list: ");
        System.out.println(linkedlist.length());

        System.out.print("Is \"12\" an element: ");
        System.out.println(linkedlist.search(12));

        System.out.print("Final Linked list: ");
        linkedlist.insertAfter(2, 21);
        linkedlist.printList();
    }
}
