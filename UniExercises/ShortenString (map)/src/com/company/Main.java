package com.company;

import java.util.LinkedHashMap;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        String inputString = "aaaaabbcgdd";
        System.out.println(shortenString(inputString));
    }

    public static String shortenString( String str){
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
    String result = "";
        char[] chars = str.toCharArray();

        for(Character ch:chars){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            } else {
                map.put(ch, 1);
            }
        }

        Set<Character> keys = map.keySet();

        for(Character ch:keys){
            if(map.get(ch) > 0){
                result +=ch;
            }
        }
        return result;
    }
}
