package hometask4.generic;

import hometask4.generic.CountMap;
import hometask4.generic.CountMapImpl;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Проверка add(T t) и toMap():");
        CountMap<Integer> map = new CountMapImpl<>();
        map.add(10);
        map.add(10);
        map.add(5);
        map.add(6);
        map.add(5);
        map.add(10);
        System.out.println("map: " + map.toMap().toString());

        System.out.println("Проверка getCount(T t):");
        int count1 = map.getCount(5);
        int count2 = map.getCount(6);
        int count3 = map.getCount(10);
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);

        System.out.println("Проверка size():");
        System.out.println(map.size());

        System.out.println("Проверка remove(T t):");
        System.out.println(map.remove(10));

        System.out.println("Проверка addAll(CountMap source):");
        CountMap<Integer> map1 = new CountMapImpl<>();
        map1.add(2);
        map1.add(5);
        System.out.println("map: " + map.toMap().toString());
        System.out.println("map1: " + map1.toMap().toString());
        map.addAll(map1);
        System.out.println("map after: " + map.toMap().toString());

        System.out.println("Проверка toMap(Map destination):");
        Map<Integer, Integer> newMap = new HashMap<>();
        map.toMap(newMap);
        map1.toMap(newMap);

        System.out.println("newMap: " + newMap.toString());
    }
}
