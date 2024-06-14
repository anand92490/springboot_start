package com.collection.list;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

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

        List list1 = new Vector();
        List list2 = new ArrayList<Integer>();





    }
}
