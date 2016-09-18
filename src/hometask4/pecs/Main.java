package hometask4.pecs;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> testList1 = CollectionUtils.newArrayList();
        List<Number> testList2 = CollectionUtils.newArrayList();
        System.out.println("testList1: " + testList1.toString());

        CollectionUtils.add(testList1, 1);
        CollectionUtils.add(testList1, 2);
        CollectionUtils.add(testList1, 3);
        CollectionUtils.add(testList1, 4);
        CollectionUtils.add(testList1, 9);
        CollectionUtils.add(testList1, 7);
        CollectionUtils.add(testList1, 0);
        CollectionUtils.add(testList1, 8);
        CollectionUtils.add(testList1, 6);
        CollectionUtils.add(testList1, 5);
        System.out.println("testList1 after adding 10 elements: )"+ testList1.toString());

        CollectionUtils.addAll(testList1, testList2);
        System.out.println("testList2 after adding testList1: "+ testList2.toString());

        System.out.println("index of \"4\" in testList1: "+CollectionUtils.indexOf(testList1, 4));

        System.out.println("limitList(5 elements) from testList2: "+CollectionUtils.limit(testList2, 5).toString());

        CollectionUtils.removeAll(testList2, CollectionUtils.limit(testList1, 3));
        System.out.println("testList2 after removing 3 elements(from testList1): " + testList1.toString());

        System.out.println("testList2 contains all testList1? "+ CollectionUtils.containsAll(testList2, testList1));

        System.out.println("testList2 contains 1 or more elements from testList1? " + CollectionUtils.containsAny(testList2, testList1));

        System.out.println("sublist from testlist1 (3-8 elements)(comparable): "+CollectionUtils.range(testList1, 3, 8));

        System.out.println("sublist from testlist2 (0-6 elements)(comparator): "+CollectionUtils.range(testList2, 0, 6, (o1, o2) -> o1.toString().compareTo(o2.toString())));
    }
}
