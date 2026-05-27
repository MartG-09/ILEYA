import java.util.Arrays;
public class SplitArray {
        public static int[][] split(int[] array) {
                    int num = 0;
                    int numTwo = 0;
                for (int count = 0; count < array.length; count++) {
                    if (array[count] % 2 == 0) {
                            num++;
                    }
                    else{ numTwo++; }
                }


                int number = 0;
                if (num > numTwo) number = num;
                else number = numTwo;
                int[][] newArray = new int[2][number];


                int adding = 0;
                int add = 0;
                for (int counter = 0; counter < array.length; counter++) {
                    if (array[counter] % 2 == 0) {
                        newArray[0][add] = array[counter];
                        add++;
                    }

                    else { 
                        newArray[1][adding] = array[counter]; 
                        adding++;                            
}
                }

                return newArray;
        }


                public static void main(String[] args) {
                        int[] array = {45, 60, 3, 10, 9, 22};
                        System.out.println(Arrays.deepToString(split(array)));
                    }
}

