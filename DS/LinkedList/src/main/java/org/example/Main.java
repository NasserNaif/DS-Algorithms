package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList("Nasser");


        linkedList.append(new Node("Khalid"));
//        linkedList.print();
//
//        System.out.println("Head : " + linkedList.getHead());
//        System.out.println("Tail : " + linkedList.getTail());
//        System.out.println("Size : " + linkedList.getSize());


        // remove last item in linked list with 2 items
        System.out.println("############ remove last item in linked list of 2 item ############");
        System.out.println("removed item is : " + linkedList.removeLats().getData());


        // remove last item in linked list with 1 items
        System.out.println("############ remove last item in linked list of 1 item ############");
        System.out.println("removed item is : " + linkedList.removeLats().getData());


        // remove last item in linked list with 0 items
        System.out.println("############ remove last item in linked list of 0 item ############");
        System.out.println("removed item is : " + linkedList.removeLats());

    }
}