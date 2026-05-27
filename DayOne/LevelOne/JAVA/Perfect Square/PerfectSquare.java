import java.util.Arrays;
public class PerfectSquare {
        public static int[] perfectSquare(int[] array) {
            
                int counter = 0;    
                for (int count = 0; count < array.length; count++) {
                    double num = Math.sqrt(array[count]);
                    double number = num % 1;

                         if (number == 0.0) {
                             counter++;
                       } 
                }


                int[] newArray = new int[counter];
   
                int add = 0;
                for (int index = 0; index < array.length; index++) {
                    double num = Math.sqrt(array[index]);
                    double number = num % 1;

                         if (number == 0.0) {
                             newArray[add] = array[index];
                                add++;
                       } 
                }
              

                    return newArray;
        }
}
