public class LinkedList {
    Node head = null;
  
    public class Node {
      Vehicle data;
      Node next;
  
      public Node(Vehicle data) {
        this.data = data;
      }
    }
  
    Node merge(Node left, Node right) {
      Node mergedList = null;
  
      if(left == null) {
        return right;
      }
      if(right == null) {
        return left;
      }
  
      if(left.data.lessThanOrEqualTo(right.data)) {
        mergedList = left;
        mergedList.next = merge(left.next, right);
      } else {
        mergedList = right;
        mergedList.next = merge(left, right.next);
      }
  
      return mergedList;
    }
  
    Node mergeSort(Node head) {
      if(head == null || head.next == null) {
        return head;
      }
  
      Node slow = head;
      Node fast = head;
  
      while(fast.next != null && fast.next.next != null) {
        slow = slow.next;
        fast = fast.next.next;
      }
  
      Node middle = slow;
      Node middleNext = middle.next;
  
      middle.next = null;
  
      Node left = mergeSort(head);
      Node right = mergeSort(middleNext);
  
      return merge(left, right);
    }
  
    void add(Vehicle newVehicle) {
      Node newNode = new Node(newVehicle);
  
      newNode.next = head;
  
      head = newNode;
    }
  
    public void print() {
      Node temp = head;
      
      while(temp != null) {
        System.out.println(temp.data);
        temp = temp.next;
      }
    }
  }
