package Lab03_27Subat;

public class LinkedList<T> {

    private Node<T> head;

    void addFirst(Node<T> newNode) {
        newNode.nextNode = head;
        head = newNode;
    }

    void addFirst(T newData) {
        addFirst(new Node<>(newData));
    }

    void addLast(Node<T> newNode) {
        if (isEmpty()) {
            head = newNode;
        } else {
            Node<T> temp = head;
            while (temp.nextNode != null) {
                temp = temp.nextNode;
            }
            temp.nextNode = newNode;
        }
    }

    void addLast(T newData) {
        addLast(new Node<>(newData));
    }

    boolean addAfter(T search, T newData) {
        if (isEmpty()) {
            System.out.println("Empty List !!");
        } else {
            Node<T> temp = head;
            while (temp != null && !temp.data.equals(search)) {
                temp = temp.nextNode;
            }

            if (temp != null) {
                Node<T> newNode = new Node<>(newData);
                newNode.nextNode = temp.nextNode;
                temp.nextNode = newNode;
                return true;
            }
        }
        return false;
    }

    Node<T> remove(T data) {
        Node<T> removedNode = null;
        if (isEmpty()) {
            System.out.println("Empty list !!");
        } else {

            if (head.data.equals(data)) {
                head = head.nextNode;
            } else {
                Node<T> temp = head;
                while (temp.nextNode != null && !temp.nextNode.data.equals(data)) {
                    temp = temp.nextNode;
                }
                if (temp.nextNode != null) {
                    removedNode = temp.nextNode;
                    temp.nextNode = temp.nextNode.nextNode;
                }
            }
        }
        return removedNode;
    }

    void print() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.nextNode;
        }
        System.out.println("null");
    }

    boolean isEmpty() {
        return head == null;
    }
    
    int size(){
        Node<T> temp = head;
        int count = 0;
        
        while(temp != null){
            count++;
            temp = temp.nextNode;
        }
            
        
        return count;
    }
    
    // max elemen of list
    T maxElement(){
      Node<T> temp = head;
      T max = temp.nextNode.data;
      while(temp != null){
          if (temp.data.hashCode() > max.hashCode()) {
              max = temp.data;
          }
          temp = temp.nextNode;
      }
     
      return max;  
    }
}
