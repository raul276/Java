package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*
        1 zadacha
        void printBoxersByTitle(List<Boxer> boxer)
        name , titles-int
        gosho 2
        misho 1
        pesho 2

        rezultat : 2 - pesho, gosho
        1-misho
        null-lili

        2 zadacha
        void printBoxerNames(
        ivan 1
        gosho 2
        mimi 0
        ivan 20

        result:
        ivan - 2
        gosho 1
        mimi - 1
        kolko pyti se sreshta chovek s tva ime

        Iterator <Map.Entry<String, Integer> iterator = persons.entrySet().iteartor
        while(iterator.hasNext()){
            Map.Entry<String,Integer> entry = iterator.next();
            sout entry.getKey() + entry.getValue()

        Set<String> keys = persons.keySet();
        for (String string: persons){

        }
        equals(Object obj)
        {
            if(!( obj.instanceOf(Boxer))){
                return false
            }
            Boxer otherBoxer = (Boxer) obj;
            return otherBoxer.getName.equals(this.getName()
        }
        hash
        {
        int result =13;
        return result * this.getName().getHash()


         */

        List<Boxer> boxers = new ArrayList<>();

        boxers.add(new Boxer("Klichko", 14));
        boxers.add(new Boxer("Kobrqt", 15));
        boxers.add(new Boxer("Petko", 15));
        boxers.add(new Boxer("Kobrqt", -1));
        boxers.add(new Boxer("Petko", 14));
        boxers.add(new Boxer("Gyulai", 99));
        boxers.add(new Boxer("Kobrqt", 31));

        printBoxerNamesOccurences(boxers);
        printBoxersByTitle(boxers);
    }

    public static void printBoxersByTitle(List<Boxer> boxers) {
        Map<Integer, String> mapBoxers = new HashMap<>();

        for (Boxer boxer : boxers) {
            if (!mapBoxers.containsKey(boxer.getTitles())) {
                mapBoxers.put(boxer.getTitles(), "");
            }

            mapBoxers.put(boxer.getTitles(),
                    mapBoxers.get(boxer.getTitles()) + boxer.getName() + ", ");
        }

        Iterator<Map.Entry<Integer, String>> i = mapBoxers.entrySet().iterator();
        while (i.hasNext()) {
            Map.Entry<Integer, String> current = i.next();
            System.out.println(current.getKey() + " - " + current.getValue());
        }
    }

    public static void printBoxerNamesOccurences(List<Boxer> boxers) {
        Map<String, Integer> boxersMap = new HashMap<>();
        for (Boxer boxer : boxers) {
            if (!boxersMap.containsKey(boxer.getName())) {
                boxersMap.put(boxer.getName(), 1);
            } else {
                boxersMap.put(boxer.getName(), boxersMap.get(boxer.getName()) + 1);
            }
        }

        System.out.println(boxersMap);
    }
}




