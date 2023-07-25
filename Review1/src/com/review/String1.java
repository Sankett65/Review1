package com.review;

import java.util.ArrayList;

//     Convert ArrayList to String Array

public class String1 {
    public static void main(String[] args) {
        ArrayList<String > list= new ArrayList<String>();
        list.add("Hi");
        list.add("i");
        list.add("am");
        list.add("Sanket");
        System.out.println(list);
        String [] str = new String[list.size()];
        for (int i =0;i<list.size();i++){
            str[i]= list.get(i);
            System.out.print(str[i]+ " ");
        }

    }
}
