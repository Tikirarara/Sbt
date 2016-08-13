package task2057;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int operations = sc.nextInt();

        for (int i = 0; i < operations; i++) {
            if (sc.nextInt() == 1) {
                list.add(sc.nextInt());

            } else {
                Integer[] array = new Integer[list.size()];
                Arrays.sort(list.toArray(array));
                System.out.println(array[0]);
                list.remove(array[0]);
            }
        }
    }
}