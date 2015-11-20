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
import java.util.Scanner;
import nl.hva.dmci.ict.inf.ads.lib.StdRandom;

/**
 *
 * @author Omer
 */
public class SS1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //  Creating a scanner object
        Scanner input = new Scanner(System.in);

        //  Create Handlers
        StudentHandler studentHandler = new StudentHandler();

        // Save user input for amount of students
        System.out.print("How many students to create?: ");
        int amountOfStudents = input.nextInt();

        //  Create students
        studentHandler.createStudents(amountOfStudents);

        // Get ArrayList with studentnumbers and grades
        ArrayList<Student> allStudents = studentHandler.getStudents();
        
        // Convert allStudents ArrayList to an array to enable sorting
        Student[] allStudentsArray = allStudents.toArray( new Student[ allStudents.size() ] );

        // Shuffle students array
        StdRandom.shuffle(allStudentsArray);
        
        // Sort 
        double beginTime = System.nanoTime();   // Begin time
        Sorter.quickSort(allStudentsArray);
        double endTime = System.nanoTime();     // End time
        
        // Print contents of allStudentsArray
        for(Student s : allStudentsArray){
            System.out.println(s.toString());
        }
        
        System.out.println("\nThe sorting took: " + (endTime - beginTime) / 1000000000 + " sec");   // Display time spend
        
    }
    
}
