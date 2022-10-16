public class Main {
    public static void main(String[] args) {
        // singly linked list
      LinkedList list = new LinkedList();
      list.insertFirst(1);
      list.insertFirst(5);
      list.insertFirst(8);
      list.insertFirst(10);;

      list.insertLast(55);
      list.insertLast(89);
      list.insertLast(69);
      list.insert(50,5);
      list.insert(75,2);
      list.display();

      System.out.println(list.delete(5));
      list.display();
        // 
    }


}
