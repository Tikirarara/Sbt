package task2036;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] stranges = {'e', 'y', 'u', 'i', 'o', 'a'};

        int n = sc.nextInt();
        String[] words = new String[n];
        String word;

        for (int i = 0; i < n; i++) {
            word = sc.next();
            char[] chars = word.toCharArray();
            boolean isStranger = false;
            int count = 0;

            for (int j = 0; j < chars.length; j++) {
                for (int p = 0; p < stranges.length; p++) {
                    if (chars[j] == stranges[p]) {
                        isStranger = true;
                    }
                }
                if (isStranger) {
                    count++;
                    isStranger = false;
                } else {
                    count = 0;

                }
                if (count == 3) {
                    break;
                }
            }
            if (count < 3) {
                words[i] = word;
            } else {
                count = 0;
            }
        }
        for (int i = 0; i < words.length; i++) {
            if (words[i] != null)
                System.out.println(words[i]);
        }
    }
}
