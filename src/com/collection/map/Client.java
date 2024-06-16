package com.collection.map;

import java.util.*;

public class Client {
    public static void main(String[] args) {

        ArrayList<String>list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("THREE");

        Iterator<String> i = list.iterator();
        while(i.hasNext()){ // checks if there is next element
            System.out.println(i.next()); // stops iteration if the next value is not present i.e. false value
        }

        // Hash map will not allow duplicates but if we do add a duplicate value it will be overwritten
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("1", "Anand");
        map.put("2", "Rayes");
        map.put("3", "Ifran");
        map.put("4", "Bata");
        map.put("5", "Grand_master");
        map.put("5", "OverWritten Value");

//        String s = map.get("5");
//        System.out.println(s);
//
//        Set s3 = map.keySet();

        //to get the value you must know the key
        System.out.println(map.get("\n2"));

       // Set<Map.Entry<String, String>> s = map.entrySet();//
        Set<String> set = map.keySet(); // this allows us to get all the keys

        //1. keySet() - gives us only the Keys for all the elements in hashMap. Using for each loop  and keySet() we can get the key and using key we can get the values
        System.out.println("\nKey Set \n");
        for(String key: set){
            String value = map.get(key);
            System.out.println("KS_Key = " + key + " KS_value = " + value);
        }

       // for(String key: map.keySet()){}// returns set data type


        // 2. EntrySet() gives us both keys and values of all the elements in Hashmap . In entrySet, using for each loop we can access both key and value pair
        System.out.println("\nEntry Set \n");
        for(Map.Entry<String, String> entry : map.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("ES_key = " + key + " ES_value = " + value);
        }

        //3. entrySet() with the Iterator
        System.out.println("\nIterator with Entry Set \n");
        Iterator<Map.Entry<String, String>> en = map.entrySet().iterator();
        while(en.hasNext()){
            Map.Entry<String,String> m = en.next();
            System.out.println("I_Key = " + m.getKey() + " I_Value = " + m.getValue());
        }





    }
}
