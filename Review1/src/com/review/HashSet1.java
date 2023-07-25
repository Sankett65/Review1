package com.review;

import java.util.ArrayList;
import java.util.HashSet;



//   Convert HashSet to ArrayList in java

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println("HashSet: "+set);
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(set);
        System.out.println("ArrayList: "+list);
    }
}
