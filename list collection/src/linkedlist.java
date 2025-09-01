import java.util.Arrays;
import java.util.LinkedList;
import java.util.List.*;
public class linkedlist {
    public static void main(String[] args) {

//        node node1 = new node();
//        node1.value=2;
//        node node2 = new node();
//        node2.value=3;
//        node2.next=null;
//        node1.next=node2;

        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);

        System.out.println(l1.get(2));

        l1.addLast(6);
        l1.addFirst(0);

        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());


        System.out.println(l1);

        LinkedList<String> animal = new LinkedList<>(Arrays.asList("Cat","Dog","elephant"));
        LinkedList<String> animaltoremove = new LinkedList<>(Arrays.asList("Cat","Dog"));
        animal.removeAll(animaltoremove);
        System.out.println(animal);

    }
}
//class node{
//    public int value;
//    public node next;
//}
