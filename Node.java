 public class Node {
  // properties
  private String data;
  private Node prev;
  private Node next;

  // Constructors
  Node(String d) { 
    this.data = d; 
    this.next = null;
    this.prev = null;
  }
  public String getData(){
    return this.data;
  }
  
  public Node getPrev(){
    return this.prev;
  }
  
  public Node getNext() {
    return this.next;
  }
  
  public void setData(String newData) {
    this.data = newData;
  }
  
  public void setPrev(Node newPrev) {
    this.prev = newPrev;
  }
  
  public void setNext(Node newNext) {
    this.next = newNext;
  }
 }