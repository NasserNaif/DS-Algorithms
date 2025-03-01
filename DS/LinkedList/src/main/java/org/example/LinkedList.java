package org.example;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;


    public LinkedList(String value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.size++;
    }

    // BIG O is : O(n)

    public void print() {
        Node current = this.head;

        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

    public void append(Node newNode) {
        if (size == 0) {
            tail = newNode;
            head = newNode;
        } else {
            newNode.setNext(null);
            tail.setNext(newNode);
            this.tail = newNode;
            this.size++;
        }
    }

    public Node removeLats() {
        if (size == 0) return null;

        else {
            Node temp = head;
            Node pre = head;

            while (temp.getNext() != null) {
                pre = temp;
                temp = temp.getNext();
            }
            tail = pre;
            tail.setNext(null);
            size--;
            if (size == 0) {
                head = null;
                tail = null;
            }
            return temp;

            
//            another solution
//            Node newLastItem = head;
//
//            while (newLastItem.getNext() != null) {
//                if (newLastItem.getNext() == tail) {
//                    newLastItem.setNext(null);
//                    tail = newLastItem;
//                } else {
//                    newLastItem = newLastItem.getNext();
//                }
//            }
//
//            size--;
//            return newLastItem;
        }
    }


    public String getHead() {
        return head.getData();
    }

    public int getSize() {
        return size;
    }

    public String getTail() {
        return tail.getData();
    }
}
