import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SplitArrayTest {

        @Test
            public void testThatSplitArrayExists() {
                int[] array = {45 , 60 , 3 , 10 , 9 , 22};
                SplitArray.split(array);
            }

        @Test
            public void testThatSplitArrayGivesEvenAndOdd() {
                int[] array = {45 , 60 , 3 , 10 , 9 , 22};
                int[][] expected = {{60 , 10 , 22} , {45 , 3 , 9}};
                int[][] actual= SplitArray.split(array);
                assertArrayEquals(actual , expected);
            }

}
