/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author Mthetheleli Ndlovu
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Account {

    /**
     * @param args the command line arguments
     */
    static double initial_balance = 0.00;
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
       
      int [] marks = new int [5];
       
      for (int y=0; y<marks.length; y++)
      {
          System.out.println("Enter the marks");
          marks[y]= sc.nextInt();
          
         
      }
      
        System.out.println("************************************************");
        System.out.println("Mark\t\t\t\t\t\tLevel");
        for(int y=0; y<marks.length;y++)
        {
            System.out.print(marks[y]+" ");
             switch(marks[y])
          {
               case 90: case 91:case 92: case 93: case 94: case 95: case 96: case 97: case 98: case 99: case 100:
                  System.out.println("\t\t\t\t\t\t9");
                  break;
               case 80: case 81:case 82: case 83: case 84: case 85: case 86: case 87: case 88: case 89: 
                  System.out.println("\t\t\t\t\t\t8");
                  break;
               case 70: case 71:case 72: case 73: case 74: case 75: case 76: case 77: case 78: case 79:
                   System.out.println("\t\t\t\t\t\t7");
                  break;
               case 60: case 61:case 62: case 63: case 64: case 65: case 66: case 67: case 68: case 69:
                   System.out.println("\t\t\t\t\t\t6");
                   break;
               case 50: case 51:case 52: case 53: case 54: case 55: case 56: case 57: case 58: case 59: 
                   System.out.println("\t\t\t\t\t\t5");
                   break;
               case 40: case 41:case 42: case 43: case 44: case 45: case 46: case 47: case 48: case 49: 
                   System.out.println("\t\t\t\t\t\t4");
                   break;
               case 30: case 31:case 32: case 33: case 34: case 35: case 36: case 37: case 38: case 39: 
                   System.out.println("\t\t\t\t\t\t3");
                   break;
               case 20: case 21:case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29: 
                   System.out.println("\t\t\t\t\t\t2");
                   break;
               case 10: case 11:case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: 
                   System.out.println("\t\t\t\t\t\t1");
                   break;
               case 0: case 1:case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: 
                   System.out.println("\t\t\t\t\t\t0");
                   break;
               default:
                   System.out.println("\t\t\t\t\tInvalid  level");
                   break;
                     
               
          }
        }
        System.out.println(".................................................");
        int total =0;
        
        for (int t=0; t<marks.length; t++)
                {
                    total = total+marks[t];
                    
                }
        System.out.println("The total of the marks is: "+total);
        System.out.println("..................................................");
        
        int average =total/5;
        System.out.println("The avaerage of the student's marks is, "+ average);
        System.out.println("***************************************************");
        int min = marks[0];
        int max = marks[0];
        
        for(int g =0; g < marks.length; g++)
        {
            if (marks[g] < min)
            {
                min= marks[g];
            }
            
            if(marks[g]> max)
        {
            max= marks[g];
        }
            
        }
        
        
        System.out.println("The minimum mark is,"+min);
        System.out.println("The maximum mark is, "+max);
        
        
        
}
}