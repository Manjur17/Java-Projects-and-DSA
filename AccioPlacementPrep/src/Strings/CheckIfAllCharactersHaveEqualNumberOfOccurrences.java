package Strings;

public class CheckIfAllCharactersHaveEqualNumberOfOccurrences {
    public boolean areOccurrencesEqual(String s) {
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        int count = freq[s.charAt(0) - 'a'];

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0 && freq[i] != count) {
                return false;
            }
        }

        return true;
    }
}
