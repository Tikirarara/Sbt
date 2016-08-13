package hometask3.task2056;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] wordsInLine = line.toLowerCase().split(" ");

            for (String word : wordsInLine) {
                if ((!word.equals(" ")) && (!word.equals("")) && (!word.equals("-")) && (!word.equals("—"))) {
                    if (map.containsKey(word)) {
                        int count = map.get(word);
                        map.put(word, ++count);
                    } else {
                        map.put(word, 1);
                    }
                }
            }
        }

        int max = 1;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (max < entry.getValue()) {
                max = entry.getValue();
            }
        }

        List<String> listMax = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                listMax.add(entry.getKey());
            }
        }

        if (listMax.size() > 1) {

            String[] list = new String[listMax.size()];
            listMax.toArray(list);
            Arrays.sort(list);

            for (String i : list) {
                System.out.println(i);
            }

        } else {
            System.out.println(listMax.get(0));
        }
    }
}
