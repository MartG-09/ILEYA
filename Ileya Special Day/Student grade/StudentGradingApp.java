import java.util.Arrays;
class StudentGradingApp {
        int numberOfStudents;
        int numberOfSubjects;
        int[][] studentGrades;
        int[] total;

        public void askForNumberOfStudentsAndSubjects() {
                java.util.Scanner inputCollector = new java.util.Scanner(System.in);
                
                System.out.println("How many student do you have?");
                    numberOfStudents = inputCollector.nextInt();
                 
                System.out.println("How many subject do they offer?");
                    numberOfSubjects = inputCollector.nextInt();

                studentGrades = new int[numberOfStudents][numberOfSubjects];

                System.out.printf("""
                    Saving  >>>>>>>>>>>>>>>>>>>
                    Saved Successfully
                     %n""");
        }

           
        public void askStudentScoresAndStore() {
                    java.util.Scanner inputCollector = new java.util.Scanner(System.in);

                    for (int count = 0; count < studentGrades.length; count++) {
                            for (int index = 0; index < studentGrades[count].length; index++) {
                                    System.out.println("\nEntering Score for Student " + (count + 1));
                                    
                                    System.out.println("Enter Score for subject " + (index + 1) + " ");
                                        int score = inputCollector.nextInt();

                                    studentGrades[count][index] = score;

                                               System.out.println("""
                                                Saving  >>>>>>>>>>>>>>>>>>>
                                                Saved Successfully
                                                 """);     
                            }
                    }
        }


        public void calculateTotalAndStore() {
                total = new int[numberOfStudents];
                
                for (int count = 0; count < studentGrades.length; count++) {
                    int sum = 0;
                        for (int score = 0; score < studentGrades[count].length; score++) {
                               sum += studentGrades[count][score]; 
                        }

                        total[count] = sum;
                }
        }

 
            public static void main(String[] args) {
                    StudentGradingApp gradeApp = new StudentGradingApp();

                    gradeApp.askForNumberOfStudentsAndSubjects();
                    gradeApp.askStudentScoresAndStore();
                    gradeApp.calculateTotalAndStore();

                    for (int num = 0; num < (40 + 10*(gradeApp.numberOfStudents)); num++) {
                            System.out.print("=");
                    }
                    System.out.println();

                    System.out.print("STUDENT      SUB1");
                    for (int index = 2; index <= gradeApp.numberOfSubjects; index++) {
                    System.out.printf("%6s%d"  , "SUB" , index);
                    }

                    System.out.printf("%7s%6s%8s%n"  , "TOT" , "AVE" , "POS");
                    for (int num = 0; num < (40 + 10*(gradeApp.numberOfStudents)); num++) {
                            System.out.print("=");
                    }
                    System.out.println();


                    for (int count = 0; count < gradeApp.studentGrades.length; count++) {
                        System.out.print("Student " + (count + 1));
                            for (int counter = 0; counter < gradeApp.studentGrades[count].length; counter++) {
                                System.out.printf("%7d" , gradeApp.studentGrades[count][counter]);
                            }
                                System.out.printf("%7d%8.2f%6d" , gradeApp.total[count] , ((double)gradeApp.total[count] / gradeApp.numberOfStudents) , (gradeApp.studentGrades.length - count));

                                    int[] totalGrade = new int[gradeApp.total.length];
                                            Arrays.sort(gradeApp.studentGrades);
                                           System.arraycopy(gradeApp.total , 0 , totalGrade , 0 , gradeApp.total.length);
                                    for (int num = 0; num < gradeApp.total.length; num++) {
                                            if (totalGrade[num] == gradeApp.total[count]) {
                                                    System.out.printf("%6d" , (gradeApp.total.length - num));
                                            }
                                    }
                    System.out.println();

                    }

                    for (int num = 0; num < (40 + 10*(gradeApp.numberOfStudents)); num++) {
                            System.out.print("=");
                    }
                    System.out.println();

                    for (int num = 0; num < (40 + 10*(gradeApp.numberOfStudents)); num++) {
                            System.out.print("=");
                    }
                    System.out.println();




                    
            }
}










