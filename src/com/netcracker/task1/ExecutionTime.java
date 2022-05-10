package com.netcracker.task1;

import java.util.LinkedList;

public class ExecutionTime {

    static long addTime (MyLinkedList<Integer> list, int n) {
        long start = System.nanoTime();
        for(int i = 0; i < n; i++){
            list.add(i);
        }
        long finish = System.nanoTime();
        return finish - start;
    }

    static long addTime (LinkedList<Integer> list, int n) {
        long start = System.nanoTime();
        for(int i = 0; i < n; i++){
            list.add(i);
        }
        long finish = System.nanoTime();
        return finish - start;
    }

    static long indexOfTime (MyLinkedList<Integer> list, Integer elem){
        int index = -1;
        long start = System.nanoTime();
        index = list.indexOf(elem);
        long finish = System.nanoTime();
        return finish - start;
    }

    static long indexOfTime (LinkedList<Integer> list, Integer elem){
        int index = -1;
        long start = System.nanoTime();
        index = list.indexOf(elem);
        long finish = System.nanoTime();
        return finish - start;
    }

    static long removeTime(MyLinkedList<Integer> list, int index) {
        Integer deleted;
        long start = System.nanoTime();
        deleted = list.remove(index);
        long finish = System.nanoTime();
        return finish - start;
    }

    static long removeTime(LinkedList<Integer> list, int index) {
        Integer deleted;
        long start = System.nanoTime();
        deleted = list.remove(index);
        long finish = System.nanoTime();
        return finish - start;
    }
}
