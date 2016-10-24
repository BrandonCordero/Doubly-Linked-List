public class LinkedLists {
  public static void main (String [] args) {
    DoublyLinkedList myList = new DoublyLinkedList();
    
    myList.addData("Brandon");
    myList.addData("Irene");
    myList.addData("Martin");
    myList.addData("Emily");
    myList.addData("Alec");
    System.out.println("Current List");
    myList.print();
    System.out.println("List in reverse");
    myList.printReverse();
    System.out.println(" Deletes node from list");
     myList.deleteNode("Emily");
    myList.print();
  }
}
