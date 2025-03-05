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
        System.out.println("The size of this LinkedList is : " + size);
    }

    public void append(String value) {
        Node newNode = new Node(value);
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

    public void prepend(String value) {
        Node newNode = new Node(value);

        if (size == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }

        size++;
    }

    public Node removeFirst() {
        if (size == 0) return null;

        Node removedNode = head;
        head = head.getNext();
        removedNode.setNext(null);
        size--;

        if (size == 0) {
            tail = null;
        }
        return removedNode;
    }

    public Node get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }

        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }

        return temp;

        // old solution

//        int count = 0;
//        Node current = this.head;
//
//        while (current != null) {
//            if (index == count) {
//                return current;
//            } else {
//                current = current.getNext();
//                count++;
//            }
//        }
//        return null;
    }

    public boolean set(int index, String value) {

        Node temp = get(index);

        if (temp == null) {
            return false;
        }
        temp.setData(value);
        return true;


        // Other Solution
//        if (index < 0 || index >= size) {
//            return false;
//        }
//        Node temp = head;
//        for (int i = 0; i < index; i++) {
//            temp = temp.getNext();
//        }
//        temp.setData(value);
//        return true;
    }

    public boolean insert(int index, String value) {
        if (index < 0 || index > size) return false;

        if (index == 0) {
            prepend(value);
            return true;
        } else if (index == size) {
            append(value);
            return true;
        } else {
            Node newNode = new Node(value);
            Node temp = get(index - 1);

            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
            size++;
            return true;
        }
    }

    public Node remove(int index) {
        if (index < 0 || index >= size) return null;

        if (index == 0) {
            return removeFirst();
        } else if (index == size - 1) {
            return removeLats();
        } else {
            Node removedItem = get(index);
            Node temp = get(index - 1);

            temp.setNext(removedItem.getNext());
            removedItem.setNext(null);
            size--;
            return removedItem;
        }

    }


    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;

        Node after = temp.getNext();
        Node before = null;

        for (int i = 0; i < size; i++) {
            after = temp.getNext();
            temp.setNext(before);
            before = temp;
            temp = after;
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
