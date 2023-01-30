import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.List;

public class LinkedListTests {
    @Test
    public void testToString() {
        LinkedList testList = new LinkedList();
        testList.prepend(3);
        testList.prepend(2);
        testList.prepend(1);
        assertEquals("1 2 3 ", testList.toString());

    }
    // 
    @Test
    public void testAppend() {
        LinkedList testList = new LinkedList();
        testList.append(7);
        testList.append(8);
        testList.append(9);
        assertEquals("7 8 9 ", testList.toString());
    }

    @Test
    public void testLast() {
        LinkedList testList = new LinkedList();
        testList.prepend(3);
        testList.prepend(4);
        testList.prepend(5);
        assertEquals(3, testList.last());
    }

    @Test
    public void testLength() {
        LinkedList testList = new LinkedList();
        assertEquals(0, testList.length());
    }
}
