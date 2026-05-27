import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PerfectSquareTest {

        @Test
            public void testThatPerfectSquareExist() {
                    int[] array = {4, 7, 9, 10, 16, 18};
                    PerfectSquare.perfectSquare(array);
            }

        @Test
            public void testThatPerfectSquareReturnsAnArrayOfPerfectSquare() {
                    int[] array = {4, 7, 9, 10, 16, 18};
                    int[] expected = {4 , 9 , 16};
                    int[] actual = PerfectSquare.perfectSquare(array);
                    assertArrayEquals(expected , actual);
            }


}
