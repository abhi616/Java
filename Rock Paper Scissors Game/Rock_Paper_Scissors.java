/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rock_paper_scissors;
import java.lang.*;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Abhishek
 */
public class Rock_Paper_Scissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int randomNum , userNum;
        Random R = new Random();
       
        
        Scanner Sc = new Scanner(System.in);
        
        for(int i=0;i<5;i++)
        {
                System.out.println("-------------------------WELCOME--------------------------------");
                System.out.println(" 0.Rock \n 1.Paper \n 2.Scissors\n");
                randomNum = R.nextInt(3);
                System.out.print("Enter Number : ");

                userNum = Sc.nextInt();

                if(userNum<0||userNum>2)
                {
                     System.out.println("\nInvalid Choice.\n");
                    
                     System.out.println("---------------------------------------------------------");        
                     System.out.println("\nThanks For Playing Our Game...!\n");
                     
                     return;
                }

                System.out.println("\n\tComputer Random Number = "+randomNum+"\n\tYour Choice = "+userNum);

                if(randomNum==userNum)
                {
                   System.out.println("\n\tDrop...!\n");
                }
                else if(randomNum==0&&userNum==1)
                {
                    System.out.println("\n\tYou Won.\n");
                }
                else if(randomNum==0&&userNum==2)
                {
                    System.out.println("\n\tComputer Won.\n");
                }
                else if(randomNum==1&&userNum==0)
                {
                    System.out.println("\n\tComputer Won.\n");
                }
                else if(randomNum==1&&userNum==2)
                {
                    System.out.println("\n\tYou Won.\n");
                }
                else if(randomNum==2&&userNum==0)
                {
                    System.out.println("\n\tYou Won.\n");
                }
                else if(randomNum==2&&userNum==1)
                {
                    System.out.println("\n\tComputer Won.\n");
                }
         }
        
         System.out.println("---------------------------------------------------------");
         
         System.out.println("\nThanks For Playing Our Game...!\n");
    }
    
}
