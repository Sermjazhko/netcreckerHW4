package com.netcracker.task1;

import java.util.LinkedList;

public class MainClass {
    public static void main(String[] args) {
        MyLinkedList<Integer> myList = new MyLinkedList<Integer>();
        System.out.println(myList);
        myList.add(1);
        System.out.println(myList);
        myList.add(2, 3);
        myList.add(1, 5);
        System.out.println(myList);
        System.out.println("Remove: " + myList.remove(0));
        System.out.println(myList);
        myList.add(4);
        myList.add(7);
        myList.add(5);
        System.out.println("Index (el 4): " + myList.indexOf(4));
        System.out.println(myList);
        System.out.println("Set 2: " + myList.set(2, 9));
        System.out.println(myList);
        myList.clear();
        System.out.println(myList);


        MyLinkedList<Integer> myList1 = new MyLinkedList<Integer>();
        LinkedList<Integer> list = new LinkedList<Integer>();

        for (int i = 0; i < 100000; i++) {
            myList.add(i);
            list.add(i);
        }

        System.out.println("Add into MyLinkedList: " + ExecutionTime.addTime(myList1, 1000));
        System.out.println("Add into LinkedList: " + ExecutionTime.addTime(list, 1000));
        System.out.println("===========");
        System.out.println("Search MyLinkedList: " + ExecutionTime.indexOfTime(myList1, 150));
        System.out.println("Search LinkedList: " + ExecutionTime.indexOfTime(list, 150));
        System.out.println("===========");
        System.out.println("Remove MyLinkedList: " + ExecutionTime.removeTime(myList1, 150));
        System.out.println("Remove LinkedList: " + ExecutionTime.removeTime(list, 150));

    }
}
