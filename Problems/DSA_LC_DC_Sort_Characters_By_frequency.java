package Problems;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class DSA_LC_DC_Sort_Characters_By_frequency {
    class pairs {
        // Creating a class to store a key value pair of character and count
        char ch;
        int count;

        public pairs(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }

    public String frequencySort(String s) {
        int[] arr = new int[122];
        for (char ch : s.toCharArray()) {
            arr[ch]++;
            // First Converting the string into character array and the storing
            // frequency of each character
        }
        LinkedList<pairs> freq_list = new LinkedList<>();
        // Creating a linkedlist of pair and adding the pairs into the list, but only the characters with frequency more than 0
        for (int i = 65; i < 122; i++) {
            if (arr[i] > 0) {
                freq_list.add(new pairs((char) i, arr[i]));
            }
        }
        Collections.sort(freq_list, new Comparator<pairs>() {
            // sorting the list
            @Override
            public int compare(pairs o1, pairs o2) {
                return o2.count - o1.count;
            }
        });
        StringBuilder sb = new StringBuilder();
        // creating a stringbuilder and appending the characters
        for (pairs p : freq_list) {
            int count = p.count;
            // second loop to make sure that the number of appearance of a character would be the same as their of frequency
            while (count-- > 0) {
                sb.append(p.ch);
            }
        }
        return sb.toString();
    }
}
