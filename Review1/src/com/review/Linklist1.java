package com.review;

import java.util.ArrayList;
import java.util.LinkedList;



//    Convert LinkedList to ArrayList


public class Linklist1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(2,9);
        System.out.println("LinkList: "+list);
        ArrayList<Integer> list1= new ArrayList<>();
        for (int i =0;i<list.size();i++){
            list1.add(list.get(i));
        }
        System.out.println("Arraylsit: "+list1);
    }
}
