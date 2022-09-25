package com.practice.class_object_project;

import java.util.*;

public class JavaCollection {
    public static void main(String args[]) {
        String[] studentName = new String[3];
        studentName[0] = "samrat";
        studentName[1] = "shanto";

        //JAVA Collections
        //ArrayList
        List<String> list1 = new ArrayList<>();

        list1.add("abc");
        list1.add("bcd");
        list1.add("cde");
        list1.add("cde");
        list1.add("cde");

        list1.get(3);//get value of index 3
        System.out.println(list1.contains("abc")); //returns bool value

        list1.remove(String.valueOf("abc")); //remove
        list1.remove(2); //remove using index

        //iterator
        Iterator<String> it = list1.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println(list1.size());

        //LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("lined1");
        linkedList.add("lined2");
        linkedList.add("lined3");
        linkedList.add("lined3");
        linkedList.add("lined3");

        Iterator<String> it1 = linkedList.iterator();

        while (it1.hasNext()) {
            System.out.println("LinkedList: " + it1.next());
        }

        System.out.println(linkedList.size());


        //Vector which have many extra methods
        Vector<Integer> v = new Vector<Integer>();
        v.add(2);
        v.add(4);
        v.add(25);
        v.add(267);
        v.add(1);

        //sorting
        // v.sort();
        System.out.println("Vector: ");
        Iterator<Integer> it3 = v.iterator();
        while (it3.hasNext()) {
            System.out.println(it3.next());
        }


        //stack
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(4);
        stack.push(3);
        stack.push(23);
        stack.push(5);
        stack.add(30);
        stack.add(304);
        stack.add(300);
        stack.pop();

        Iterator<Integer> it4 = stack.iterator();
        while (it4.hasNext()) {
            System.out.println("stack: " + it4.next());
        }


        //queue
        // priority queue
        //PriorityQueue doesn't allow null values to be stored in the queue.

        PriorityQueue<Integer> pq = new PriorityQueue<>();  //min heap priority
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder()); //max heap priority

        pq.add(3);
        pq.add(13);
        pq.offer(32);
        pq.offer(34);

        // The poll() method does not throw an exception when the Queue is empty, it returns null instead
        pq.poll();  //remove
        pq.remove(); //remove

        System.out.println("The top of the priority queue: " + pq.element()); // throw an exception

        System.out.println("PQ Size: " + pq.size());

        for (Integer i : pq) System.out.println(i);

        //ArrayDeque
        //add or delete the elements from both the ends.
        //ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions.
        Deque<String> dq = new ArrayDeque<>();
        dq.add("abc"); //add throw exception
        dq.add("abc");
        dq.offer("abc2"); //offer doesn't throw exception
        dq.offer("abc3");
        dq.offerFirst("first");
        dq.offerLast("last");

        dq.pollFirst();  //remove first
        dq.poll();
        dq.pollLast();

        for (String st : dq) System.out.println("ArrayDeque: " + st);
        System.out.println("Top of the ArrayQueue: " + dq.peek());  //return null if empty && doesn't throw exception


        //set--- HashSet---unordered---O(1)
        Set<String> set = new HashSet<>();
        System.out.println(set.isEmpty());  //is empty?
        set.add("sas");
        set.add("sas"); //do not store duplicate values
        set.add("sas2");
        set.add("sas4");
        set.add("sas45");

        for (String st : set) System.out.println("HashSet: " + st);
        set.clear();//clear all


        //set ----LinkedHashSet ----ordered
        Set<String> set1 = new LinkedHashSet<>();
        set1.add("sas");
        set1.add("sas"); //do not store duplicate values
        set1.add("sas2");
        set1.add("sas4");
        set1.add("sas45");
        System.out.println("LinkedHashSet: " + set1);

        //set---TreeSet---Sorted && ordered---O(log n)
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(4);
        treeSet.add(400);
        treeSet.add(4);
        treeSet.add(2);
        treeSet.add(40);

        System.out.println("TreeSet: " + treeSet);


        //Students Class
        Set<Students> students = new HashSet<>();
        students.add(new Students(1, "sas"));
        students.add(new Students(2, "sas2"));
        students.add(new Students(3, "sas3"));
        students.add(new Students(3, "sas3"));

        System.out.println(students);

        //checks using equal function
        Students s1 = new Students(1, "abc");
        Students s2 = new Students(2, "abc");
        System.out.println(s1.equals(s2));

    }
}
