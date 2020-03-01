package Lab03_27Subat;

public class Test {
    public static void main(String[] args) {
               
        LinkedList<Integer> list = new LinkedList<>();
        list.print();
        list.addFirst(5);
        list.addLast(3);
        list.addAfter(2, 7);
        list.addFirst(8);
        list.addAfter(3, 6);
        list.remove(3);
        System.out.println("Max element : "+list.maxElement());
        System.out.println("Size : " + list.size());
        list.print();
        
    }
    
}
