package com.company;


import com.company.SoiceStudent.SOICE_Student;
import com.company.SolStudent.SOL_Student;

public class InheritanceDemo {

     public static void main(String[] args){
         m(new SOICE_Student("Komosh_2", 21, 32, 4 ,48 ,88));
         m(new SOL_Student("Komosh", 11, 15, 16 ,171 ,55));
         m(new Student("Komosh_0", 15, 12, 33));
     }
     public static void m(Student student) {
         System.out.println("Total Score is " + student.total_Score());
     }

}





