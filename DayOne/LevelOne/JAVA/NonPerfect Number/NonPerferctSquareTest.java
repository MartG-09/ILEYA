import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NonPerferctSquareTest {

        @Test
            public void testThatNonPerferctSquareExist() {
                    int[] array = {4, 7, 9, 10, 49, 6};
                    NonPerferctSquare.nonPerfect(array);
            }

        @Test
            public void testThatNonPerferctSquareReturnsAnArrayOfMinusOne() {
                    int[] array = {4, 7, 9, 10, 49, 6};
                    int[] expected = {4, -1, 9, -1, 49 , -1};
                    int[] actual = NonPerferctSquare.nonPerfect(array);
                    assertArrayEquals(expected , actual);
            }


}
