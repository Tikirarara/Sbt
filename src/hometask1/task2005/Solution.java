package task2005;

/**
 * Created by osas on 24.07.2016.
 */

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int min = sc.nextInt();
        int minId = 0;

        for (int i = 1; i < n; i++) {
            int newMin = sc.nextInt();
            if (min > newMin) {
                min = newMin;
                minId = i;
            }
        }
        System.out.println(minId + 1);
    }
}
