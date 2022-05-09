package com.netcracker.task1;

public class MainClass {
    public static void main(String[] args) {
        MyLinkedList<Integer> myList = new MyLinkedList<Integer>();
        System.out.println(myList);
        myList.add(1);
        System.out.println(myList);
        myList.add(4);
        System.out.println(myList);
        myList.add(2, 3);
        myList.add(1, 5);
        System.out.println(myList);
        System.out.println(myList.remove(0));
        System.out.println(myList);

    }
}
