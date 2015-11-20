/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s.s.po1;

import Handlers.StudentHandler;
import Models.Student;
import java.util.ArrayList;

/**
 *
 * @author Ömer Zülaloğlu [IS204] 500712124 & Stefan Lobato [IS204] 500707274
 */
public class SS1 {

    private static final int ZERO = 0;
    private static final int TEN_THOUSAND = 10000;
    private static final int TWENTY_THOUSAND = 20000;
    private static final int FOURTY_THOUSAND = 40000;
    private static final int EIGHTY_THOUSAND = 80000;
    private static final int HUNDRED_SIXTY_THOUSAND = 160000;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //  Create Handlers
        StudentHandler studentHandler = new StudentHandler();

        for (int i = 0; i < 5; i++) {

            // Get ArrayList with studentnumbers and grades
            ArrayList<Student> allStudents = studentHandler.getStudents();

            switch (i) {
                case 0:
                    //  Create students
                    studentHandler.createStudents(TEN_THOUSAND);

                    //  Convert allStudents ArrayList to an array to enable sorting
                    Student[] allStudentsArray = allStudents.toArray(new Student[allStudents.size()]);

                    //  Begin time
                    double beginTime = System.nanoTime();

                    //  QUICKSORT
                    
                    
                    //  End Time
                    double endTime = System.nanoTime();

                    // Display time spend
                    System.out.println("\nSorting for " + TEN_THOUSAND + " took: "
                            + (endTime - beginTime) / 1000000000 + " sec");

                    break;
                case 1:

                    //  Create students
                    studentHandler.createStudents(TWENTY_THOUSAND);

                    //  Convert allStudents ArrayList to an array to enable sorting
                    allStudentsArray = allStudents.toArray(new Student[allStudents.size()]);

                    //  Begin time
                    beginTime = System.nanoTime();

                    //  QUICKSORT
                    
                    //  End Time
                    endTime = System.nanoTime();

                    // Display time spend
                    System.out.println("\nSorting for " + TWENTY_THOUSAND + " took: "
                            + (endTime - beginTime) / 1000000000 + " sec");

                    break;
                case 2:

                    //  Create students
                    studentHandler.createStudents(FOURTY_THOUSAND);

                    //  Convert allStudents ArrayList to an array to enable sorting
                    allStudentsArray = allStudents.toArray(new Student[allStudents.size()]);

                    //  Begin time
                    beginTime = System.nanoTime();

                    //  QUICKSORT
                    
                    //  End Time
                    endTime = System.nanoTime();

                    // Display time spend
                    System.out.println("\nSorting for " + FOURTY_THOUSAND + " took: "
                            + (endTime - beginTime) / 1000000000 + " sec");
                    
                    break;
                case 3:

                    //  Create students
                    studentHandler.createStudents(EIGHTY_THOUSAND);

                    //  Convert allStudents ArrayList to an array to enable sorting
                    allStudentsArray = allStudents.toArray(new Student[allStudents.size()]);

                    //  Begin time
                    beginTime = System.nanoTime();

                    //  QUICKSORT
                    
                    //  End Time
                    endTime = System.nanoTime();

                    // Display time spend
                    System.out.println("\nSorting for " + EIGHTY_THOUSAND + " took: "
                            + (endTime - beginTime) / 1000000000 + " sec");
                    
                    break;
                case 4:
                    //  Create students
                    studentHandler.createStudents(HUNDRED_SIXTY_THOUSAND);

                    //  Convert allStudents ArrayList to an array to enable sorting
                    allStudentsArray = allStudents.toArray(new Student[allStudents.size()]);

                    //  Begin time
                    beginTime = System.nanoTime();

                    //  QUICKSORT
                    
                    //  End Time
                    endTime = System.nanoTime();

                    // Display time spend
                    System.out.println("\nSorting for " + HUNDRED_SIXTY_THOUSAND + " took: "
                            + (endTime - beginTime) / 1000000000 + " sec");
                    
                    break;
            }

        }

        //  Creating a scanner object
//        Scanner input = new Scanner(System.in);
//        // Save user input for amount of students
//        System.out.print("How many students to create?: ");
//        int amountOfStudents = input.nextInt();
        // Convert allStudents ArrayList to an array to enable sorting
//        Student[] allStudentsArray = allStudents.toArray(new Student[allStudents.size()]);
        // Shuffle students array
//        StdRandom.shuffle(allStudentsArray);
//        for (Student s : allStudentsArray) {
//            System.out.println(s.toString());
//        }
    }

}
