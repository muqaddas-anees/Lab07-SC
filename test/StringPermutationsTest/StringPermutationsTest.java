package StringPermutationsTest;
import org.junit.Test;

import Permutations.StringPermutations;

import static org.junit.Assert.assertEquals;

import java.util.List;

public class StringPermutationsTest {
	@Test
    public void testGeneratePermutationsWithEmptyString() {
        String input = "";
        List<String> permutations = StringPermutations.generatePermutations(input);
        assertEquals(1, permutations.size()); // There should be only one permutation: an empty string.
        assertEquals("", permutations.get(0));
    }

    @Test
    public void testGeneratePermutationsWithOneCharacter() {
        String input = "a";
        List<String> permutations = StringPermutations.generatePermutations(input);
        assertEquals(1, permutations.size()); // There should be only one permutation: "a".
        assertEquals("a", permutations.get(0));
    }

    @Test
    public void testGeneratePermutationsWithMoreThanOneCharacter() {
        String input = "ghi";
        List<String> permutations = StringPermutations.generatePermutations(input);
        assertEquals(6, permutations.size()); // There should be 6 permutations for "ghi".
    }

}


