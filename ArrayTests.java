import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 100 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 100 }, input1);
	}

  @Test
  public void manualTestReverseInPlace() {
    int[] input2 = {1,2,3,4,5,6};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[] {6,5,4,3,2,1}, input2);
  }

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
  
  @Test
  public void manualTestReversed() {
    int[] input3 = {7,8,9,10};
    ArrayExamples.reversed(input3);
    assertArrayEquals(new int[] {10,9,8,7}, input3);
  }

  @Test
  public void manualTestAverageWithoutLowest() {
    double[] input4 = {5,5,5,5};
    assertEquals(0, ArrayExamples.averageWithoutLowest(input4));

  }
}
