package com.review;

import java.util.ArrayList;



//    Convert Array to ArrayList


public class Array {
    public static void main(String[] args) {
       int [] arr ={1,2,3,4,5,6,7,8,9,10};
        System.out.print("Array: ");
       for (int j =0;j< arr.length;j++){
           System.out.print(arr[j]);
       }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i =0;i< arr.length;i++){
            list.add(arr[i]);
        }
        System.out.println("\nArrayList: "+list);

    }

}
