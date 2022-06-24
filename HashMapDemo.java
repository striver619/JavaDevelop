package com.java.demo;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

    // 7 kinds of ways to iterate HashMap

    // 1. iterator

    // 1.1 iterator EntrySet
    @Test
    public void demo11() {
        Map<Integer,String> map = new HashMap<>();
        // add data
        map.put(1,"hs-1");
        map.put(2,"hs-2");
        map.put(3,"hs-3");
        map.put(4,"hs-4");
        map.put(5,"hs-5");

        Iterator<Map.Entry<Integer,String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,String> next = iterator.next();
            System.out.println(next.getKey() + "," + next.getValue());
        }
        System.out.println("======= demo11 success =======");
    }

    // 1.2 iterator KeySet
    @Test
    public void demo12() {
        Map<Integer,String> map = new HashMap<>();
        // add data
        map.put(1,"hs-1");
        map.put(2,"hs-2");
        map.put(3,"hs-3");
        map.put(4,"hs-4");
        map.put(5,"hs-5");

        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            Integer key = iterator.next();
            System.out.println(key + "," + map.get(key));
        }
        System.out.println("======= demo12 success =======");
    }

    // 2. foreach

    // 2.1 foreach EntrySet
    @Test
    public void demo21() {
        Map<Integer,String> map = new HashMap<>();
        // add data
        map.put(1,"hs-1");
        map.put(2,"hs-2");
        map.put(3,"hs-3");
        map.put(4,"hs-4");
        map.put(5,"hs-5");

        for (Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey() + "," + entry.getValue());
        }
        System.out.println("======= demo21 success =======");
    }

    // 2.2 foreach KeySet
    @Test
    public void demo22() {
        Map<Integer,String> map = new HashMap<>();
        // add data
        map.put(1,"hs-1");
        map.put(2,"hs-2");
        map.put(3,"hs-3");
        map.put(4,"hs-4");
        map.put(5,"hs-5");
        // my favorite way
        for (Integer key : map.keySet()){
            System.out.println(key + "," + map.get(key));
        }
        System.out.println("======= demo22 success =======");
    }

    // 3. lambda
    @Test
    public void demo3() {
        Map<Integer,String> map = new HashMap<>();
        // add data
        map.put(1,"hs-1");
        map.put(2,"hs-2");
        map.put(3,"hs-3");
        map.put(4,"hs-4");
        map.put(5,"hs-5");

        map.forEach((key,value) -> {
            System.out.println(key + "," + value);
        });
        System.out.println("======= demo3 success =======");
    }

    // 4. streams api

    // 4.1 single thread
    @Test
    public void demo41() {
        Map<Integer,String> map = new HashMap<>();
        // add data
        map.put(1,"hs-1");
        map.put(2,"hs-2");
        map.put(3,"hs-3");
        map.put(4,"hs-4");
        map.put(5,"hs-5");

        map.entrySet().stream().forEach((integerStringEntry -> {
            System.out.println(integerStringEntry.getKey() + "," + integerStringEntry.getValue());
        }));
        System.out.println("======= demo41 success =======");
    }

    // 4.2 multi thread
    @Test
    public void demo42() {
        Map<Integer,String> map = new HashMap<>();
        // add data
        map.put(1,"hs-1");
        map.put(2,"hs-2");
        map.put(3,"hs-3");
        map.put(4,"hs-4");
        map.put(5,"hs-5");

        map.entrySet().parallelStream().forEach((integerStringEntry -> {
            System.out.println(integerStringEntry.getKey() + "," + integerStringEntry.getValue());
        }));
        System.out.println("======= demo42 success =======");
    }

}
