package Permutations;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations {
	 /**
     * Returns the list of strings containing all possible permutations.
     *
     * @param input passing the input string.
     * @return List containing all possible permutations.
     */
    public static List<String> generatePermutations(String input) {
        List<String> permutations = new ArrayList<>();
        generatePermutationsRecursive("", input, permutations);
        return permutations;
    }
    /**
     *Creates all possible permutations and adds them to the list.
     *
     * @param prefix string done (initially empty string)
     * @param remaining string left (initially the entire string)
     * @param permutations empty array list to append permutations
     */
    private static void generatePermutationsRecursive(String prefix, String remaining, List<String> permutations) {
        int n = remaining.length();
        if (n == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                generatePermutationsRecursive(
                    prefix + remaining.charAt(i),
                    remaining.substring(0, i) + remaining.substring(i + 1, n),
                    permutations
                );
            }
        }
    }

}
