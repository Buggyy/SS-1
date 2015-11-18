/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handlers;

import Models.Student;
import java.util.ArrayList;

/**
 *
 * @author Ömer Zülaloğlu [IS204] 500712124 & Stefan Lobato [IS204] 500707274
 */
public class StudentHandler {

    private final ArrayList<Student> allStudents = new ArrayList<>();

    private final int BASE_NUMBER = 50_060_001;

    /**
     *
     * @return ArrayList of Students
     */
    public ArrayList<Student> getStudents() {
        return allStudents;
    }

    /**
     * Generates a student number with the given number
     *
     * @param number
     * @return
     */
    public int generateStudentNumber(int number) {
        return BASE_NUMBER + number;
    }

    
    /**
     *
     * @param amount
     */
    public void createStudents(int amount) {
        
        for (int i = 0; i < amount; i++) {
            Student student = new Student(generateStudentNumber(i));
            allStudents.add(student);
        }
       
    }

    @Override
    public String toString() {
        return allStudents + " ";
    }
}
