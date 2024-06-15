package com.collection.map;

import java.util.HashMap;
import java.util.Set;

public class Client {
    public static void main(String[] args) {
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


    }
}
