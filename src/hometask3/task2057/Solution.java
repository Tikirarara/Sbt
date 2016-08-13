package hometask3.task2057;

//slow

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        List<Integer> removed = new ArrayList<>();
        int operations = sc.nextInt();

        for (int i = 0; i < operations; i++) {
            if (sc.nextInt() == 1) {
                list.add(sc.nextInt());

            } else {
                int min = list.get(0);

                for (int j : list) {
                    if (min > j) {
                        min = j;
                    }
                }

                Iterator<Integer> iter2 = list.iterator();
                while (iter2.hasNext()) {
                    int s = iter2.next();

                    if (s == min) {
                        removed.add(s);
                        iter2.remove();
                        break;
                    }
                }
            }
        }

        for (Integer i : removed) {
            System.out.println(i);
        }

    }
}
