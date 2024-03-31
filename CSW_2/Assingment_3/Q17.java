import java.util.ArrayList;
import java.util.List;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }
    
    public void add(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(data);
        }
    }

    public int get(int index) {
        if (head == null) {
            throw new ArrayIndexOutOfBoundsException("LinkedList is empty.");
        }

        Node current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                return current.data;
            }
            current = current.next;
            count++;
        }

        throw new ArrayIndexOutOfBoundsException("Index out of bounds.");
    }

    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}

public class Q17 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();

        l.add(10);
        l.add(20);
        l.add(30);

        try {
            int element1 = l.get(3);
            System.out.println("Element at index 3: " + element1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Size of linked list: " + l.size());
    }
}
