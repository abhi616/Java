
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abhishek
 */
public class Convert_Given_String_Into_Uppercase {
    
    public static void main(String[] args) {
        
          String Str;
    
         Scanner Sc = new Scanner(System.in);
    
         System.out.print("\n Enter String : ");
         Str = Sc.nextLine();
      
        System.out.println("\n Uppercase String : "+Str.toUpperCase()+"\n");
    }
}
