import java.util.Scanner;
import java.util.Arrays;
public class Gbemi {

    public static Scanner inputCollector = new Scanner(System.in);

        public static int[][] array;
        public static double[] frequency;

            public static int[][] addScore() {

                  System.out.print("How many student enrolled : ");
                     int numberStudent = inputCollector.nextInt();

                System.out.print("How many quiz was taken : ");
                    int numberQuiz = inputCollector.nextInt(); 

                array = new int[numberStudent][numberQuiz];

                   for (int count = 0; count < array.length; count++) {
                     boolean isAbove = false;
                        for (int num = 0; num < array[count].length; num++) {

                              System.out.print("Enter scores : ");
                                int score = inputCollector.nextInt(); 

                                if (score < 0 || score > 100) { 
                                    isAbove = true;
                                        break;
                                    }
                                    array[count][num] = score;
                        }
                            if(isAbove) {
                                System.out.println("Enter number between 0 and 100"); 
                                 break;
                            }
                    }

                    return array;
            }

    
                        public static double[] getAverage()  {

                            frequency = new double[array.length];

                                for (int count = 0; count < array.length; count++) {
                                  double total = 0;
                                    for (int index = 0; index < array[count].length; index++) {
                                        total += array[count][index];
                                    }
                                           frequency[count] = total / array[count].length;
                                }

                                        return frequency;
                        }


        public static double getHighAverage() {
            double largest = 0;
                for (int num = 0; num < frequency.length; num++) {
                    if (frequency[num] > largest) {
                        largest = frequency[num];
                    }
                }
        
                        return largest;
        }


                    public static void main(String[] args) {
                         addScore();
                        getAverage();                            
                             System.out.println(Arrays.deepToString(array)); 
                             System.out.println(Arrays.toString(frequency));  
                             System.out.printf("%.2f%n" , getHighAverage());                            
                    }
}







