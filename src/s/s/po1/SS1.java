/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s.s.po1;

import Handlers.StudentHandler;
import Models.Student;
import Sort.Sorter;
import java.util.ArrayList;
import nl.hva.dmci.ict.inf.ads.lib.StdRandom;

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
        studentHandler.createStudents(20);

        //  Create BinarySearchTree
        BST binarySearchTree = new BST();

//        System.out.println("BST IMPLEMENTATION.. ");
//        for (Student s : allStudents) {
//            System.out.println(s.toString());
//        }

        // Convert allStudents ArrayList to an array to enable sorting
        Student[] allStudentsArray = allStudents.toArray(new Student[allStudents.size()]);
        // Shuffle students array
        StdRandom.shuffle(allStudentsArray);
        
        // Some test values
        allStudentsArray[0].setCijfer(1.0);
        allStudentsArray[1].setCijfer(1.0);
        allStudentsArray[2].setCijfer(1.1);
        allStudentsArray[3].setCijfer(10.0);

        //  Filling BST with students
        for (Student s : allStudentsArray) {
            //  Key = Grade, Value = studentnumber
            binarySearchTree.put(s.getCijfer(), s.getStudentNummer());
        }

        System.out.println("\nBST IMPLEMENTATION DONE!");

        System.out.println("-------------------------------  ");
        System.out.println("BST size: " + binarySearchTree.size());
        System.out.println("-------------------------------  \n");

        //  Get()
        System.out.println("--------- GET() ---------");
        System.out.println("1.0: " + binarySearchTree.get(1.0));
        System.out.println("1.1: " + binarySearchTree.get(1.1));
        System.out.println("10.0: " + binarySearchTree.get(10.0));

        //  RANK
        System.out.println("-------- RANK --------");

        System.out.println("Cijfer\t\tRank");

        // in progress..
        for (int i = 0; i < binarySearchTree.size(); i++) {
            Student tmm = allStudents.get(i);
            System.out.println(
                tmm.getCijfer() + "\t\t" + binarySearchTree.rank(tmm.getCijfer())
            );
        }

        
    }
 
}