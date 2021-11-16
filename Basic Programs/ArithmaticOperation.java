/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmatic.operation;

import java.lang.*;
/**
 *
 * @author Abhishek
 */
public class ArithmaticOperation {

    /**
     * @param args the command line arguments
     */
    
    
     // Non-Static Method/Member Function
    public int add(int N1,int N2){
        
        return  N1+N2;
    }                                                       
    
    // Static Member Function 
    static int sub(int N1,int N2){
        
        return  N1-N2;
    }                                                       
    
    int Mult(int N1,int N2){
          
        return N1*N2;
    }
    
    int Div(int N1,int N2){
        
        return N1/N2;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int res = 0;
        int iNo1 = 50 , iNo2 = 20;
        
        System.out.println("Arithmatic Operations : \n");
        ArithmaticOperation Obj = new ArithmaticOperation();
         
        System.out.print("------------------------------------------------------------\n\n");
        
        System.out.println("\tAddition Of "+ iNo1 + " & " +iNo2 + " = "+Obj.add(iNo1,iNo2));
        System.out.println("\tSubstraction Of "+iNo1+" & "+iNo2+" = "+sub(iNo1,iNo2));
        System.out.println("\tMultiplication Of "+iNo1+" & "+iNo2+" = "+Obj.Mult(iNo1,iNo2));
        System.out.println("\tDivision Of "+iNo1+" & "+iNo2+" = "+Obj.Div(iNo1, iNo2));
        
        System.out.println("\n------------------------------------------------------------\n");
    }
    
}
