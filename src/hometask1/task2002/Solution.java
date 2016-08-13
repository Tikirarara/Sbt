package task2002;

/**
 * Created by osas on 24.07.2016.
 */

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + sc.nextInt();
        }
        System.out.println(sum);
    }
}
