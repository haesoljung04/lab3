import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

import org.junit.*;

interface StringChecker { boolean checkString(String s); }

public class ListTests {
    @Test
    public void testFilter() {
        List<String> testerInput = Arrays.asList("abc", "def", "ghi", "jkl");
        List<String> expectedOutput = Arrays.asList("ghi", "jkl");
        List<String> actualOutput = ListExamples.filter(testerInput, s -> s.length() == 3);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testMerge() {
        List<String> testInput1 = Arrays.asList("a", "b", "c");
        List<String> testInput2 = Arrays.asList("d", "e", "f");
        List<String> expectedOutput = Arrays.asList("a", "b", "c", "d", "e", "f");
        List<String> actualOutput = ListExamples.merge(testInput1, testInput2);
        assertEquals(expectedOutput, actualOutput);
    }
}
