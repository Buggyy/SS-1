/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import static java.lang.Double.valueOf;
import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author Ömer Zülaloğlu [IS204] 500712124 & Stefan Lobato [IS204] 500707274
 */
public class Student implements Comparable<Student> {

    // Attributes
    private int studentNummer = 0;
    private double cijfer = 0;

    public Student(int studentNummer) {
        this.studentNummer = studentNummer;
        this.cijfer = generateCijfer();
    }

    public int getStudentNummer() {
        return studentNummer;
    }

    public void setStudentNummer(int studentNummer) {
        this.studentNummer = studentNummer;
    }

    public double getCijfer() {
        return cijfer;
    }

    public void setCijfer(double cijfer) {
        this.cijfer = cijfer;
    }

    /**
     * Generates a random double within the range 1.0 - 10.0
     *
     * @return
     */
    public static double generateCijfer() {
        DecimalFormat df = new DecimalFormat("#.#");

        double rangeMin = 1.0;
        double rangeMax = 10.0;

        Random r = new Random();

        double randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
        return randomValue = valueOf(df.format(randomValue));
    }

    /**
     * Returns a String representation of a Student object
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\nStudentnummer: ").append(this.studentNummer).append("\n");
        sb.append("Cijfer: ").append(this.cijfer);

        return sb.toString();
    }

    /**
     * Compares the cijfer attribute of "this" Student object with the given one
     *
     * @param o
     * @return 1 if given object is bigger, -1 if smaller and 0 if even
     */
    @Override
    public int compareTo(Student o) {
        
        if (this.cijfer > o.cijfer) {
            return 1;
        }
        if (this.cijfer < o.cijfer) {
            return -1;
        } 

        // Compares studentnummer attribute if cijfers are the same
        if (this.cijfer == o.cijfer) {
            if (this.studentNummer > o.studentNummer) {
                return 1;
            }
            if (this.studentNummer < o.studentNummer) {
                return -1;
            } else  {
                // System.err.println("**ERROR CODE: 5713: invalid state");
                // System.err.println(this.studentNummer + " " + o.studentNummer);
                return 0;
            }
        }
        return 0;
    }

//    /**
//     * Compares the cijfer attribute of two Student objects with each other
//     *
//     * @return
//     */
//    @Override
//    public int compare(Student o1, Student o2) {
//        if (o1.cijfer > o2.getCijfer()) {
//            return -1;
//        }
//        if (o1.cijfer < o2.getCijfer()) {
//            return +1;
//        } else {
//            return 0;
//        }
//    }
//
//    static Comparator<Student> CijferComparator() {
//        return new Comparator<Student>() {
//
//            @Override
//            public int compare(Student s1, Student s2) {
//                if (s1.getCijfer() > s2.getCijfer()) {
//                    return -1;
//                }
//                if (s1.getCijfer() < s2.getCijfer()) {
//                    return +1;
//                } else {
//                    return 0;
//                }
//            }
//
//        };
//    }
//
//    static Comparator<Student> StudentNummerComparator() {
//        return new Comparator<Student>() {
//
//            @Override
//            public int compare(Student s1, Student s2) {
//                if ( s1.getStudentNummer() < s2.getStudentNummer() ) {
//                    return -1;
//                }
//                if ( s1.getStudentNummer() > s2.getStudentNummer() ) {
//                    return +1;
//                } else {
//                    return 0;
//                }
//            }
//
//        };
//    }
}
