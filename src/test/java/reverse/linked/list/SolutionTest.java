package reverse.linked.list;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void whenFiveNodesReverse() {
        Solution rsl = new Solution();
        int[] src = new int[] {1, 2, 3, 4, 5};
        assertArrayEquals(src, rsl.reverseList(ListNode.fromArray(5, 4, 3, 2, 1)).toArray());
    }

    @Test
    public void whenTwoNodesReverse() {
        Solution rsl = new Solution();
        int[] src = new int[] {1, 2};
        assertArrayEquals(src, rsl.reverseList(ListNode.fromArray(2, 1)).toArray());
    }

    @Test
    public void whenNodeIsEmpty() {
        Solution rsl = new Solution();
        assertNull(rsl.reverseList(null));
    }
}