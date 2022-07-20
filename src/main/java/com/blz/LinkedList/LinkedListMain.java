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
    }
            MyNode<Integer> firstNode = new MyNode<Integer>(56);
            MyNode<Integer> secondNode = new MyNode<Integer>(30);
            MyNode<Integer> thirdNode = new MyNode<Integer>(70);
            LinkList myLinkedList = new LinkList();
            myLinkedList.addNode(firstNode);
            myLinkedList.append(thirdNode);
            System.out.println("Inserting 30 between 56 and 70");
            myLinkedList.insert(firstNode, secondNode);
            myLinkedList.display();*/

            /* INode deletedNode = myLinkedList.deleteFirst();
             System.out.println("The deleted key value is:"+deletedNode.getKey());
             System.out.println("Final linked list is:");
             myLinkedList.display();*/

             /*deletedNode = myLinkedList.deleteLastNode();
            System.out.println("The deleted key value is:"+deletedNode.getKey());
            myLinkedList.display();

        MyNode searchedKey = myLinkedList.search(56);
        if(searchedKey.getKey().equals(56)) {
            System.out.println("Key Found");
        }
        else {
            System.out.println("Key Not Found");
        }
        myLinkedList.display();*/
        MyNode<Integer> firstNode = new MyNode<Integer>(56);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(70);
        MyNode<Integer> nodeToBeInserted = new MyNode<Integer>(40);
        int valueOfPreviousNode = 30;
        LinkList myLinkedList = new LinkList();
        myLinkedList.addNode(firstNode);
        myLinkedList.append(thirdNode);
        myLinkedList.insert(firstNode, secondNode);
        myLinkedList.insertWithKey(valueOfPreviousNode, nodeToBeInserted);
        myLinkedList.display();

    }
}



