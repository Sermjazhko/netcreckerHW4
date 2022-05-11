package com.netcracker.task2;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 50000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        System.out.println("Add to ArrayList: " + ExecutionTime.addTime(arrayList, 1000));
        System.out.println("Add to LinkedList: " + ExecutionTime.addTime(linkedList, 1000));
        System.out.println("________________________________________");
        System.out.println("Insert to begin of ArrayList: " + ExecutionTime.insertTime(arrayList, 10));
        System.out.println("Insert to begin of LinkedList: " + ExecutionTime.insertTime(linkedList, 10));
        System.out.println("________________________________________");
        System.out.println("Insert into middle of ArrayList: " + ExecutionTime.insertTime(arrayList, arrayList.size() / 2));
        System.out.println("Insert into middle of LinkedList: " + ExecutionTime.insertTime(linkedList, linkedList.size() / 2));
        System.out.println("________________________________________");
        System.out.println("ArrayList Search: " + ExecutionTime.indexOfTime(arrayList, 10));
        System.out.println("LinkedList Search: " + ExecutionTime.indexOfTime(linkedList, 10));
        System.out.println("________________________________________");
        System.out.println("ArrayList Remove from begin: " + ExecutionTime.removeTime(arrayList, 1));
        System.out.println("LinkedList Remove from begin: " + ExecutionTime.removeTime(linkedList, 1));
        System.out.println("________________________________________");
        System.out.println("ArrayList Remove from end: " + ExecutionTime.removeTime(arrayList, arrayList.size() - 2));
        System.out.println("LinkedList Remove from end: " + ExecutionTime.removeTime(linkedList, linkedList.size() - 2));
        System.out.println("________________________________________");

        HashSet<Integer> hashSet = new HashSet<Integer>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
        TreeSet<Integer> treeSet = new TreeSet<Integer>();

        for (int i = 0; i < 50000; i++) {
            hashSet.add(i);
            linkedHashSet.add(i);
            treeSet.add(i);
        }

        System.out.println("Add to HashSet: " + ExecutionTime.addTime(hashSet, 100));
        System.out.println("Add to LinkedHashSet: " + ExecutionTime.addTime(linkedHashSet, 100));
        System.out.println("Add to TreeSet: " + ExecutionTime.addTime(treeSet, 100));
        System.out.println("________________________________________");
        System.out.println("HashSet search: " + ExecutionTime.searchTime(hashSet, 10));
        System.out.println("LinkedHashSet search: " + ExecutionTime.searchTime(linkedHashSet, 10));
        System.out.println("TreeSet search: " + ExecutionTime.searchTime(treeSet, 10));
        System.out.println("________________________________________");
        System.out.println("HashSet remove: " + ExecutionTime.removeTime(hashSet, hashSet.size() / 2));
        System.out.println("LinkedHashSet remove: " + ExecutionTime.removeTime(linkedHashSet, linkedHashSet.size() / 2));
        System.out.println("TreeSet remove: " + ExecutionTime.removeTime(treeSet, treeSet.size() / 2));
        System.out.println("________________________________________");

        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<Integer, Integer>();
        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();

        System.out.println("Add to HashMap: " + ExecutionTime.addTime(hashMap, 10000));
        System.out.println("Add to LinkedHashMap: " + ExecutionTime.addTime(linkedHashMap, 10000));
        System.out.println("Add to TreeMap: " + ExecutionTime.addTime(treeMap, 10000));
        System.out.println("________________________________________");
        System.out.println("HashMap search: " + ExecutionTime.searchTime(hashMap, 20));
        System.out.println("LinkedHashMap search: " + ExecutionTime.searchTime(linkedHashMap, 20));
        System.out.println("TreeMap search: " + ExecutionTime.searchTime(treeMap, 20));
        System.out.println("________________________________________");
        System.out.println("HashMap remove: " + ExecutionTime.removeTime(hashMap, hashMap.size() / 2));
        System.out.println("LinkedHashMap remove: " + ExecutionTime.removeTime(linkedHashMap, linkedHashMap.size() / 2));
        System.out.println("TreeMap remove: " + ExecutionTime.removeTime(treeMap, treeMap.size() / 2));

    }
}
