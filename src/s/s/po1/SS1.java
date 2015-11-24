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
        /**
         * for (int i = 0; i < 5; i++) {
         *
         * // Get ArrayList with studentnumbers and grades ArrayList<Student>
         * allStudents = studentHandler.getStudents();
         *
         * // Convert allStudents ArrayList to an array to enable sorting
         * Student[] allStudentsArray = allStudents.toArray(new
         * Student[allStudents.size()]);
         *
         *
         * switch (i) { case 0: // Create students
         * studentHandler.createStudents(TEN_THOUSAND);
         *
         * // Begin time double beginTime = System.nanoTime();
         *
         * // QUICKSORT // Sorter.quickSort(allStudentsArray);
         * Sorter.quickSort3Way(allStudentsArray);
         *
         *
         * // End Time double endTime = System.nanoTime();
         *
         * // Display time spend System.out.println("\nSorting for " +
         * TEN_THOUSAND + " took: " + (endTime - beginTime) / 1000000000 + "
         * sec");
         *
         * break; case 1:
         *
         * // Create students studentHandler.createStudents(TWENTY_THOUSAND);
         *
         * // Begin time beginTime = System.nanoTime();
         *
         * // QUICKSORT // Sorter.quickSort(allStudentsArray);
         * Sorter.quickSort3Way(allStudentsArray);
         *
         * // End Time endTime = System.nanoTime();
         *
         * // Display time spend System.out.println("\nSorting for " +
         * TWENTY_THOUSAND + " took: " + (endTime - beginTime) / 1000000000 + "
         * sec");
         *
         * break; case 2:
         *
         * // Create students studentHandler.createStudents(FOURTY_THOUSAND);
         *
         * // Begin time beginTime = System.nanoTime();
         *
         * // QUICKSORT // Sorter.quickSort(allStudentsArray);
         * Sorter.quickSort3Way(allStudentsArray);
         *
         * // End Time endTime = System.nanoTime();
         *
         * // Display time spend System.out.println("\nSorting for " +
         * FOURTY_THOUSAND + " took: " + (endTime - beginTime) / 1000000000 + "
         * sec");
         *
         * break; case 3:
         *
         * // Create students studentHandler.createStudents(EIGHTY_THOUSAND);
         *
         * // Begin time beginTime = System.nanoTime();
         *
         * // QUICKSORT // Sorter.quickSort(allStudentsArray);
         * Sorter.quickSort3Way(allStudentsArray);
         *
         * // End Time endTime = System.nanoTime();
         *
         * // Display time spend System.out.println("\nSorting for " +
         * EIGHTY_THOUSAND + " took: " + (endTime - beginTime) / 1000000000 + "
         * sec");
         *
         * break; case 4: // Create students
         * studentHandler.createStudents(HUNDRED_SIXTY_THOUSAND);
         *
         * // Begin time beginTime = System.nanoTime();
         *
         * // QUICKSORT // Sorter.quickSort(allStudentsArray);
         * Sorter.quickSort3Way(allStudentsArray);
         *
         * // End Time endTime = System.nanoTime();
         *
         * // Display time spend System.out.println("\nSorting for " +
         * HUNDRED_SIXTY_THOUSAND + " took: " + (endTime - beginTime) /
         * 1000000000 + " sec\n");
         *
         * break; }
*
         */

        // Get ArrayList with studentnumbers and grades
        ArrayList<Student> allStudents = studentHandler.getStudents();

        //  Create students
        studentHandler.createStudents(30);

        //  Create BinarySearchTree
        BST binarySearchTree = new BST();

        System.out.println("BEFORE BST IMPLEMENTATION");
        for (Student s : allStudents) {
            System.out.println(s.toString());
        }

        //  Filling BST with students
        for (Student s : allStudents) {
            //  Key = Grade, Value = studentnumber
            binarySearchTree.put(s.getCijfer(), s.getStudentNummer());
        }
        
        System.out.println("-------------------------------  ");
        System.out.println("AFTER BST IMPLEMENTATION");
        for (Student s : allStudents) {
            System.out.println(s.toString());
        }
        
        System.out.println("-------------------------------  ");
        System.out.println(binarySearchTree.size());

        // Convert allStudents ArrayList to an array to enable sorting
//        Student[] allStudentsArray = allStudents.toArray(new Student[allStudents.size()]);
        // Shuffle students array
//        StdRandom.shuffle(allStudentsArray);
//        for (Student s : allStudentsArray) {
//            System.out.println(s.toString());
//        }
    }

}
