package task2021;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = new int[scanner.nextInt()];

        for (int i = 0; i < array.length; i++) {

            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < 2; i++) {

            int max = array[0];

            for (int j = 1; j < array.length; j++) {

                if (max < array[j]) {

                    max = array[j];
                }
            }

            for (int p = 0; p < array.length; p++) {

                if (array[p] == max) {

                    array[p] = max/2;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i] + " ");
        }
    }

}
