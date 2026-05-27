import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalidromicTest {

        @Test
            public void testThatPalidromicExists() {
                  int[] array = {45, 0, 8, 0, 45};
                    Palidromic.palindrome(array);
            }

        @Test
            public void testThatPalidromicChecksForPalindromesTrue() {
                  int[] array = {45, 0, 8, 0, 45};
                    boolean expected = true;
                    boolean actual = Palidromic.palindrome(array);
                    assertEquals(expected , actual);
            }

        @Test
            public void testThatPalidromicChecksForPalindromesFalse() {
                  int[] array = {45, 0, 8, 0, 45, 23};
                    boolean expected = false;
                    boolean actual = Palidromic.palindrome(array);
                    assertEquals(expected , actual);
            }

}
