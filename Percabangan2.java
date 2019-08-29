/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan2;

import java.util.Scanner;

/**
 *
 * @author ica
 */
public class Percabangan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner baca = new Scanner(System.in);
    System.out.print("Nilai a ? ");
    int a = baca.nextInt();
        
        
        
        System.out.println("\nNested IF");
        if(a < 7) {
            System.out.println("nilai a kurang dari 7");
            if(a > 2)
                System.out.println("nilai a lebih dari 2");
            if(a < 4)
                System.out.println("nilai a kurang dari 4");
            
        System.out.println("\nSWITCH..CASE");
        switch(a) {
            case 1: System.out.println("nilai a => 1"); break;
            case 2: System.out.println("nilai a => 2"); break;
            case 3:
            case 4: System.out.println("nilai a => 3 atau 4"); break;
            case 5: System.out.println("nilai a => 5"); break;
            default: System.out.println("nilai a bukan antara 1-5");
                
       
        }
        }  
    }
    
}
