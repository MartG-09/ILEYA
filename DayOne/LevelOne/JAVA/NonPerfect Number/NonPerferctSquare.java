import java.util.Arrays;
public class NonPerferctSquare {
        public static int[] nonPerfect(int[] array) {
            
                for (int count = 0; count < array.length; count++) {
                    double num = Math.sqrt(array[count]);
                    double number = num % 1;

                         if (number != 0.0) {
                             array[count] = -1;
                       } 
                }

                    return array;
        }

}
