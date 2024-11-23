public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        // Example usage of the LinkedList class
        LinkedList list = new LinkedList();
        list.addAtBeginning(10); // O(1)
        list.addAtBeginning(20); // O(1)
        list.addAtEnd(30);       // O(n)
        list.addAtEnd(40);       // O(n)
        
        list.printList();        // O(n)
        
        list.search(20);         // Searching for a value in the list
        list.search(50);         // Searching for a value not in the list

        list.remove(30);         // Remove a node with value 30
        list.printList();        // O(n)
        
        list.removeAtBeginning(); // Remove the first element
        list.printList();         // O(n)
        
        list.removeAtEnd();      // Remove the last element
        list.printList();        // O(n)
        
        list.reverse();          // Reverse the linked list
        list.printList();        // O(n)
        
        System.out.println("List size: " + list.size()); // Get the size of the list
        System.out.println("Is the list empty? " + list.isEmpty()); // Check if the list is empty
    }
}

class LinkedList {
    Node head;

    // Constructor to initialize an empty linked list
    public LinkedList() {
        head = null;
    }

    // Add a new node at the beginning of the list (O(1))
    public void addAtBeginning(int data) {
        Node newNode = new Node(data); // Create a new node with the given data
        if (head == null) { // If the list is empty
            head = newNode; // Set new node as the head
        } else { // If the list already contains nodes
            newNode.next = head; // Point the new node to the current head
            head = newNode; // Update the head to the new node
        }
    }

    // Add a new node at the end of the list (O(n))
    public void addAtEnd(int data) {
        Node newNode = new Node(data); // Create a new node with the given data
        if (head == null) { // If the list is empty
            head = newNode; // Set new node as the head
        } else {
            Node temp = head; 
            // Traverse the list to find the last node
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode; // Set the next of the last node to the new node
        }
    }

    // Print all elements in the list (O(n))
    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        
        Node current = head; // Start with the head node
        while (current != null) {
            System.out.println(current.data); // Print the current node's data
            current = current.next; // Move to the next node
        }
    }

    // Search for a specific value in the list
    public void search(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == value) { // If the node's data matches the search value
                System.out.println(value + ": Found.");
                return; // Exit the method once the value is found
            }
            temp = temp.next; // Move to the next node
        }
        System.out.println(value + ": Not found.");
    }

    // Remove a node with a specific value (O(n))
    public void remove(int value) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // If the node to be removed is the head node
        if (head.data == value) {
            head = head.next; // Move the head to the next node
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == value) {
                current.next = current.next.next; // Remove the node
                return;
            }
            current = current.next;
        }
        System.out.println(value + ": Not found in the list.");
    }

    // Remove the first node (head) (O(1))
    public void removeAtBeginning() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        head = head.next; // Move the head to the next node
    }

    // Remove the last node (O(n))
    public void removeAtEnd() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // If there's only one node in the list
        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.next != null) {
            temp = temp.next; // Traverse until the second-last node
        }
        temp.next = null; // Remove the last node
    }

    // Reverse the linked list (O(n))
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next; // Store the next node
            current.next = prev; // Reverse the current node's pointer
            prev = current; // Move prev and current one step forward
            current = next;
        }
        head = prev; // Set the new head to the previous node
    }

    // Get the size of the list (O(n))
    public int size() {
        int size = 0;
        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    // Check if the list is empty (O(1))
    public boolean isEmpty() {
        return head == null;
    }
}

// Node class to represent each element in the linked list
class Node {
    int data; // The value stored in the node
    Node next; // The next node in the list

    // Constructor to initialize the node with data
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
