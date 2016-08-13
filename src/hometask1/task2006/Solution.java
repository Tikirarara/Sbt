package task2006;

/**
 * Created by osas on 24.07.2016.
 */

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cm = sc.nextInt();
        int dyme = 3;
        int fut = 12 * dyme;

        int futs = cm / fut;
        cm = cm - (futs * fut);
        int dymes = 0;

        if (cm % dyme >= 2) {
            dymes = cm / dyme + 1;
        } else {
            dymes = cm / dyme;
        }
        System.out.println(futs + " " + dymes);
    }
}
