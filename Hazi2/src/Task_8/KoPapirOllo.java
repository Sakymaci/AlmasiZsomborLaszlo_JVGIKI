/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task_8;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Saky
 */
public class KoPapirOllo {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        String line = "";
        
        Random random = new Random();
        
        String[] tomb =  {"Rock", "Paper", "Scissors"};
        
        System.out.print("Your move (until \"Finish\" is typed): ");
        
        while(!line.equals("Finish")){
            line = sc.nextLine();
            int cpuNumber = random.nextInt(3);
            
            String cpuString = tomb[cpuNumber];
            
            System.out.println("Cpu: " + cpuString);
            if (line.equals(cpuString)){
                System.out.println("Draw!");
                continue;
            }
            
            if (line.equals("Paper") && cpuString.equals("Scissors")){
                System.out.println("PC won!");
                continue;
            }
            
            if (line.equals("Rock") && cpuString.equals("Paper")){
                System.out.println("PC won!");
                continue;
            }
            
            if (line.equals("Paper") && cpuString.equals("Scissors")){
                System.out.println("PC won!");
                continue;
            }
            
            if (line.equals("Rock") && cpuString.equals("Scissors")){
                System.out.println("You won!");
                continue;
            }
            
            if (line.equals("Scissors") && cpuString.equals("papir")){
                System.out.println("You won!");
                continue;
            }
            
            if (line.equals("Paper") && cpuString.equals("Rock")){
                System.out.println("You won!");
                continue;
            }
            System.out.print("Your move (until \"Finish\" is typed): ");    
        }
        
        System.out.println(line);
    }
    
    
            

}
