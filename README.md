Sure! Here's the updated `README.md` reflecting the extended functionality and changes to your `LinkedList` class:

```markdown
# LinkedList Implementation in Java

This project contains a comprehensive implementation of a singly linked list in Java. It includes a variety of operations such as adding nodes at the beginning or end, removing nodes, printing the list, searching for a specific value, reversing the list, and checking the list's properties.

## Features

- **Add nodes at the beginning** (`addAtBeginning`)
- **Add nodes at the end** (`addAtEnd`)
- **Remove nodes by value** (`remove`)
- **Remove the first node** (`removeAtBeginning`)
- **Remove the last node** (`removeAtEnd`)
- **Reverse the list** (`reverse`)
- **Print the entire list** (`printList`)
- **Search for a specific value** (`search`)
- **Get the size of the list** (`size`)
- **Check if the list is empty** (`isEmpty`)

## Time Complexity

- `addAtBeginning`: O(1)
- `addAtEnd`: O(n) (due to traversal)
- `remove`: O(n) (due to traversal)
- `removeAtBeginning`: O(1)
- `removeAtEnd`: O(n) (due to traversal)
- `reverse`: O(n)
- `printList`: O(n)
- `search`: O(n)
- `size`: O(n)
- `isEmpty`: O(1)

## How to Run

### Prerequisites
Make sure you have Java installed. You can download and install the latest version from the official [Java website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

### Running the Program

1. Clone the repository:
   ```bash
   git clone https://github.com/doguhannilt/LinkedListImplementation.git
   ```

2. Navigate to the project folder:
   ```bash
   cd LinkedListImplementation
   ```

3. Compile the Java files:
   ```bash
   javac App.java
   ```

4. Run the program:
   ```bash
   java App
   ```

### Example Output

```text
Hello, World!
20
10
30
40
20: Found.
50: Not found.
List is empty.
List size: 2
Is the list empty? false
```

### Key Updates:
- Updated the **"Features"** section to include the new methods such as `remove`, `removeAtBeginning`, `removeAtEnd`, `reverse`, `size`, and `isEmpty`.
- Adjusted **"Time Complexity"** to reflect the time complexities of the new methods.
- Added example output with new functionalities.
- **"LinkedList Interview Questions"** section remains the same, but can now be more relevant with the added functionality. 

This `README.md` is now a comprehensive guide for your LinkedList project, making it clearer and more informative for anyone who uses or contributes to the project.