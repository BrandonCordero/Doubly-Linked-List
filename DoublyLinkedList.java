public class DoublyLinkedList
{
  // properties
  Node head;
  Node tail;

  // Constructors
  DoublyLinkedList() { 
    this.head = null;
    this.tail = null;
  }
  // getters and setters
   public Node getHead() {
    return this.head;
  }
  public Node getTail() {
    return this.tail;
  }
  public void setHead(Node newHead) {
    if (this.head == this.tail)
      this.tail = newHead;
    this.head = newHead;
  }
  public void setTail(Node newTail) {
    if (this.head == this.tail)
      this.head = newTail;
    this.tail = newTail;
  }
  
}
 
 
  