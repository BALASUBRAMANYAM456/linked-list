package com.linkedlist;

public class LinkedList {
    Node head = null;     //inititally we are taking head null

    public static void main(String[] args) {
        //displaying welcome message
        System.out.println("Welcome to linked list ");

        //creating object of linked list class
        LinkedList linkedList = new LinkedList();

        linkedList.addFirst(70);
        linkedList.addFirst(30);
        linkedList.addFirst(56);


        linkedList.print();  //printing linked list elements keys and data
    }

    //uc-2 insert 70,30,56 output-56,30,70
    public <M> void addFirst(M key) {
        Node node = new Node<>(key);    //first adds 70 next overides 70 with 30 and then 56
        node.setKey(key);
        node.setNext(node);
        head = node;
    }

    //PRINTING METHOD FOR LINKED LIST
    public <M> void print() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.key + "-->");    //56-->30-->70-->null
            currentNode = currentNode.next;    //i++ increament method to move to next node2,node3
        }
        System.out.println("null");    //after third node no value will assign and will be equals to null
    }
}
