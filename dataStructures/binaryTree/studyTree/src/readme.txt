### Understanding Java Tree API's

A tree is a non-linear data structure where objects are organized in terms of hierarchical relationship.

The structure is a non-linear in the sense that, unlike simple array and linked list implementation,
data in a tree is not organized linearly. Each data element is stored in a structure called a node.

The topmost or starting node of the inverted tree is called the root node. All nodes are linked with an edge and form hierarchical
sub tress beginning with root node. Tree data structure is useful on occasions where linear representation of data do not suffice, such
as creating a family tree. Java provides two in-built classes, TreeSet and TreeMap, in Java Collection Framework that cater to the needs of the
programmer to describe data elements in the aforesaid form.


## Tree

Java tree classes are actual implementation of a specific variety of the tree data structure. Therefore, before going into details
of its usage, we must have some idea of its organization.

A tree, T, by definition is a non-empty set of elements where one of these elements is called root, and
the remaining elements(which may or may not be present in case of an empty tree rhyming with empty set of Set Theory) are
partitioned further into sub trees of T

For example, think of the hierarchical relationship in the following family tree


The link between two nodes are called edge.

Some of the common binary tree types are termed as full-binary tree, complete-binary tree, binary search tree(BST),
height balance tree(AVL), red-black tree and so on.

## Red and Black Tree

Java tree application programming interface(API) implementation is an instance of this data structure. There is a reason
for Java API designers called this binary tree scheme. The reason is that it is one of the many balanced search tree schemes
that guarantees basic dynamic set of operation to complete in  0(log2n) times even in worst cases.


The properties of the red-black tree schemes are as follows:

- The red-black tree keeps one extra bit of information per node to denote its color, red or black
- The root is always black
- the leaf is black
- both the children of a red node must be black
- For each node, all simple paths from node to descendant leaves contain the same number of black nodes



Therefore the implementation must ascertain that these properties are maintained at any instance of time,
especially during INSERTION and DELETION of a node. And, to keep it intact dynamically, subtrees are rotated left or right
with intricate logic.

Java Tree APIs

When using the Java API library, fortunately or unfortunately we do not have to deal with the low-level complex implementation
logic of the red-black tree. Instead we can focus on solving the problem at hand rather than implementing the scheme from scratch
Just import the relevant package and create an instance of the ready-made tree classes available.  That is all we need to do.


As mentioned earlier, there are two variety of tree implementation in Java collection framework
One is TreeSet and another is TreeMap. They are defined in the java.util.package as follows.




Sources: Understanding Java Tree API's

The topmost node is called root of the tree. The elements that are directly under an element are called it children.
The element directly above something else is called it parent.

Why Trees?

1. One of the reasons to use trees might be because you want to store information that naturally forms a hierarchy.
For example, the file system on a computer:

file system
-----------
     /
/        \
...      homes
      /         \
ugrad          course
/            /      |     \
...         cs101 cs112   cs113


2. Tree provide moderate access/search(quicker than LinkedList and slower than arrays)
3. Tree provide moderate insertion/deletion(quicker than Arrays and slower than Unordered LinkedList )
4. Like LinkedList and unlike Arrays, trees don't have an upper limit on number of nodes as nodes are linked with pointers



Main Application of tress include
1. Manipulate hierarchical data
2. Make information easy to search ( see tree traversal)
3. Manipulate sorted list of data
4. As a workflow for composting digital images for visual effects
5. Router Algorithms
6. Form of a multi-stage decision-making(see business chess)




Binary Tree

In a binary tree, a node can have maximum two children. Consider the left skewed binary tree shown in Figure 1

- Searching: For searching element 2, we have to traverse all elements.(assuming we do breadth first traversal).
Therefor, searching in binary tree has worst case complexity of O(n)

- Insertion: For inserting element as left child of 2, we have to traverse all elements. Therefore, insertion in binary
has worst case complexity of O(n)

- Deletion: For deletion of element 2, we have traverse all elements to find 2(assuming we do breadth first traversal).
Therefore, deletion in binary tree has worst case complexity of O(n)







Binary Search Tree



BST is a special type of binary tree in which left child of a node has value less than the parent and right child has value
greater than parent. Consider the left skewed BST shown in Figure 2



Height Balanced Tree

AVL tree is binary search tree with additional property that difference between height of left sub-tree and right sub-tree
of any node can't be more than 1. For example, BST shown in Figure 2 is not AVL as difference between left sub-tree and right
sub-tree of node of 3 is 2




# Insertion Elements

The first operation we're going to cover is the insertion of new nodes.

First, we have to find the place where we want to add a new node in order to keep the tree-sorted.
We'll follow these rules starting from the root node.


- if the new node's value is lower than the current node's, we go to the left child
- if the new node's value is greater than the current node's we go to the right child
- when the current node is null, we've reached a leaf node and we can insert the new node in that position.


First we'll create recursive method to do insertion.
