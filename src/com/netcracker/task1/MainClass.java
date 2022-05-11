package com.netcracker.task1;

import java.util.LinkedList;

public class MainClass {
    public static void main(String[] args) {
        // Односвязный
        MySinglyLinkedList<Integer> mySinglyLinkedList = new MySinglyLinkedList<>();
        System.out.println(mySinglyLinkedList);
        mySinglyLinkedList.add(1);
        System.out.println(mySinglyLinkedList);
        mySinglyLinkedList.add(2, 3);
        mySinglyLinkedList.add(1, 5);
        System.out.println(mySinglyLinkedList);
        System.out.println("Remove index 0: " + mySinglyLinkedList.remove(0));
        System.out.println(mySinglyLinkedList);
        mySinglyLinkedList.add(4);
        mySinglyLinkedList.add(7);
        mySinglyLinkedList.add(2, 8);
        mySinglyLinkedList.add(5);
        System.out.println(mySinglyLinkedList);
        System.out.println("Remove index 4: " + mySinglyLinkedList.remove(4));
        System.out.println(mySinglyLinkedList);
        System.out.println("Index (elem 4): " + mySinglyLinkedList.indexOf(4));
        System.out.println(mySinglyLinkedList);
        System.out.println("Set index 2: " + mySinglyLinkedList.set(2, 9));
        System.out.println(mySinglyLinkedList);
        System.out.println("List:");
        for (Integer in: mySinglyLinkedList)
            System.out.println(in);
        mySinglyLinkedList.clear();
        System.out.println(mySinglyLinkedList);
        System.out.println("___________________________________________");

        // Двусвязный
        MyLinkedList<Integer> myList = new MyLinkedList<Integer>();
        System.out.println(myList);
        myList.add(1);
        System.out.println(myList);
        myList.add(2, 3);
        myList.add(1, 5);
        System.out.println(myList);
        System.out.println("Remove index 0: " + myList.remove(0));
        System.out.println(myList);
        myList.add(4);
        myList.add(7);
        myList.add(2, 8);
        myList.add(5);
        System.out.println(myList);
        System.out.println("Remove index 4: " + myList.remove(4));
        System.out.println("Index (elem 4): " + myList.indexOf(4));
        System.out.println(myList);
        System.out.println("Set index 2: " + myList.set(2, 9));
        System.out.println(myList);
        System.out.println("List:");
        for (Integer in: myList)
            System.out.println(in);
        myList.clear();
        System.out.println(myList);
        System.out.println("___________________________________________");
        // Сравнение

        MyLinkedList<Integer> myList1 = new MyLinkedList<Integer>();
        LinkedList<Integer> list = new LinkedList<Integer>();

        for (int i = 0; i < 50000; i++) {
            myList.add(i);
            list.add(i);
        }

        System.out.println("Add into MyLinkedList: " + ExecutionTime.addTime(myList1, 1000));
        System.out.println("Add into LinkedList: " + ExecutionTime.addTime(list, 1000));
        System.out.println("_________________________________________");
        System.out.println("Search MyLinkedList: " + ExecutionTime.indexOfTime(myList1, 150));
        System.out.println("Search LinkedList: " + ExecutionTime.indexOfTime(list, 150));
        System.out.println("_________________________________________");
        System.out.println("Remove MyLinkedList: " + ExecutionTime.removeTime(myList1, 150));
        System.out.println("Remove LinkedList: " + ExecutionTime.removeTime(list, 150));

    }
}
