package com.collectionLabs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class One {



    public static void one(){
        int[] arr1 = new int[3];
        int[] arr2, arr3;
        int arr4[], arr5;
        int[] arr6 = {1,2,3,4,5,6};
        int[] arr7 = new int[]{1,2};

    }
    public static void two(){
        List<String> list = new ArrayList<>();
        list.add("Max");
        list.add("Anna");
        list.add("Sofi");

        String[] arr = list.toArray(new String[0]);

    }
    public static void three(){
        String[] arr = {"Mila", "Dasha", "Ivan"};
        List<String> list = Arrays.asList(arr);
        //array backed List are linked. When a change is made to one, it is available in the other.
        //we are not allowed to change the size of the list.
        List<String> list2 = Arrays.asList("one", "two");
    }

    public static void main(String... args){








    }
}
