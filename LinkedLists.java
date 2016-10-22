public class LinkedLists {
  public static void main (String [] args) {
    DoublyLinkedList myList = new DoublyLinkedList();
    
    myList.addData("Brandon");
    myList.addData("Irene");
    myList.addData("Martin");
    myList.addData("Emily");
    myList.addData("Alec");
    myList.print();
    myList.printReverse();
  }
}
