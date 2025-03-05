package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList("Nasser");


        linkedList.append("Khalid");
        linkedList.append("Naif");
//        linkedList.print();
//
//        System.out.println("Head : " + linkedList.getHead());
//        System.out.println("Tail : " + linkedList.getTail());
//        System.out.println("Size : " + linkedList.getSize());


//        // remove last item in linked list with 2 items
//        System.out.println("############ remove last item in linked list of 2 item ############");
//        System.out.println("removed item is : " + linkedList.removeLats().getData());
//
//
//        // remove last item in linked list with 1 items
//        System.out.println("############ remove last item in linked list of 1 item ############");
//        System.out.println("removed item is : " + linkedList.removeLats().getData());
//
//
//        // remove last item in linked list with 0 items
//        System.out.println("############ remove last item in linked list of 0 item ############");
//        System.out.println("removed item is : " + linkedList.removeLats());


        // prePend method
//
//        linkedList.prepend("Ahmed");
//        linkedList.print();

        // removed first Item
//        System.out.println("Removed first item: " + linkedList.removeFirst().getData());
//        linkedList.print();

        // get item by index
//        System.out.println("get item by index 1: " + linkedList.get(1).getData());

        // set value in item with specific index
//        System.out.println("Linked List Before set new value in index 1");
//        linkedList.print();
//        System.out.println("The value changed ? :" + linkedList.set(1, "Mohammed"));
//        System.out.println("Linked List After set new value in index 1");
//        linkedList.print();


        // insert a new Node in the LinkedList
//        System.out.println("Linked List Before insert new Node in index 1");
//        linkedList.print();
//        System.out.println("The value changed ? :" + linkedList.insert(1, "Mohammed"));
//        System.out.println("Linked List After insert new Node in index 1");
//        linkedList.print();


        // Remove by index
//        System.out.println("Linked List Before remove Node in index 1");
//        linkedList.print();
//        System.out.println("The value that removed ? : " + linkedList.remove(1).getData());
//        System.out.println("Linked List After remove Node in index 1");
//        linkedList.print();


        // Reverse LinkedList
        System.out.println("Linked List Before reverse");
        linkedList.print();
        linkedList.reverse();
        System.out.println("Linked List After reverse");
        linkedList.print();


    }
}