package com.netcracker.task2;

import java.util.*;

public class ExecutionTime {
    public static long addTime (Collection<Integer> collection, int n) {
    long start = System.nanoTime();
    for(int i = 0; i < n; i++){
        collection.add(collection.size()+i);
    }
    long finish = System.nanoTime();
    return finish - start;
}

    public static long insertTime (List<Integer> list, int n) {
        int size = list.size();
        long start = System.nanoTime();
        list.add(list.size());
        long finish = System.nanoTime();
        return finish - start;
    }

    public static long indexOfTime (List<Integer> list, Integer elem){
        int index = -1;
        long start = System.nanoTime();
        index = list.indexOf(elem);
        long endTime = System.nanoTime();
        return endTime - start;
    }

    public static long removeTime(List<Integer> list, int index) {
        Integer deleted;
        long start = System.nanoTime();
        deleted = list.remove(index);
        long finish = System.nanoTime();
        return finish - start;
    }

    public static long searchTime(Set<Integer> set, Integer elem) {
        long start = System.nanoTime();
        set.contains(elem);
        long finish = System.nanoTime();
        return finish - start;
    }

    public static long removeTime(Set<Integer> set, Integer elem) {
        long startTime = System.nanoTime();
        set.remove(elem);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long addTime(Map<Integer, Integer> map, int n){
        long start = System.nanoTime();
        for (int i = 0; i < n; i++)
            map.put(map.size()+i, map.size()+i);
        long finish = System.nanoTime();
        return finish - start;
    }

    public static long searchTime(Map<Integer,Integer> map, int key){
        long start = System.nanoTime();
        map.containsKey(key);
        long finish = System.nanoTime();
        return finish - start;
    }

    public static long removeTime(Map<Integer, Integer> map, int index){
        long start = System.nanoTime();
        map.remove(index);
        long finish = System.nanoTime();
        return finish - start;
    }
}
