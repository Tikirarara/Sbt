package hometask3.task2057;
/*
faster
*/
import java.util.*;

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> list = new PriorityQueue<>();

        int operations = sc.nextInt();

        for (int i = 0; i < operations; i++) {
            if (sc.nextInt() == 1) {
                list.add(sc.nextInt());

            } else {
                System.out.println(list.peek());
                list.remove();
            }
        }
    }
}