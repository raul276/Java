package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        /*
        void method(String s)
        s = "az sym gosho"
        s.split
        prebroi vsqka duma kolko pyti se sydyrja
        az -1
        sym -2
        gosho -1;

        zad 2
        prebroj vseki edin simvol
        a-1
        z-1
        y-2
        s-
         */
        String str = "Az sym Gosho sym";
        //getSymbolCount(str);
        countWords(str);
    } 
    public  static void getSymbolCount(String str){
        //char[] newStr =str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<str.length(); i++){
            int contained = 1;
            if(!(map.containsKey(str.charAt(i)))){
                 contained += map.get(str.charAt(i));
            }
            map.put(str.charAt(i),contained);
        }

    Iterator <Map.Entry<Character, Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<Character, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + "--" +entry.getValue());

        }

    }

    public static void countWords(String str){
        Map<String,Integer> map = new HashMap<>();
        String[] splitString = str.split(" ");
        for (String item: splitString) {
            int contained = 1;
            if(!(map.containsKey(item))){
                contained += map.get(item);
            }
            map.put(item,contained);
        }

        Iterator <Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + "--" +entry.getValue());

        }

    }
}
