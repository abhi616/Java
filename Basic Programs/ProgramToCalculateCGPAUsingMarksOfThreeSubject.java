/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program.to.calculate.cgpa.using.marks.of.three.subject;

import java.lang.*;
import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class ProgramToCalculateCGPAUsingMarksOfThreeSubject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float S1,S2,S3,Cgpa;
        
        Scanner Sc = new Scanner(System.in);
        
        System.out.print("\nEnter Three Subject Marks : ");
        S1 = Sc.nextFloat();
        S2 = Sc.nextFloat();
        S3 = Sc.nextFloat();
        
        Cgpa = (S1+S2+S3)/30;
        
        System.out.print("\n Cgpa = "+Cgpa+"\n\n");
    
    }
    
}
