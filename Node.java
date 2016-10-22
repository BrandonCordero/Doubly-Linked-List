 public class Node {
  // properties
  private int data;
  private Node prev;
  private Node next;

  // Constructors
  Node(int d) { 
    this.data = d; 
    this.next = null;
    this.prev = null;
  }
 }