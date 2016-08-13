package hometask3.task2057;

import java.util.*;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int operations = sc.nextInt();
        int deleteCommand = 0;

        for (int i = 0; i < operations; i++) {
            if (sc.nextInt() == 1) {
                list.add(sc.nextInt());

            } else {
                deleteCommand++;
            }
        }
        Integer[] clone = new Integer[list.size()];
        Arrays.sort(list.toArray(clone));

        for (int i = 0; i < deleteCommand; i++) {
            System.out.println(clone[i]);
            list.remove(clone[i]);
        }
    }
}