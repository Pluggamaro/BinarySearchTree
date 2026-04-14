# Binary Search Tree — Java

A Java implementation of a **Binary Search Tree (BST)** that demonstrates the core operations used with this fundamental data structure: insertion, search, deletion, and three classic node-traversal strategies.

---

## Table of Contents

- [Project Overview](#project-overview)
- [Key Features](#key-features)
- [Project Structure](#project-structure)
- [Compilation & Execution](#compilation--execution)
- [Usage Examples](#usage-examples)
- [Time Complexity](#time-complexity)
- [Contributing](#contributing)
- [License](#license)

---

## Project Overview

A **Binary Search Tree** is a node-based data structure where each node stores a value and has at most two children — a *left* child and a *right* child — satisfying the BST property:

> All values in the **left** subtree of a node are **less than** the node's value, and all values in the **right** subtree are **greater than** the node's value.

This property allows efficient searching, insertion, and deletion in **O(log n)** time on average, making BSTs a foundational building block in many algorithms and software systems.

This project uses Java **generics** (`<T extends Comparable<T>>`), so the tree works with any `Comparable` type — `Integer`, `String`, `Double`, etc.

---

## Key Features

| Feature | Description |
|---|---|
| **Insertion** | Recursively places a new value in the correct BST position |
| **Search** | Recursively locates a value and returns a boolean result |
| **Deletion** | Handles all three cases: leaf node, one child, two children (in-order successor) |
| **In-Order Traversal** | Visits nodes Left → Root → Right, producing sorted output |
| **Pre-Order Traversal** | Visits nodes Root → Left → Right |
| **Post-Order Traversal** | Visits nodes Left → Right → Root |
| **Generic type support** | Works with any `Comparable` type, not just integers |

---

## Project Structure

```
BinarySearchTree/
├── src/
│   ├── TreeNode.java          # Generic node class (data, left, right)
│   ├── BinarySearchTree.java  # BST class with all operations
│   └── App.java               # Entry point — demo program
├── bin/                       # Compiled .class files (generated)
└── README.md
```

### Class Descriptions

#### `TreeNode<T>`
Represents a single node in the tree. Holds a generic `data` value and references to `left` and `right` child nodes.

#### `BinarySearchTree<T extends Comparable<T>>`
Contains the full BST implementation:
- `insert(T data)` — adds a value to the tree
- `search(T data)` — returns `true` if the value exists
- `delete(T data)` — removes a value, preserving BST structure
- `inOrder()` — prints sorted output (Left → Root → Right)
- `preOrder()` — prints Root → Left → Right
- `postOrder()` — prints Left → Right → Root

#### `App`
The main entry point. Builds a sample tree, demonstrates all operations, and prints results to the console.

---

## Compilation & Execution

**Requirements:** Java Development Kit (JDK) 8 or higher.

### Using the command line

```bash
# Navigate to the project root
cd BinarySearchTree

# Compile all source files into the bin/ directory
javac -d bin src/TreeNode.java src/BinarySearchTree.java src/App.java

# Run the program
java -cp bin App
```

### Using VS Code

Open the project in VS Code with the [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack) installed, then press **F5** or click **Run** above the `main` method in `App.java`.

---

## Usage Examples

### Building and traversing a tree

```java
// Create a BST of integers
BinarySearchTree<Integer> bst = new BinarySearchTree<>();

// Insert values
bst.insert(50);
bst.insert(30);
bst.insert(70);
bst.insert(20);
bst.insert(40);
bst.insert(60);
bst.insert(80);

// The resulting tree:
//        50
//       /  \
//      30   70
//     / \  / \
//    20 40 60 80

bst.inOrder();    // Orderly: 20 30 40 50 60 70 80
bst.preOrder();   // Pre-Order: 50 30 20 40 70 60 80
bst.postOrder();  // Post-Order: 20 40 30 60 80 70 50
```

### Searching

```java
bst.search(40);  // true  — value exists
bst.search(90);  // false — value does not exist
```

### Deletion

```java
bst.delete(20);  // Remove a leaf node
bst.delete(50);  // Remove the root (replaced by in-order successor: 60)
```

### Expected console output (from `App.java`)

```
****************BINARY SEARCH TREE****************
========Node INSERTION========
Orderly: 20 30 40 50 60 70 80
========Searching TREE========
Search 40 :FOUND!
Search 90 :NOT FOUND!
========Delete NODES========
Deleting 20...
Orderly: 30 40 50 60 70 80
====DELETE ROOT====
Deleting 50...
Orderly: 30 40 60 70 80
========PRE-ORDER========
Pre-Order: 60 30 40 70 80
========POST-ORDER========
Post-Order: 40 30 80 70 60
```

### Using a different type (e.g. String)

```java
BinarySearchTree<String> stringBst = new BinarySearchTree<>();
stringBst.insert("mango");
stringBst.insert("apple");
stringBst.insert("orange");
stringBst.inOrder();  // Orderly: apple mango orange
```

---

## Time Complexity

| Operation | Average Case | Worst Case (skewed tree) |
|---|---|---|
| Insert | O(log n) | O(n) |
| Search | O(log n) | O(n) |
| Delete | O(log n) | O(n) |
| In-Order Traversal | O(n) | O(n) |
| Pre-Order Traversal | O(n) | O(n) |
| Post-Order Traversal | O(n) | O(n) |

> **Note:** The worst case O(n) occurs when the tree becomes a linked list (e.g. inserting already-sorted data). Self-balancing trees such as AVL or Red-Black trees avoid this by maintaining balance automatically.

**Space Complexity:** O(n) for storing n nodes; O(h) auxiliary stack space for recursive operations where h is the tree height.

---

## Contributing

Contributions are welcome! To contribute:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/your-feature`)
3. Commit your changes (`git commit -m 'Add your feature'`)
4. Push to the branch (`git push origin feature/your-feature`)
5. Open a Pull Request

Ideas for contributions:
- Add a **level-order (BFS)** traversal
- Implement a `getHeight()` method
- Add a `getMin()` / `getMax()` utility
- Write unit tests with JUnit

---

## License

This project is open source and available under the [MIT License](LICENSE).
