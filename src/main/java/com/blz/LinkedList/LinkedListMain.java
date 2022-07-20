package com.blz.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
       System.out.println("----- Welcome to Data Structure: Linked List -----");
        /*System.out.println("Linked list 1 using add");
        MyNode<Integer> firstNode = new MyNode<Integer>(70);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(56);
        LinkList myLinkedList = new LinkList();
        myLinkedList.addNode(firstNode);
        myLinkedList.addNode(secondNode);
        myLinkedList.addNode(thirdNode);
        myLinkedList.display();*/

       /* System.out.println("Linked list 1 using append");
        MyNode<Integer> Node1 = new MyNode<Integer>(56);
        MyNode<Integer> Node2 = new MyNode<Integer>(30);
        MyNode<Integer> Node3 = new MyNode<Integer>(70);
        LinkList myLinkedList1 = new LinkList();
        myLinkedList1.append(Node1);
        myLinkedList1.append(Node2);
        myLinkedList1.append(Node3);
        myLinkedList1.display();
    }*/
            MyNode<Integer> firstNode = new MyNode<Integer>(56);
            MyNode<Integer> secondNode = new MyNode<Integer>(30);
            MyNode<Integer> thirdNode = new MyNode<Integer>(70);
            LinkList myLinkedList = new LinkList();
            myLinkedList.addNode(firstNode);
            myLinkedList.append(thirdNode);
            System.out.println("Inserting 30 between 56 and 70");
            myLinkedList.insert(firstNode, secondNode);
            myLinkedList.display();

        }
    }
