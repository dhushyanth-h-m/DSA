import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

public class LinkedLists {
    
    private Node head;
    
    private class Node {
        int data; //value that's storedi in a node
        Node next; //
        
        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return;
    }

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        else{
            Node currentNode = head;
            while(currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            return;
        }
    } 

    public void deleteNode(int position){
        int count = 1;
        Node currentNode = head;
        Node previousNode = head;
        if(position == 1){
            head = head.next;
            return;
        }
        while(count < position){
            previousNode = currentNode;
            currentNode = currentNode.next;
            count++;
        }
        if(count == position){
            previousNode.next = currentNode.next;
            return;
        }
    }

    public void printList(){
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data+" ");
            currentNode = currentNode.next;
        };
        System.out.println();
    }

    public static void main(String[] args){
        LinkedLists linkedlist = new LinkedLists();

        linkedlist.insertAtBeginning(23);
        linkedlist.insertAtEnd(34);
        linkedlist.insertAtBeginning(12);

        linkedlist.printList();

        linkedlist.deleteNode(2);
        
        linkedlist.printList();
    }


}
