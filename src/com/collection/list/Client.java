package com.collection.list;
import java.util.*;

public class Client {
    public static void main(String args[]){
        List list;

        list = new ArrayList();

        list.add(1); // storing primitive type
        list.add(6.5);
        list.add('a');
        list.add("anand");
        list.add(5);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)); //a[i]
        }

        list.remove(1);
        System.out.println(list);

        list.add(1,10);
        System.out.println(list);

       // list interface acts as the reference variable for the implementing classes
        List list1 = new Vector();
        List list2 = new ArrayList<Integer>();

// Set - it is not index based, it internally uses hash table and uses key to store the element. to get the elements we use iterator interface
        Set s = new HashSet();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);

        //We ise Iterator interface to traverse through the elements in a hash set.
        Iterator<Integer> iterator = s.iterator();
        while(iterator.hasNext()){
            int x = iterator.next();
            System.out.println(x);
        }

        // We use hashMap with key-value pair| The key must be unique or else it will override the value
        HashMap <Integer, String> map = new HashMap<>();
        map.put(1,"Anand");
        map.put(2,"abc");
        map.put(3,"Nikita");
        map.put(4,"Serena");



        //We use hashSet if we don't want to have duplicates


    }
}
