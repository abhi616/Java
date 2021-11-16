/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program.to.calculate.sum.of.three.numbers;

import java.lang.*;
import java.util.Scanner;

/**
 *
 * @author Abhishek
 */

public class ProgramToCalculateSumOfThreeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N1,N2,N3,Sum;
        
        Scanner Sc = new Scanner(System.in);
        
        System.out.print("\nEnter 1st Number : ");
        N1 = Sc.nextInt();
        
        System.out.print("\nEnter 2nd number : ");
        N2 = Sc.nextInt();
        
        System.out.print("\nEnter 3rd Number : ");
        N3 = Sc.nextInt();
        
        Sum = N1+N2+N3;
        
        System.out.println("\n\nSum Of "+N1+"+"+N2+"+"+N3+" = "+Sum+"\n");
        
    }
    
}
