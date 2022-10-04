public class CustomList{
  stativ class Node{
   Node next;
    int data;
    Node(int data){
     this.data = data;
      this.next = null;
    }
  }
  
  Node head;
  
  //add node at the begening of the list
  static void addFirst(int data){
   if(had == null) {
    Node temp = new Node(data);
     head = temp;
     temp = head;
   }
    
    Node temp = new Node(data);
    temp.next = head;
    head = temp;
  }
  
  //add node the the middle of any two nodes
  static void addMid(int data, Node prev){
   if(head == null) return;
    if(head.next == null) return;
    
    Node newNode = new Node(data);
    newNode.next = prev.next.next;
    prev.next = newNode;
  }
  
  //add node at the last of list
  static void addLast(int data){
    Node temp = head;
  Node newNode = new Node(data);
   if(head == null) return;
   while(temp.next != null){
     temp = temp.next;
   }
    temp.next.next = newNode;
  }
  
  
  //count the size of list/ no. of nodes in a list
  static int count(){
    int count = 0;
    Node tmp = head;
    while(tmp != null){
      count++;
      tmp = tmp.next;
    }
    return count;
  }
    
}
