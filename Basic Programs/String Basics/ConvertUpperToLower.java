/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class ConvertUpperToLower {
    
    public static void main(String[] args) {
        
        String Str;
        
        Scanner Sc = new Scanner(System.in);
        
        System.out.print("\n Enter String : ");
        Str = Sc.nextLine();
        
        System.out.println("\n String In Lower Case : "+Str.toLowerCase());
        
    }
    
}
