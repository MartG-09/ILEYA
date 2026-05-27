public class Palidromic {
        public static boolean palindrome(int[] array) {

             boolean isPalindrome = false;
                boolean check = false;
                int[] newArray = new int[array.length];

                for (int count = 0; count < array.length; count++) {
                    newArray[count] = array[array.length - 1 - count];
                }


                   for (int counter = 0; counter < newArray.length; counter++) {
                        if (newArray[counter] != array[counter]) {
                             check = true;
                            break;
                        }
                    }

                    if (!check) {
                            isPalindrome = true;
                    }

                return isPalindrome;
        }
}
